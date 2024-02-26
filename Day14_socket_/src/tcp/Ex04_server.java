package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		
		System.out.println("접속 대기");
		Socket sock = server.accept();
		System.out.println("접속되었음");
		
		//데이터 수신
		InputStream in = sock.getInputStream();
		//객체를 받기 때문에 object를 사용
		ObjectInputStream ois = new ObjectInputStream(in);
		
		Ex04_DTO dto = (Ex04_DTO)ois.readObject();
		
		System.out.println("수신 name : " + dto.getName());
		System.out.println("수신 addr : " + dto.getAddr());
		
		ois.close();in.close();sock.close();server.close();
	}
}
