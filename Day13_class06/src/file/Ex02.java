package file;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception { //����ó���ϵ��� ��
		Scanner input = new Scanner(System.in);
		
		String path = "E:\\����ũ_�̼ҷ�\\����ũ ���� ����\\test\\test2.txt"; //���� Ÿ���� �ƴ� String���� ���� (���ڿ��� �����ص� ��)
		
		FileOutputStream fos = new FileOutputStream(path);
		System.out.println("����� ���� �Է�");
		String name = input.next();
		
		fos.write(name.getBytes()); //����ڰ� �Է��� ���� write 
		System.out.println("���� �Ǿ����ϴ�!");
	}

}
