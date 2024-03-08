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
	
	//����Ʈ �߰�
	ObservableList<String> imageArr;
	String path;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		path = Paths.get("").toAbsolutePath().toString(); //�����θ� ���ͼ� ���ڿ�ȭ
//		System.out.println("path : " + path);
		path += "/src/resource/images";
		File fileList = new File(path);
		imageArr = FXCollections.observableArrayList();
		for(String p : fileList.list()) { //list : string �迭�� ������
			imageArr.add(p);
		}
		listView.setItems(imageArr); //setItems�� observablelist�� ���Ǳ� ������ �ش� ����Ʈ ����
		
		setListEvent(); //��ư�� ������ �ʾƵ� ��ư�� ���� �� ó�� �ٷ� �̹����� �ߵ��� �ϴ� �̺�Ʈ ����
	}
	private void setListEvent() {
		
		listView.getSelectionModel().selectedIndexProperty().addListener((a, b, c)->{
			//���ٽ� ��� 
			//���ٽ� : �������̽��� ��ü�� �޴� ��� �������̵� ���� �ʰ� ����� �� ����
			//ChangeListener�� ����(�������̽� ����)
			//��ü����, ������ ������ �ε���, ���� ������ �ε���
			System.out.println("��ü : " + a);
			System.out.println("���� �ε��� : " + b);
			System.out.println("���� �ε��� : " + c); //�ڵ����� �ش� �ε����� ����
			setImageView((int)c);
		}); 
	}
	private void setImageView(int index) {
//		"file:/" + path + "/" + imageArr.get(index);
		File file = new File(path + "/" +imageArr.get(index));
		System.out.println(file.toURI().toString()); //������ �ٿ��� ��θ� �������
		Image img = new Image(file.toURI().toString());
		
		imageView.setImage(img);
	}
	
	public void indexFunc() {
//		System.out.println(listView.getSelectionModel().getSelectedIndex()); //�ش� ����Ʈ�� �ε��� �� (0~)
		int index = listView.getSelectionModel().getSelectedIndex();
		System.out.println(imageArr.get(index)); //�� �ε����� �´� �� �ҷ�����
		System.out.println(path);

		setImageView(index);
	}
	

}
