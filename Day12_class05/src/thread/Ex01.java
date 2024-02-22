package thread;
class A01 extends Thread { // 상속으로 thread 처리
	public void run() { //thread가 가지고 있는 run 메소드를 overriding 해야 동작됨
		for (int i = 0 ; i < 100 ; i++)	{
//			sleep(10000); //사용 가능
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
//		a.run(); //a 클래수가 우선 수행 후
//		b.run(); //b 클래스 수행
		
		a.start(); //상속 받은 Thread 클래스가 가진 기능
		b.start();
	}

}
