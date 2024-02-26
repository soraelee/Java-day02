package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		System.out.println("������ ��ٸ��ϴ�...");
		
		Socket sock01 = server.accept(); //ù��° ���� => sock01
		Socket sock02 = server.accept(); //�ι�° ���� => sock02
		
		System.out.println("���� �Ǿ����ϴ�!");
		
		InputStream in = sock01.getInputStream(); //sock01�� �޾Ƽ� ó��
		DataInputStream dis = new DataInputStream(in);
		
		String readData = dis.readUTF();
		System.out.println("���� ������ : " + readData);
		
		dis.close();in.close();sock01.close();sock02.close();
		server.close();
		
	}

}
