package inheritance;
//�����ε�

class Test09 {
	public Test09() {
		//�θ� �Ȱ��� �⺻ �����ڸ� ����� �Ǹ� ������ ���� �� ����
		System.out.println("�θ� �⺻ ������");
	}
	public Test09(String s) {
		System.out.println(s + " : �θ� ������");
	}
}
class TestClass09 extends Test09{//�ڽ��� �⺻ ������ + �Ű����� �����ڸ� ���
	
	public TestClass09() {
		System.out.println("�ڽ� �⺻ ������");
		
	}
	public TestClass09(String s) {
		super(s); //�� ���� �θ��� �Ű������� ���޹޴� �����ڰ� �����
		System.out.println(s + " : �ڽ� ������");
		
	}
}



public class MainClass09 {
	public static void main(String[] args) {
		TestClass09 tc2 = new TestClass09("����");
		TestClass09 tc = new TestClass09();
		
	}

}
