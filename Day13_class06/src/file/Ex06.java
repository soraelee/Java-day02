package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		String path = "E:\\����ũ_�̼ҷ�\\����ũ ���� ����\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path, true); //��������� ����
		
		fos.write('c');
		fos.close(); //�޸𸮸� ȿ�������� ����� �� ����
		fos = new FileOutputStream(path, true);  //���� �������־�� ��
		fos.write('d'); //��Ʈ�� ���� ��θ� ������ ������ ��� �Ұ�
		
		
		//���� ���� ��������
		FileInputStream fis = new FileInputStream(path);
		//��� ������ ������ EOF�� -1�� ����� => �ش� ������ ���� �� �� ����
		while (true) {
			int re = fis.read();
			if (re < 0) {
				System.out.println("������ �����ϴ� : " + re);
				break;
			}
			System.out.println((char)re); 
		}

	}
}
