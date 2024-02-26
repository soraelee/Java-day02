package Quiz_socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient01 {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("127.0.0.1", 12345);
		
		Scanner input = new Scanner(System.in);
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);

		new ChatClientThread(sock);
		while (true) {
			System.out.println("메세지 : "); //메세지를 계속 전송할 것이므로 반복문 활용
			String msg = input.next();
			dos.writeUTF(msg);
		}
			
		
	}

}
