package thread;
class A01 extends Thread { // ������� thread ó��
	public void run() { //thread�� ������ �ִ� run �޼ҵ带 overriding �ؾ� ���۵�
		for (int i = 0 ; i < 100 ; i++)	{
//			sleep(10000); //��� ����
			System.out.println("i : " + i);
		}
	}
}

class B01 extends Thread {
	public void run() {
		for (int k = 0 ; k < 100 ; k++)	{
			System.out.println("k : " + k);
		}
	}
}
public class Ex01 {
	public static void main(String[] args) {
		A01 a = new A01();
		B01 b = new B01();
//		a.run(); //a Ŭ������ �켱 ���� ��
//		b.run(); //b Ŭ���� ����
		
		a.start(); //��� ���� Thread Ŭ������ ���� ���
		b.start();
	}

}
