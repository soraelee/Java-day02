package file;

import java.io.File;

public class Ex03 {
	public static void main(String[] args) {
		String sPath = "E:\\����ũ_�̼ҷ�\\����ũ ���� ����\\test\\test.txt";
		File fPath = new File("E:\\����ũ_�̼ҷ�\\����ũ ���� ����\\abcd\\"); //���ϸ��� �ۼ� ����
		fPath.mkdir(); //������ �����ϰڽ��ϴ�
		fPath.delete(); //������ �����ϰڽ��ϴ�.
		
		fPath = new File("E:\\����ũ_�̼ҷ�\\����ũ ���� ����\\");
		String[] s = fPath.list(); //�� ���� ���� �ִ� ����� �ҷ��� //Str ������ �迭�� ����
		
		System.out.println(s.length);
		for (String ss : s) {
			System.out.println(ss);
		}
		System.out.println(fPath.exists()); //������ ������ �κ��� �ش� �� ���翩�� Ȯ��
	}

}
