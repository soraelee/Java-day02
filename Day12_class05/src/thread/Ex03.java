package thread;

import java.util.Scanner;


class A03 extends Thread {
	public void run() {
		for (;;) {
			System.out.println("문자가 날라왔습니다!");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str ;
		A03 a = new A03();
		a.start();
		while (true) {
			System.out.println("문자열 입력 : " );
			str = input.next();
			System.out.println("입력한 값 : " + str);
		}
	}

}
