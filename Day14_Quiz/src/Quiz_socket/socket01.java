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
		
		System.out.println("접속 기다림");
		
		Socket sock = server.accept();
		
		System.out.println("접속하였습니다. ");
		
		//클라이언트의 메세지 받기
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String readMsg = dis.readUTF();
		
		System.out.println("수신 메세지 : " + readMsg);
		
		
		//클라이언트에게 메세지 보내기
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		Scanner input = new Scanner(System.in);
		System.out.print("발신 메세지 : ");
		String msg = input.next();
		dos.writeUTF(msg);		
		
		dos.close(); out.close();
		dis.close(); in.close(); sock.close(); server.close();
		
	}
}
