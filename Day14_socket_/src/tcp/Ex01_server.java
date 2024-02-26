package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345); //��Ʈ��ȣ
		//�ش� ������ ������ �� ��Ʈ��ȣ : 12345
		//��Ʈ ��ȣ => 2byte�������� �ۼ��ϱ�
		//�츮 �Ǿ��� ip�� ��Ʈ��ȣ�� ������ �� ����
		
		System.out.println("������ ��ٸ��ϴ�!!");
		
		Socket sock = server.accept(); //Ŭ���̾�Ʈ�κ��� ������ ������ ����ϴ� ��� //�Ͻ�����
		//���� ���� ���� - Ŭ���̾�Ʈ�� ������ ���� ���
		
		System.out.println("Ŭ���̾�Ʈ ������ �Ǿ����ϴ�.");
		
		InputStream is = sock.getInputStream();
		int readData = is.read();
		System.out.println("���� ������ : " + readData);
		
		is.close(); sock.close(); server.close();
		
	
	}

}
