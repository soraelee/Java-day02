package interface_;

class Test02 implements TestInt02{

	@Override
	public void test1() { //��� ���� �������̽��� ������ �����ؾ� ��
		System.out.println("test1����");
	}

	@Override
	public void test2() {
		System.out.println("test2����");
	}
	
}


public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.test1(); t.test2();
	}

}
