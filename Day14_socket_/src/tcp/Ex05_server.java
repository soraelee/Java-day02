package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

class Ex05_Thread extends Thread {
	public static int num = 1;
	private Socket sock;
	
	public Ex05_Thread(Socket sock) {
		this.sock = sock;
		start();
	}//������ 
	
	@Override
	public void run() {
		/*
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		num ++;
		InputStream in;
		String readData = null;
		System.out.println(num + "��° Ŭ���̾�Ʈ ����");
		while(true) {
		try {
			in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			readData = dis.readUTF();
			System.out.println("���� ������ : " + readData);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		}
		
	}
}


public class Ex05_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		//�����带 ����ϱ�
		//���� �ִ� ������ ���
		while (true) {
			Socket sock = server.accept();
			new Ex05_Thread(sock); //������ ��ü ���� ����
		}
		//�������� ������ ����� ��� ��� ������ ��Ǳ� �������� ��� �Ұ�
		
	}
}
