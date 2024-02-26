package Quiz_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class socket02 {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12344);
		
		System.out.println("접속 대기 중 ");
		
		Socket sock = server.accept();
		
		System.out.println("접속 완료");
		
		InputStream in = sock.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(in);
		
		DTO02 dto = (DTO02)ois.readObject();
		
		System.out.println("이름 : " + dto.getName());
		System.out.println("나이 : " + dto.getAge());
		System.out.println("주소 : " + dto.getAddr());
		
		ois.close(); in.close(); sock.close();server.close();
		
	}

}
