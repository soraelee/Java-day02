package inheritance;

//������ ���� ����

class Test08 {
	public Test08(String s) {
		System.out.println(s + "�θ������ ����!");
	} //�θ� �����ڿ� �Ű������� �޴� ���
}
class TestClass08 extends Test08{
	public TestClass08() {
		super("�� ���� "); //���� �����ϴ� �κ��� ���� ���� //������ �ڽ� �������� ù��°�� �־�� ��
		System.out.println("�ڽ� ������ ����  !!");
		
	}
}


public class MainClass08 {
	public static void main(String[] args) {
		Test08 tc = new TestClass08() ;
	}

}
