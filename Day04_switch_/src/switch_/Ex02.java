package switch_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("�� �Է�");
		num = input.nextInt();
		
		
//		if (num % 2 == 0 ) {}
		
		switch (num % 2) {
		case 0 : System.out.println("�Է°��� ¦��");break;
		case 1 : System.out.println("�Է°��� Ȧ��");break;
		
		}
		
		System.out.println("���� ������ ����");
	}

}
