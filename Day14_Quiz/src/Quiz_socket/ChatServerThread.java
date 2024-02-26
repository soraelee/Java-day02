package Quiz_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerThread extends Thread{
	private static ArrayList<Socket> arr;
	static {
		arr = new ArrayList<>();
	}
	private Socket s;
	public ChatServerThread(Socket s) {
		arr.add(s);
		this.s = s;
		start();
	}
	public void run() {
		try {
			
				InputStream in = s.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				while(true) { //메세지를 반복적으로 받기
					String msg = dis.readUTF();
				
					for (Socket s : arr) { //받은 메세지를 모든 접속자에게 전달하기
						OutputStream out = s.getOutputStream();
						DataOutputStream dos = new DataOutputStream(out);
						
						dos.writeUTF(msg);
				}
				
			}
			
			
		} catch (Exception e) {
		}
		
	}

}
