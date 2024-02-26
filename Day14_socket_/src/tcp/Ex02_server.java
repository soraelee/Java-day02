package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex02_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(10000);
		System.out.println("���� ���......");
		Socket sock = server.accept();
		System.out.println(sock.getInetAddress());
		//������� ������ ��� 
		
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String readData = dis.readUTF();
		//������� ���ڿ��� ����
		
		System.out.println("���� ������ : " + readData);
		
		//Ŭ���̾�Ʈ�� ���� �޼��� ����
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ŭ���̾�Ʈ�� ������ ������ �Է�");
		String sendData = input.next();
		dos.writeUTF(sendData);
		
		dis.close();in.close();
		dos.close(); out.close();
		sock.close();server.close();
	}

}
