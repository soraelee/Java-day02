package inheritance;
//���߻��

class A {
	public void a() {
		System.out.println("a �޼ҵ� ����");
	}
}
class B extends A{
	public void b() {
		System.out.println("bb �޼ҵ� ����");
	}
}
class C extends B{ //Ŭ���������� �������� ��� ���� �� ���� //�������� ����� ����
	public void c() {
		System.out.println("ccc �޼ҵ� ����");
	}
}
public class MainClass11 {
	public static void main(String[] args) {
		C c = new C();
		c.c();
	}

}
