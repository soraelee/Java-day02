package scene01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		//scene builder���� fxml ���� �ҷ��ͼ� ����ϱ�
		
		System.out.println(getClass().getResource("scene01.fxml")); //������ ��ġ �ҷ�����
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("scene01.fxml"));
		
		//pane���� �θ�μ� ��� ����
		Parent root = loader.load(); 
		
		
		//anchor pan���� �����Ͽ��� ������ �޾ƿ���
//		AnchorPane root = loader.load();
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
