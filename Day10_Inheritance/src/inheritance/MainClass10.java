package inheritance;

//protected

class Test10 {
	protected int num = 1000; //private ���� �� �ڽ� Ŭ�������� ���� �߻�
							//�ܺ��� ������ ������ ��� ���� �ڽ�Ŭ���������� ��� => protected
}
class TestClass10 extends Test10{
	public int num = 12345;
	public void test()	{
		System.out.println("num : " + num);
		System.out.println("this.num : " + this.num);
		System.out.println("super.num : " + super.num);
	}
}

public class MainClass10 {
	public static void main(String[] args) {
		TestClass10 tc = new TestClass10();
		tc.test();
	}
}
