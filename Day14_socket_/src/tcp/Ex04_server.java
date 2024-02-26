package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		
		System.out.println("���� ���");
		Socket sock = server.accept();
		System.out.println("���ӵǾ���");
		
		//������ ����
		InputStream in = sock.getInputStream();
		//��ü�� �ޱ� ������ object�� ���
		ObjectInputStream ois = new ObjectInputStream(in);
		
		Ex04_DTO dto = (Ex04_DTO)ois.readObject();
		
		System.out.println("���� name : " + dto.getName());
		System.out.println("���� addr : " + dto.getAddr());
		
		ois.close();in.close();sock.close();server.close();
	}
}
