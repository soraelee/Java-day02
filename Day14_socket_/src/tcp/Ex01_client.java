package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex01_client {
	public static void main(String[] args) throws Exception {
		//������ ���� ������ �ʿ�
		//: ip��ȣ�� ��Ʈ��ȣ�� �ʿ�
		//192.168.42.91, 12345
		
		Socket sock = new Socket("192.168.42.91", 12345); //���Ͽ� ���� ���
		System.out.println("Ŭ���̾�Ʈ ���� !!");
		//���� �� ������ accept�� ����
		
		//��� ����ڰ� ������ �˾ƾ� ���� �޼����� ���� �� ����
		
		OutputStream os = sock.getOutputStream(); //�����͸� ������ ���ִ� ��Ʈ���� �ϳ� ����ڽ��ϴ�. 
		
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է�"); // ������� �����͸� �޾Ƽ� ����
		int data = input.nextInt();
		
		os.write(data);
		os.close(); sock.close();
	}

}
