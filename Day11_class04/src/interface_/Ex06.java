package interface_;

class Test07 { // ���ο� ��� => ������ ���� ����� �ִ� �ڸ��� �ش� ������� �����ؾ���
	public void test() {
		System.out.println("���ο� ������� ����ϴ�");
	}
}

class Test06 { //������ ���
	public void test() {
		System.out.println("test��� �Դϴ�.");
	}
}

class Singleton06 {
	
}

public class Ex06 {
	public static void main(String[] args) {
		Test06 t01 = new Test06();
		t01.test();
	}
}
