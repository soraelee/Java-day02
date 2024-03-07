package login.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import login.dao.LoginDAO;
import login.dto.LoginDTO;
import login.service.LoginService;
import login.service.LoginServiceImpl;

public class Controller implements Initializable{ //�ʱ�ȭ�ϴ� �޼ҵ� ����
	@FXML public TextField fxId;
	@FXML public TextField fxPwd;
	Parent root;
	
	LoginService ls;
	
	public void setRoot(Parent root) {
		this.root =  root; //�ϳ��� ������ ����� scene�� ����� �̿� ���� stage�� �ҷ��� �� ���� -> ���� ���� �� ����
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ls = new LoginServiceImpl(); //�ʱ�ȭ �޼ҵ� ������ ��ü ���� ����
		System.out.println("�ʱ�ȭ �޼ҵ�");
	}
	
	public void loginFunc () { // �α��α��
		ls.loginFunc(fxId, fxPwd);
		
		System.out.println("Ȯ�� ��ư Ŭ��");
		
	}
	public void cancleFunc() {
		System.out.println("��� ��ư Ŭ��");
		ls.cancleFunc(root);
		
	}
	public void registerFunc() {
		System.out.println("ȸ������ Ŭ��");
//		ls.registerFunc();
		ls.registerFunc(root);
	}
	
	
	
	
	

}
