package javaFx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainClass02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		//���̾ƿ� -- ��ġ�ϰ��� �ϴ� �⺻ Ʋ
		//scene���� �ϳ��� ���븸 �ø� �� �����Ƿ� ���̾ƿ��� ����Ͽ� ��ġ
		
		FlowPane flowPane = new FlowPane();
		Label lb = new Label("���Դϴ�");
		
		Button btn01 = new Button("��ư 01");
		Button btn02 = new Button();
		btn02.setText("��ư02");
		flowPane.getChildren().add(lb); //fx���� ����ϴ� ����Ʈ
		flowPane.getChildren().add(btn01);
		flowPane.getChildren().add(btn02);
		
		Scene sc = new Scene(flowPane);
		
		arg0.setScene(sc);
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	


}
