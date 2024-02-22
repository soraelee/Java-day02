package thread;

import java.util.Scanner;


class A03_1 extends Thread {
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

public class Ex03_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str ;
		A03_1 a = new A03_1();
		a.setDaemon(true); // 현재 스레드로 운영되는 내용을 종료 => 메인에서 진행한 내용이 종요될 때 thread도함께 종료해주세요
		a.start();
		while (true) {
			System.out.println("문자열 입력 : " );
			str = input.next();
			System.out.println("입력한 값 : " + str);
			//set demons
			if (str.equals("end")) {
				System.out.println("종료합니다");
				break;
			} //메인의 while문 종료
			
		}
		System.out.println("메인이 종료됩니다.");
	}

}
