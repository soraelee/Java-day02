package tcp;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class Ex06_clientThread extends Thread{
	Socket sock;
	public Ex06_clientThread(Socket sock) {
		this.sock = sock;
		start();
	}
	public void run() {
		try {
			InputStream in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			while (true) {
				String data = dis.readUTF();
				System.out.println("���ŵ����� : " + data);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
