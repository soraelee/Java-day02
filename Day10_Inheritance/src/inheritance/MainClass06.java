package inheritance;

class Test06{
	public void test() {
		System.out.println("�θ� test �޼ҵ�");
	}
}
class TestClass06 extends Test06 {
	public void test() {
		System.out.println("�ڽ� test �޼ҵ�");
	}
	public void display() {
		this.test();
		super.test(); //�θ�� �ڽ� ��� ���� ��Ī�� �޼ҵ尡 ������ �ڽ� �޼ҵ�� 
		//�켱������ �ڽ� �������� ���� ã��
		//�θ�� ����ϰ� ���� ��� super.�޼ҵ�;
		//�������� ��� -> this.test();
	}
}

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 tc = new TestClass06();
		tc.display();
	}
}
