package Quiz_while;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		//� ���� ����� ���ϴ� ���α׷�
		Scanner input = new Scanner(System.in);
		
		int num ;
		
		System.out.print("�� �Է� : ");
		num = input.nextInt();
		
		for (int i = 1 ; i <= num ; i++) {
			if (num % i == 0)
				System.out.println(i);
		}
	}

}
