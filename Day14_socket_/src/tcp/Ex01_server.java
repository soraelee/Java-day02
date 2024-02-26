package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345); //포트번호
		//해당 서버를 동작할 때 포트번호 : 12345
		//포트 번호 => 2byte기준으로 작성하기
		//우리 피씨의 ip와 포트번호로 접속할 수 있음
		
		System.out.println("접속을 기다립니다!!");
		
		Socket sock = server.accept(); //클라이언트로부터 접속할 때까지 대기하는 기능 //일시중지
		//서버 소켓 생성 - 클라이언트와 소켓을 통해 통신
		
		System.out.println("클라이언트 연결이 되었습니다.");
		
		InputStream is = sock.getInputStream();
		int readData = is.read();
		System.out.println("수신 데이터 : " + readData);
		
		is.close(); sock.close(); server.close();
		
	
	}

}
