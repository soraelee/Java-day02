package constructor;

class TestClass01 {
	public TestClass01() {
		System.out.println("������ ����"); //�ʱ�ȭ�� �뵵�� ���
	}
	public void test() {
		System.out.println("test ȣ��");
	}
}


public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01(); //��ü ���� �� �ڵ�ȣ��
		t.test();
	}

}
