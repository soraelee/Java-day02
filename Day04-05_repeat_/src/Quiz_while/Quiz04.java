package Quiz_while;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		//�ּ� �����, �ִ� �����
		Scanner input = new Scanner(System.in);
		int num1, num2, max = 0, min = 0, n1 = 0, n2 = 0;


		System.out.println("�� �� �Է�");
		num1 = input.nextInt();
		num2 = input.nextInt();


		for (int i = 1 ; i <= num1 ; i++) {
			for (int j = 1 ; j <= num2 ; j++) {
				if (num1 % i == 0 && num2 % j == 0) {
					if (i == j) {
						max = i;
					}
				}
			}
		}
		
		System.out.println("�ִ� ����� : " + max);
		
		n1 = num1 / max ;
		n2 = num2 / max ;
		min = n1 * n2 * max;
		
		System.out.println("�ּ� ����� : " + min);

	}

}
