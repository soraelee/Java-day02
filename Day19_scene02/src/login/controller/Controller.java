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

public class Controller implements Initializable{ //초기화하는 메소드 제공
	@FXML public TextField fxId;
	@FXML public TextField fxPwd;
	Parent root;
	
	LoginService ls;
	
	public void setRoot(Parent root) {
		this.root =  root; //하나의 팬으로 만들고 scene을 만들고 이에 대한 stage를 불러올 수 있음 -> 열고 닫을 수 있음
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ls = new LoginServiceImpl(); //초기화 메소드 내에서 객체 생성 진행
		System.out.println("초기화 메소드");
	}
	
	public void loginFunc () { // 로그인기능
		ls.loginFunc(fxId, fxPwd);
		
		System.out.println("확인 버튼 클릭");
		
	}
	public void cancleFunc() {
		System.out.println("취소 버튼 클릭");
		ls.cancleFunc(root);
		
	}
	public void registerFunc() {
		System.out.println("회원가입 클릭");
//		ls.registerFunc();
		ls.registerFunc(root);
	}
	
	
	
	
	

}
