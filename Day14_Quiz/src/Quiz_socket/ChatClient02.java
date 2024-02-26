package Quiz_socket;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient02 {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("127.0.0.1", 12345);
		
		Scanner input = new Scanner(System.in);
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		new ChatClientThread(sock);
		while (true) {
			System.out.println("메세지 : "); //메세지를 계속 접속할 것이므로 반복문 활용
			String msg = input.next();
			dos.writeUTF(msg);
		}
		
	}

}
