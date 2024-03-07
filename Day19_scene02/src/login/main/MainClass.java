package login.main;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.controller.Controller;
import login.url.URLService;

public class MainClass extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
//		System.out.println(getClass().getResource("")); //��ġ ��������
//		//��Ű���� �ٸ� ��� ��θ� ����� ���
//		System.out.println(Paths.get("").toAbsolutePath().toString());
//		System.out.println("file:/" + Paths.get("").toAbsolutePath().toString());
//		System.out.println("file:/" + Paths.get("").toAbsolutePath().toString() + "/bin/login/fxml/Login.fxml");
		//�ش� ��ġ�κ��� ���
		
		URL url = new URL(URLService.fxPath + "login/fxml/Login.fxml"); //url �������̽��� �����Ͽ� ���������� ����ϰԲ� ��
		
		FXMLLoader loader = new FXMLLoader(url);
		//url ��ü�η� �޾ƾ���
		Parent root = loader.load(); //�ε� �� controller ��ü ����
		
		Controller ctrl = loader.getController(); //�ش� controller ��ü�� �ҷ���(new ��� x �츮�� ���� scene builder ���� �ҷ��;� ��)
		ctrl.setRoot(root); //root = ��Ŀ������ ���� ������ ������ - ��� ���� ������ ��ü
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

}
