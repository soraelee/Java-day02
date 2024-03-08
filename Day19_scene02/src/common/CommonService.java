package common;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public interface CommonService {
	//모든 부분의 공통 메소드 합치기
	public static void myAlert(String msg) { //인터페이스 내 메소드 실행은 static일 경우에만 가능
		//알림 기능 합치기
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
	}
	public static void cancelFunc(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}
}
