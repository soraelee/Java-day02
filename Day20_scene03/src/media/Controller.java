package media;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controller implements Initializable{
	@FXML public ListView<String> listView;
	@FXML public MediaView mediaView;
	@FXML public Button btnPlay;
	@FXML public Button btnPause;
	@FXML public Button btnStop;
	@FXML public ProgressBar progressBar;
	@FXML public ProgressIndicator progressIndicator;
	@FXML public Label labelTime;
	@FXML public Slider sliderVolume;
	
	MediaPlayer mediaPlay; //영상 동작을 조작할 수 있음 : 영상을 mediaPlayer에 올리고, 그걸 MediaView에 올림
	ObservableList<String> mediaList;
	String path;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		path = Paths.get("").toAbsolutePath().toString();
		path += "/src/resource/media";
		File fileList = new File(path);
		mediaList = FXCollections.observableArrayList();
		for (String f : fileList.list()) {
			mediaList.add(f);
		}
		listView.setItems(mediaList);
		setMedia();
	}
	public void setMedia() {
		listView.getSelectionModel().selectedIndexProperty().addListener(
				(obj, preValue, newValue)->{
//					path = path + "/" + mediaList.get((int)newValue);
					File file = new File(path + "/" + mediaList.get((int)newValue));
					Media media = new Media(file.toURI().toString()); //실질적으로 media를 불러오는 역할
					mediaPlay = new MediaPlayer(media);
					System.out.println(mediaPlay);
					mediaView.setMediaPlayer(mediaPlay);
					
					mediaPlay.setOnReady(()->{
						btnPlay.setDisable(false); //활성화
						btnPause.setDisable(true); //비활성화
						btnStop.setDisable(true); //비활성화
						setTime();
					});
					mediaPlay.setOnPlaying(()-> {
						btnPlay.setDisable(true); //비활성화
						btnPause.setDisable(false); //활성화
						btnStop.setDisable(false); //활성화
					});
					mediaPlay.setOnPaused(()->{
						btnPlay.setDisable(false); //활성화
						btnPause.setDisable(true); //비활성화
						btnStop.setDisable(false); //활성화
					});
					mediaPlay.setOnStopped(()->{
						btnPlay.setDisable(false); //활성화
						btnPause.setDisable(true); //비활성화
						btnStop.setDisable(true); //비활성화
					});
					mediaPlay.setOnEndOfMedia(()->{
						btnPlay.setDisable(false); //활성화
						btnPause.setDisable(true); //비활성화
						btnStop.setDisable(true); //비활성화
						mediaPlay.stop();
						mediaPlay.seek(mediaPlay.getStartTime()); //재생 내용이 멈춘 후 초기화 X - 처음 시간으로 초기화 
					});
				});
	}
	private void setTime() {
		mediaPlay.currentTimeProperty().addListener((obj, preValue, newValue)->{ // 미디어 실행하면 계속 동작
			double currentTime = mediaPlay.getCurrentTime().toSeconds();
			double totalTime = mediaPlay.getTotalDuration().toSeconds();
			//흐르는시간 (현재) / 최종시간
			double mediaTime = currentTime / totalTime;
			progressBar.setProgress(mediaTime);
			progressIndicator.setProgress(mediaTime);
			labelTime.setText((int)currentTime + " / " + (int)totalTime + " sec");
		});
	}
	public void playFunc() {
		System.out.println("재생");
		mediaPlay.play();
	}
	public void pauseFunc() {
		System.out.println("일시정지");
		mediaPlay.pause();
	}
	public void stopFunc() {
		System.out.println("중지");
		mediaPlay.stop();
	}
	public void slideFunc() {
		//마우스 드래그 이벤트를 받음 -> 마우스가 움직이면 출력됨
		System.out.println(sliderVolume.getValue() / 100); //소리는 1이 가장 큰 소리ㅜ => /100
		mediaPlay.setVolume(sliderVolume.getValue() / 100);
		}
}
