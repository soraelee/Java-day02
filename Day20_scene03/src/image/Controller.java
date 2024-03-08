package image;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable{
	@FXML public ListView<String> listView;
	@FXML public ImageView imageView;
	
	//리스트 추가
	ObservableList<String> imageArr;
	String path;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		path = Paths.get("").toAbsolutePath().toString(); //절대경로를 얻어와서 문자열화
//		System.out.println("path : " + path);
		path += "/src/resource/images";
		File fileList = new File(path);
		imageArr = FXCollections.observableArrayList();
		for(String p : fileList.list()) { //list : string 배열로 가져옴
			imageArr.add(p);
		}
		listView.setItems(imageArr); //setItems에 observablelist가 사용되기 때문에 해당 리스트 생성
		
		setListEvent(); //버튼을 누르지 않아도 버튼을 누른 것 처럼 바로 이미지가 뜨도록 하는 이벤트 설정
	}
	private void setListEvent() {
		
		listView.getSelectionModel().selectedIndexProperty().addListener((a, b, c)->{
			//람다식 사용 
			//람다식 : 인테페이스를 객체로 받는 경우 오버라이딩 하지 않고 사용할 수 있음
			//ChangeListener를 받음(인터페이스 형태)
			//객체정보, 이전에 선택한 인덱스, 현재 선택한 인덱스
			System.out.println("객체 : " + a);
			System.out.println("이전 인덱스 : " + b);
			System.out.println("현재 인덱스 : " + c); //자동으로 해당 인덱스를 받음
			setImageView((int)c);
		}); 
	}
	private void setImageView(int index) {
//		"file:/" + path + "/" + imageArr.get(index);
		File file = new File(path + "/" +imageArr.get(index));
		System.out.println(file.toURI().toString()); //파일을 붙여서 경로를 만들어줌
		Image img = new Image(file.toURI().toString());
		
		imageView.setImage(img);
	}
	
	public void indexFunc() {
//		System.out.println(listView.getSelectionModel().getSelectedIndex()); //해당 리스트의 인덱스 값 (0~)
		int index = listView.getSelectionModel().getSelectedIndex();
		System.out.println(imageArr.get(index)); //각 인덱스에 맞는 값 불러오기
		System.out.println(path);

		setImageView(index);
	}
	

}
