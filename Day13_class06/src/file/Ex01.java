package file;

import java.io.File;
import java.io.FileOutputStream;
//import java.io.Exception;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		File path = new File("E:\\����ũ_�̼ҷ�\\����ũ ���� ����\\test\\test.txt");
		//���� ��� : output stream
		FileOutputStream fos = new FileOutputStream(path); 
		fos.write(97);
		fos.write('a'); //�迭 �������� ���� �� ����
		fos.write("test".getBytes());
	}
}
