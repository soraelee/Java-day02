package abstract_;

abstract class Test01 { //�߻� Ŭ���� �Դϴ�.
	public abstract void speed();  //�߻� ����Դϴ�. => ���߿� ���� �����ϼ���
//	{ // �ڿ� ���� ����
//		System.out.println("2024�� �ӵ� ���"); // ��� ������ ���� => �߻�ȭ ����
//	}
	public void myBreak() {
		System.out.println("���� ���");
	}
}
class TestClass01 extends Test01 {
	public void speed() { // ������ ���� => �߻�� �޼ҵ带 �������̵� �ؼ� ���
		System.out.println("2025");
	}
	public void autoSystem() {
		System.out.println("�ڵ� ���� ���");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t =new TestClass01();
		t.speed(); t.myBreak(); t.autoSystem();
	}
}
