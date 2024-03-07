package boarderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainClass02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox(); //���ι�ġ
//		VBox vbox = new VBox(); //���ι�ġ
		Button[] btns = new Button[3];
		for (int i = 0; i <btns.length ; i++) {
			btns[i] = new Button("btn_" + i) ;
		}
		hbox.getChildren().addAll(btns);
		hbox.setStyle("-fx-background-color : pink;"); //��������
		hbox.setPrefSize(10, 50); // ���� ���� ���� ����(�⺻border ��������)
		
		BorderPane bp = new BorderPane();
		bp.setTop(hbox);
		
		VBox vbox = new VBox();
		vbox.getChildren().add(new Label("�� �߰�"));
		vbox.getChildren().add(new Button("��ư �߰�"));
		vbox.setStyle("-fx-background-color:yellow;");
		
		bp.setLeft(vbox);
		arg0.setResizable(false); //������ ���� �ð�
		
		arg0.setScene(new Scene(bp, 200, 100));
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

}
