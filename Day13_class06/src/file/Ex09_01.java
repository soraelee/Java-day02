package file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex09_01 {
	public static void main(String[] args) throws Exception{
		//�о���̱�
		
		String path = "E:\\����ũ_�̼ҷ�\\����ũ ���� ����\\2. Java\\test\\test.txt";
		
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Ex09DTO dto = (Ex09DTO)ois.readObject(); 
		//byte�������� ����� ������ object ���·� �о���̱�
		//������ Ex09DTO ���·� �����߱� ������ ����ȯ ����
		
		System.out.println("name : " + dto.getName());
		System.out.println("addr : " + dto.getAddr());
	}

}
