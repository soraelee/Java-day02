package javaFx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{ //추상화 되어 있기 때문에 overriding 필요

	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println("start 실행");
		Label lb = new Label(); //프로그램 안에 내용 작성
		lb.setFont(new Font(30)); //텍스트 폰트 크기 작성
		lb.setText("안녕하세요"); //텍스트 내용 작성
		
		Scene scene = new Scene(lb, 300, 200); //scene의 가로 세로 크기
		arg0.setScene(scene);
		
		
		arg0.setTitle("제목을 설정합니다");
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args); // 해당 메소드를 실행해야 start가 실행 됨
	}

}
