package gridPane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainClass03 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridpane  = new GridPane();
		
		//병합
		gridpane.add(new Button("Button"), 0, 0);
		gridpane.add(new Button("B1, B0"), 1, 0);
		gridpane.add(new Label("L0, L1"), 0, 1);
		gridpane.add(new Label("Label"), 1, 1);
		
		FlowPane fp = new FlowPane();
		fp.getChildren().add(new Button("merge col(0), row(2)"));
		fp.setAlignment(Pos.CENTER);
		fp.setStyle("-fx-background-color:black;");
		gridpane.add(fp, 0, 2, 2, 1); // 병합 내용 : grid에서 위치 상관없이 병햡된 row를 사용 가능
		
		arg0.setScene(new Scene(gridpane, 300, 300));
		arg0.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

}
