package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		String path = "E:\\����ũ_�̼ҷ�\\����ũ ���� ����\\test\\";
		
		System.out.println("���ϸ� �Է�");
		String fileName = input.next();
		
		File filePath = new File(path + fileName + ".txt");
		
		if(filePath.exists()) {
			System.out.println("�̹� �����ϴ� �����Դϴ�"); //���ǽ����� ����� ���� ����
		}
		else { 
			FileOutputStream fos = new FileOutputStream(filePath); 
			//���� ���ϸ����� ������� ��� ������ �ۼ��� ������ ������ ������� �������
			String msg ;
			System.out.println("������ �Է��ϼ���");
			input.nextLine(); //�׳� next�� ������ �������� ���� �Էµ��� Ȯ���ϱ� ������ ������ ���� �� ���͸� ġ�� �ش� ���� �ؿ� �������뿡 ����Ǿ �갡 ����
			msg = input.nextLine(); //���͸� ��������
			fos.write(msg.getBytes());
			System.out.println("���� �Ǿ����ϴ�");
		}
	}

}
