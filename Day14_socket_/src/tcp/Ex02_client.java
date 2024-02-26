package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex02_client {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("127.0.0.1", 10000);
		//�ڱ��ڽ��� pc���� ǥ�� : 127.0.0.1
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		Scanner input = new Scanner(System.in);
		System.out.println("������ ���ڿ� �Է�");
		String data = input.next();
		
		dos.writeUTF(data); //����ڰ� ���� ���ڿ��� ����
		
		//������ ���� �޼��� �ޱ�
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String readData = dis.readUTF();
		System.out.println("���� ������ : " + readData);
		
		dos.close();out.close();
		dis.close(); in.close();
		sock.close();
		
	}

}
