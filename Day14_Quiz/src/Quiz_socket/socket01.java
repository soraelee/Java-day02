package Quiz_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class socket01 {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(45678);
		
		System.out.println("���� ��ٸ�");
		
		Socket sock = server.accept();
		
		System.out.println("�����Ͽ����ϴ�. ");
		
		//Ŭ���̾�Ʈ�� �޼��� �ޱ�
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String readMsg = dis.readUTF();
		
		System.out.println("���� �޼��� : " + readMsg);
		
		
		//Ŭ���̾�Ʈ���� �޼��� ������
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		Scanner input = new Scanner(System.in);
		System.out.print("�߽� �޼��� : ");
		String msg = input.next();
		dos.writeUTF(msg);		
		
		dos.close(); out.close();
		dis.close(); in.close(); sock.close(); server.close();
		
	}
}
