package ex01;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class Controller {
	@FXML public TextField tf;// ���� ������ ��� ��� ���� -- text field�� ���� ��ü�� ����
	@FXML public TextField tf02;
	public void btnFunc ( ) {  //�ش� �Լ��� �ݵ�� ��ư ������ ������ �̸����� �ؾ� ��
		System.out.println("��ư Ŭ�� !");
//		System.out.println("tf : " + tf.getText()); //����ڰ� �Է��� ���� ������ �� ���
//		tf.setText(""); //��ư�� ������ �ش��ϴ� ���� ��� �� text field�� �ƹ��͵� ������ ������� ��
		
		String msg = tf02.getText();
		tf.setText(msg);
		
		//�˸�
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("alert ���Դϴ�.");
		alert.setHeaderText("�Ӹ���");
		alert.setContentText("������ �߻��߽��ϴ�.");
		alert.show();
	}
	//�Է°� �������� -- id Ȱ��(tf)

}
