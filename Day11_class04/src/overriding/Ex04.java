package overriding;

class Test04 {
	public void test() {
		System.out.println("�θ� ����");
	}
}

class TestClass04 extends Test04 {
	public void test() {
		System.out.println("�ڽ� ����");
		int i = 1;
//		return i;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
	}

}
