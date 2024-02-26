package Quiz_socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("127.0.0.1", 45678);
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		Scanner input = new Scanner(System.in);
		System.out.print("메세지 : ");
		String msg = input.next();
		dos.writeUTF(msg);
		
		//서버의 메세지 받기
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String readMsg = dis.readUTF();
		
		System.out.println("서버 메세지 : " + readMsg);
		
		dis.close(); in.close();
		dos.close(); out.close(); sock.close();
	}

}
