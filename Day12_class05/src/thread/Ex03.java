package thread;

import java.util.Scanner;


class A03 extends Thread {
	public void run() {
		for (;;) {
			System.out.println("���ڰ� ����Խ��ϴ�!");
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
			System.out.println("���ڿ� �Է� : " );
			str = input.next();
			System.out.println("�Է��� �� : " + str);
		}
	}

}
