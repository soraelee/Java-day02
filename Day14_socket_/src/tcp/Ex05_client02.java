package tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex05_client02 {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("127.0.0.1",12345);
		
		Scanner input = new Scanner(System.in);
		
		String data;
		System.out.println("���� ������ �Է�");
		data = input.next();
		
		while(true)	{
			OutputStream out = sock.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF(data);
		}
	}
}
