package ex01;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class Controller {
	@FXML public TextField tf;// 파일 연동한 경우 사용 가능 -- text field에 대한 객체를 얻어옴
	@FXML public TextField tf02;
	public void btnFunc ( ) {  //해당 함수는 반드시 버튼 설정시 설정한 이름으로 해야 함
		System.out.println("버튼 클릭 !");
//		System.out.println("tf : " + tf.getText()); //사용자가 입력한 값을 가져올 때 사용
//		tf.setText(""); //버튼을 누르면 해당하는 내용 출력 후 text field에 아무것도 없도록 사라지게 함
		
		String msg = tf02.getText();
		tf.setText(msg);
		
		//알림
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("alert 참입니다.");
		alert.setHeaderText("머릿글");
		alert.setContentText("문제가 발생했습니다.");
		alert.show();
	}
	//입력값 가져오기 -- id 활용(tf)

}
