package Quiz_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		System.out.println("������ ��ٸ��� ��");
		
		while (true) { //�����ڸ� ���� �ݺ���
			Socket sock = server.accept();
			System.out.println(sock.getInetAddress() + "�� ����");
			//��ü ��
			new ChatServerThread(sock); 
			
		}
	}

}
