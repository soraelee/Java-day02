package inheritance;

import java.util.ArrayList;

class TestClass03 extends ArrayList<String> {

	@Override
	public String get(int index) {
		System.out.println("�����͸� �������� ���");
		return super.get(index);
	}

	@Override
	public void add(int index, String element) {
		System.out.println("�����͸� �߰��߽��ϴ�");
		super.add(index, element);
	}//�θ� ���� ��� ���� ���
	
}

public class MainClass03 {
	public static void main(String[] args) {
		//�������̵�
		//�θ� Ŭ������ �޼ҵ带 �����Ͽ� ��� ����
		TestClass03 tc = new TestClass03();
		tc.add("aaa");
		System.out.println(tc.get(0));
	}

}
