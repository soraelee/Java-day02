package boarderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane bp = new BorderPane();
		Button btn = new Button("Top ��ư");
		btn.setPrefSize(200, 20); //���� ����
		bp.setTop(btn);
		
		bp.setCenter(new Button("center��ư"));
		bp.setBottom(new Button("�Ʒ���ư"));
		bp.setLeft((new Button("���� ��ư")));
		bp.setRight((new Button("������ ��ư")));
		
		arg0.setScene(new Scene(bp, 300, 100));
		
		arg0.setTitle("boarder pane");
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
 
}
