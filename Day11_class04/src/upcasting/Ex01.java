package upcasting; 
 
//casting : ����ȯ
//upcasting : �ڽ����� -> �θ����·� ��ȯ
//downcasting : �θ����� -> �ڽ�����

class A01 {
	public void test() {
		System.out.println("aaaaaaa");
	}
}
class B01 extends A01{
	public void test() {
		System.out.println("bbbbb");
	}
	
}
class C01 extends A01 {
	public void test() {
		System.out.println("ccccc");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		A01 a;
		a = new B01(); a.test();
		a = new C01(); a.test();
		//A01�̶�� ���� �θ� ������ �����Ƿ� 
		//�θ� B01 C01�� ���� ���� -> ȣ�� �� �ڽ��� �޼ҵ尡 ����
		
		/*
		B01 b;
		C01 c ; //������ ���� ���� �� ����
		
		b = new B01(); b.test();
		c = new C01(); c.test();
		*/
	}

}
