package tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex06_client01 {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("127.0.0.1", 12345);
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		Scanner input = new Scanner(System.in);
		String msg = null;
		
		new Ex06_clientThread(sock);
		
		while (true) {
			System.out.println("���� ������ �Է�");
			msg = input.next();
			dos.writeUTF(msg);
		} //���� ���� �ޱ� �������� �ۼ��� �Ұ� => ���� �κ��� ������� ó��
		
	}

}
