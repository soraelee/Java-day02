package member.main;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.url.URLService;
import member.controller.MemberController;

public class MemberMain {
	public void viewFx() {
		//stage를 하나 더 만들어서 열기
		Stage memberStage = new Stage();
		Parent root = null;
		try {
			//기존에는 throw로 처리한 것을 try catch로 표현
			URL url = new URL(URLService.fxPath + "member/fxml/member.fxml");
			//fxpath : 현재 프로젝트위치 + member
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		memberStage.setScene(scene);
		memberStage.show();
		
		
	}
	public void viewFx(Parent root) { 
		//기존의 창에서 회원가입창으로 변경하기
		Stage memberStage = (Stage)root.getScene().getWindow();

		try {
			//기존에는 throw로 처리한 것을 try catch로 표현
			URL url = new URL(URLService.fxPath + "member/fxml/member.fxml");
			//fxpath : 현재 프로젝트위치 + member
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
			MemberController ctrl = loader.getController();
			ctrl.setRoot(root); //root 값을 전달해주는 용도 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		memberStage.setScene(scene);
		memberStage.show();

	}
}

	
