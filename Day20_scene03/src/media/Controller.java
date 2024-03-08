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
	
	MediaPlayer mediaPlay; //���� ������ ������ �� ���� : ������ mediaPlayer�� �ø���, �װ� MediaView�� �ø�
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
					Media media = new Media(file.toURI().toString()); //���������� media�� �ҷ����� ����
					mediaPlay = new MediaPlayer(media);
					System.out.println(mediaPlay);
					mediaView.setMediaPlayer(mediaPlay);
					
					mediaPlay.setOnReady(()->{
						btnPlay.setDisable(false); //Ȱ��ȭ
						btnPause.setDisable(true); //��Ȱ��ȭ
						btnStop.setDisable(true); //��Ȱ��ȭ
						setTime();
					});
					mediaPlay.setOnPlaying(()-> {
						btnPlay.setDisable(true); //��Ȱ��ȭ
						btnPause.setDisable(false); //Ȱ��ȭ
						btnStop.setDisable(false); //Ȱ��ȭ
					});
					mediaPlay.setOnPaused(()->{
						btnPlay.setDisable(false); //Ȱ��ȭ
						btnPause.setDisable(true); //��Ȱ��ȭ
						btnStop.setDisable(false); //Ȱ��ȭ
					});
					mediaPlay.setOnStopped(()->{
						btnPlay.setDisable(false); //Ȱ��ȭ
						btnPause.setDisable(true); //��Ȱ��ȭ
						btnStop.setDisable(true); //��Ȱ��ȭ
					});
					mediaPlay.setOnEndOfMedia(()->{
						btnPlay.setDisable(false); //Ȱ��ȭ
						btnPause.setDisable(true); //��Ȱ��ȭ
						btnStop.setDisable(true); //��Ȱ��ȭ
						mediaPlay.stop();
						mediaPlay.seek(mediaPlay.getStartTime()); //��� ������ ���� �� �ʱ�ȭ X - ó�� �ð����� �ʱ�ȭ 
					});
				});
	}
	private void setTime() {
		mediaPlay.currentTimeProperty().addListener((obj, preValue, newValue)->{ // �̵�� �����ϸ� ��� ����
			double currentTime = mediaPlay.getCurrentTime().toSeconds();
			double totalTime = mediaPlay.getTotalDuration().toSeconds();
			//�帣�½ð� (����) / �����ð�
			double mediaTime = currentTime / totalTime;
			progressBar.setProgress(mediaTime);
			progressIndicator.setProgress(mediaTime);
			labelTime.setText((int)currentTime + " / " + (int)totalTime + " sec");
		});
	}
	public void playFunc() {
		System.out.println("���");
		mediaPlay.play();
	}
	public void pauseFunc() {
		System.out.println("�Ͻ�����");
		mediaPlay.pause();
	}
	public void stopFunc() {
		System.out.println("����");
		mediaPlay.stop();
	}
	public void slideFunc() {
		//���콺 �巡�� �̺�Ʈ�� ���� -> ���콺�� �����̸� ��µ�
		System.out.println(sliderVolume.getValue() / 100); //�Ҹ��� 1�� ���� ū �Ҹ��� => /100
		mediaPlay.setVolume(sliderVolume.getValue() / 100);
		}
}
