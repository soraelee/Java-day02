package Quiz_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class socket02 {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12344);
		
		System.out.println("���� ��� �� ");
		
		Socket sock = server.accept();
		
		System.out.println("���� �Ϸ�");
		
		InputStream in = sock.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(in);
		
		DTO02 dto = (DTO02)ois.readObject();
		
		System.out.println("�̸� : " + dto.getName());
		System.out.println("���� : " + dto.getAge());
		System.out.println("�ּ� : " + dto.getAddr());
		
		ois.close(); in.close(); sock.close();server.close();
		
	}

}
