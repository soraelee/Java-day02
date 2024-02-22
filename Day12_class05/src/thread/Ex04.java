package thread;
// 싱크로나이즈드
// 싱글톤사용

class Test04 extends Thread {
	A04 a ;
	public Test04(A04 a, int num) {
		this.a = a;
		System.out.println(num + "-> a : " + a);
	}
	public void run() {
		a.test();
	}
}


class A04 {
	int sum = 1;
	
	public synchronized void test() { // 싱글톤 안에 만들어진 내용 또한 공유자원으로서 사용
		for (int i = 1 ; i < 3 ; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " : sum : " + sum);
			sum += i ;
		}
	}
}
public class Ex04 {
	 public static void main(String[] args) {
		A04 a01 = new A04();
		Test04 t01 = new Test04(a01, 1);
		Test04 t02 = new Test04(a01, 2);
		Test04 t03 = new Test04(a01, 3);
		System.out.println("t01 : " + t01);
		System.out.println("t02 : " + t02);
		System.out.println("t03 : " + t03);
		
		t01.start();
		t02.start();
		t03.start(); //

		/*A04 a02 = a01;
		a01.test();
		a02.test(); // thread 사용 전 연산이 순차적으로 동작 */
		
		//thread 사용시 원하는 결과와 달라지게 ㅚㄹ 수 있음
		// 동기화 사용 : 스래드 사용시 순차적으로 동작하게 함
		/*
		A04 a02 = a01; // 같은 공간을 공유
		
		System.out.println("a01 : " + a01);
		System.out.println("a02 : " + a02);
		
		a01.sum = 12345;
		System.out.println(a01.sum);
		System.out.println(a02.sum);
		*/
		
	}
}
