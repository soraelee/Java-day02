package constructor;

import java.util.ArrayList;

class TestClass04 {
	public TestClass04(int num) { // �����ڸ� ����� ���� ����Ʈ �����ڴ� ����� (����Ʈ: �ƹ��͵� �������� ����)
		System.out.println("�Ű� ���� �޴� ������");
	}
	public TestClass04() {
		System.out.println("�⺻ ������ ����"); // ����Ʈ �����ڸ� �����ؾ� ��
	}
	
	public void test() {
		System.out.println("test ȣ��");
	}
	public void test(int num) {
		System.out.println(num + " test ȣ��");
	}
	
}


public class Ex04 {
	public static void main(String[] args) {
		//������ �����ε�
		// - �����ε� : �޼ҵ��� �̸��� ���� �� ����
		TestClass04 t = new TestClass04(); // ����Ʈ ������ ��ü
		t.test(); t.test(100);
		
		TestClass04 t2 =new TestClass04(1000); //�Ű������� ������ ��ü
		
		ArrayList arr = new ArrayList<>(); //�����ڸ� ���� -> ctrl + Ŭ����
		String s = new String();
		String s1 = new String("a"); //�빮�ڷ� �����ϴ� �ڷ����� Ŭ���� �����ڸ� ����
		
		
	}

}
