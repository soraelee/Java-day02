package gridPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridPane = new GridPane();
		
		Button button = new Button("Button");
		
		gridPane.setRowIndex(button, 0); //세로 0번째 배치 //static이기 때문에 객체명이 아닌 클래스 이름으로 접근 가능
		GridPane.setRowIndex(button, 0); //세로 0번째 배치 //static
		
		Label label = new Label("label");
		Label label01 = new Label("label01");
		GridPane.setConstraints(label, 0, 2); //가로 0번째 세로 2번째에 추가하기
		GridPane.setConstraints(label01, 1, 1); //가로 1번째 세로 1번째에 추가
		
//		TextArea ta = new TextArea();
		
		TextField tf = new TextField();
		GridPane.setConstraints(tf, 1, 2);
		
		
		gridPane.getChildren().addAll(button, label, label01, tf);
		
		arg0.setScene(new Scene(gridPane));
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
