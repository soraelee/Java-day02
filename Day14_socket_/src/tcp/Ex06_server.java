package tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex06_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		while(true) {
			System.out.println("������ ��ٸ��ϴ�");
			Socket s = server.accept();
			System.out.println(s.getInetAddress() + "�� ����");
			new Ex06_serverThread(s); // ���� ������ ��ü ����
		}
		
	}

}
