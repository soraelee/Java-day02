package thread;


class MyThread {
	public void start() {
		run();
		
	}
	public void run() {
		System.out.println("�θ� run");
	}
}

class A02 extends MyThread{
	public void run() {
		System.out.println("�ڽ� run ����");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		A02 a = new A02();
		a.start(); //�θ��� start�� �����ϴ��� �ڽĿ��� run�޼ҵ带 �������̵� �Ͽ��� ������ �ڽ��� run �޼ҵ尡 ����
	}
}
