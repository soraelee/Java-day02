package inheritance;

//������
class Test07 {
	public Test07() {
		System.out.println("�θ� ������ ����");
	}
}
class TestClass07 extends Test07{
	public TestClass07() {
		System.out.println("�ڽ� ������ ����");
	}
	
}


public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 tc = new TestClass07();
	}

}
