package Quiz_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		System.out.println("접속을 기다리는 중");
		
		while (true) { //접속자를 위한 반복문
			Socket sock = server.accept();
			System.out.println(sock.getInetAddress() + "님 접속");
			//객체 온
			new ChatServerThread(sock); 
			
		}
	}

}
