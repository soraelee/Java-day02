package tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex06_client02 {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("127.0.0.1", 12345);
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		Scanner input = new Scanner(System.in);
		String msg = null;
		
		new Ex06_clientThread(sock);
		
		while (true) {
			System.out.println("전송 데이터 입력");
			msg = input.next();
			dos.writeUTF(msg);
			System.out.println("발신 했음");
		} //값이 전송 받기 전깨지는 작성이 불가 => 수신 부분을 스레드로 처리
		
	}
}
