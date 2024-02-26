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
			while (true) { //메세지 수신도 반복문을 통해 입력 시 계속 받아야 함
				String msg = dis.readUTF();
				System.out.println("수신 메세지 : " + msg);
			}
			
		} catch (Exception e) {
		}
		
	}

}
