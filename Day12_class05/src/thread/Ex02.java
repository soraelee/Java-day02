package thread;


class MyThread {
	public void start() {
		run();
		
	}
	public void run() {
		System.out.println("부모 run");
	}
}

class A02 extends MyThread{
	public void run() {
		System.out.println("자식 run 실행");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		A02 a = new A02();
		a.start(); //부모의 start를 실행하더라도 자식에서 run메소드를 오버라이딩 하였기 때문에 자식의 run 메소드가 실행
	}
}
