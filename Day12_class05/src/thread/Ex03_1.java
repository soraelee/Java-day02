package thread;

import java.util.Scanner;


class A03_1 extends Thread {
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

public class Ex03_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str ;
		A03_1 a = new A03_1();
		a.setDaemon(true); // ���� ������� ��Ǵ� ������ ���� => ���ο��� ������ ������ ����� �� thread���Բ� �������ּ���
		a.start();
		while (true) {
			System.out.println("���ڿ� �Է� : " );
			str = input.next();
			System.out.println("�Է��� �� : " + str);
			//set demons
			if (str.equals("end")) {
				System.out.println("�����մϴ�");
				break;
			} //������ while�� ����
			
		}
		System.out.println("������ ����˴ϴ�.");
	}

}
