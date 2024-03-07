package javaFx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class QuizMainclass extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		FlowPane flowPane = new FlowPane();
		flowPane.setVgap(10);
		flowPane.setHgap(20);
		for (int i = 0; i < 10 ; i++) {
			Button btn = new Button();
			String txt = "¹öÆ°" + (i + 1) ;
			btn.setText(txt);
			
			flowPane.getChildren().add(btn);
			
		}
		Scene sc = new Scene(flowPane);
		
		arg0.setScene(sc);
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
