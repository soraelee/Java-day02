package list;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>(); // ù��° <> �ȿ��� �ڷ���
		arr.add("�ȳ�"); //�����͸� �߰��ϰڽ��ϴ�. 
		arr.add("�ϼ���"); //�����͸� �߰��ϰڽ��ϴ�. 
		arr.add("�ϼ���"); //�����͸� �߰��ϰڽ��ϴ�. 
		arr.add("�ϼ���"); //�����͸� �߰��ϰڽ��ϴ�. 
		arr.add("�ϼ���"); //�����͸� �߰��ϰڽ��ϴ�. 
		arr.add("�ϼ���"); //�����͸� �߰��ϰڽ��ϴ�. 
		arr.add("�ϼ���"); //�����͸� �߰��ϰڽ��ϴ�. 
		System.out.println("arr : " + arr);
		
		// ������ ������ :get
		String s = arr.get(0); // �ε��� ���� ����
		System.out.println("0 : " + s);
		
		
		
	}

}
