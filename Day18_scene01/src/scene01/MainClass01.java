package scene01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		//scene builder에서 fxml 파일 불러와서 사용하기
		
		System.out.println(getClass().getResource("scene01.fxml")); //파일의 위치 불러오기
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("scene01.fxml"));
		
		//pane들의 부모로서 사용 가능
		Parent root = loader.load(); 
		
		
		//anchor pan으로 구성하였기 때문에 받아오기
//		AnchorPane root = loader.load();
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
