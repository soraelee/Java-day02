package javaFx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{ //�߻�ȭ �Ǿ� �ֱ� ������ overriding �ʿ�

	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println("start ����");
		Label lb = new Label(); //���α׷� �ȿ� ���� �ۼ�
		lb.setFont(new Font(30)); //�ؽ�Ʈ ��Ʈ ũ�� �ۼ�
		lb.setText("�ȳ��ϼ���"); //�ؽ�Ʈ ���� �ۼ�
		
		Scene scene = new Scene(lb, 300, 200); //scene�� ���� ���� ũ��
		arg0.setScene(scene);
		
		
		arg0.setTitle("������ �����մϴ�");
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args); // �ش� �޼ҵ带 �����ؾ� start�� ���� ��
	}

}
