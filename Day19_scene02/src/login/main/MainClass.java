package login.main;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.controller.Controller;
import login.url.URLService;

public class MainClass extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
//		System.out.println(getClass().getResource("")); //위치 가져오기
//		//패키지가 다른 경우 경로를 만들어 사용
//		System.out.println(Paths.get("").toAbsolutePath().toString());
//		System.out.println("file:/" + Paths.get("").toAbsolutePath().toString());
//		System.out.println("file:/" + Paths.get("").toAbsolutePath().toString() + "/bin/login/fxml/Login.fxml");
		//해당 위치로부터 사용
		
		URL url = new URL(URLService.fxPath + "login/fxml/Login.fxml"); //url 인터페이스에 연결하여 유동적으로 사용하게끔 함
		
		FXMLLoader loader = new FXMLLoader(url);
		//url 객체로로 받아야함
		Parent root = loader.load(); //로드 시 controller 객체 생성
		
		Controller ctrl = loader.getController(); //해당 controller 객체를 불러옴(new 사용 x 우리가 만든 scene builder 값을 불러와야 함)
		ctrl.setRoot(root); //root = 앵커팬으로 만든 내용을 가져옴 - 모든 값을 가지는 객체
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

}
