package Quiz_socket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client02 {
	public static void main(String[] args) throws Exception {
		 Socket sock = new Socket("127.0.0.1", 12344);
		 
		 Scanner input = new Scanner(System.in);
		 DTO02 dto = new DTO02();
		 
		 System.out.print("�̸� �Է� : ");
		 dto.setName(input.next());
		 System.out.print("���� �Է� : ");
		 dto.setAge(input.nextInt());
		 System.out.print("�ּ� �Է� : ");
		 dto.setAddr(input.next());
		 
		 OutputStream out = sock.getOutputStream();
		 ObjectOutputStream oos = new ObjectOutputStream(out);
		 
		 oos.writeObject(dto);
		 oos.close(); out.close(); sock.close();
		
	}

}
