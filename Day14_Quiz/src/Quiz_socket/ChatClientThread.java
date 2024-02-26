package Quiz_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientThread extends Thread{
	private Socket sock;
	public ChatClientThread(Socket sock) {
		this.sock = sock;
		start();
	}
	public void run() {
		
		
		try {
			InputStream in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			while (true) { //�޼��� ���ŵ� �ݺ����� ���� �Է� �� ��� �޾ƾ� ��
				String msg = dis.readUTF();
				System.out.println("���� �޼��� : " + msg);
			}
			
		} catch (Exception e) {
		}
		
	}

}
