package member.main;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.url.URLService;
import member.controller.MemberController;

public class MemberMain {
	public void viewFx() {
		//stage�� �ϳ� �� ���� ����
		Stage memberStage = new Stage();
		Parent root = null;
		try {
			//�������� throw�� ó���� ���� try catch�� ǥ��
			URL url = new URL(URLService.fxPath + "member/fxml/member.fxml");
			//fxpath : ���� ������Ʈ��ġ + member
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		memberStage.setScene(scene);
		memberStage.show();
		
		
	}
	public void viewFx(Parent root) { 
		//������ â���� ȸ������â���� �����ϱ�
		Stage memberStage = (Stage)root.getScene().getWindow();

		try {
			//�������� throw�� ó���� ���� try catch�� ǥ��
			URL url = new URL(URLService.fxPath + "member/fxml/member.fxml");
			//fxpath : ���� ������Ʈ��ġ + member
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
			MemberController ctrl = loader.getController();
			ctrl.setRoot(root); //root ���� �������ִ� �뵵 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		memberStage.setScene(scene);
		memberStage.show();

	}
}

	
