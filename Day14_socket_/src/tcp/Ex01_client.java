package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex01_client {
	public static void main(String[] args) throws Exception {
		//서버에 대한 정보가 필요
		//: ip번호와 포트번호가 필요
		//192.168.42.91, 12345
		
		Socket sock = new Socket("192.168.42.91", 12345); //소켓에 대해 통신
		System.out.println("클라이언트 실행 !!");
		//실행 시 서버의 accept와 만남
		
		//상대 사용자가 누군지 알아야 응답 메세지를 보낼 수 있음
		
		OutputStream os = sock.getOutputStream(); //데이터를 전송할 수있는 스트림을 하나 만들겠습니다. 
		
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력"); // 사용자의 데이터를 받아서 전송
		int data = input.nextInt();
		
		os.write(data);
		os.close(); sock.close();
	}

}
