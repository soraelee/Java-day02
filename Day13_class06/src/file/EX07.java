package file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class EX07 {
	public static void main(String[] args) throws Exception{
		String path = "E:\\����ũ_�̼ҷ�\\����ũ ���� ����\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path); //��������� ����
		
		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		//�̷��� ��ȿ���� ���̱� ���� ��� => ���� ��Ʈ��
		
		for (char ch = '0' ; ch <= '9' ; ch++) {
			Thread.sleep(1);
			bos.write(ch);// write : ���Ͽ� �ѹ� ������ ������ �ѹ� �ۼ�
						  //���� ��Ʈ���� Ȱ���Ͽ� ��ȿ���� ����
						  //�ϳ��� ��������� �������� �ۼ��� �������� ������ ����
						  
		}
		bos.flush(); //��������� �־�� ������ �ѹ��� ���Ϸ� ����
					 //���� �� ������θ� ���� ��Ŵ
		bos.write('a'); //���� �ѹ� �� �ۼ��� �� ����
		
		bos.close(); //��������� �־�� ������ �����԰� ���ÿ� ������ε� ����
		fos.close();
	}

}
