package file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex09 {
	public static void main(String[] args) throws Exception{
		Ex09DTO dto = new Ex09DTO();
		dto.setName("ȫ�浿");
		dto.setAddr("���¥��");
		
		String path = "E:\\����ũ_�̼ҷ�\\����ũ ���� ����\\2. Java\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path); 
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//��ü�� �����ϴ� ��Ʈ�� => �ڷ����� �ʿ�> DTO���� ����ȭ�� ��� ����
		ObjectOutputStream oos  = new ObjectOutputStream(bos);
		oos.writeObject(dto);
		
		oos.close();bos.close();fos.close(); //���� => file not found
		
	}
}
