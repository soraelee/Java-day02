package while_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i, sum = 0;
		
		while (true) {
			System.out.println("1 ~ 10 ���� �� �Է�");
			i = input.nextInt();
			
			if (i > 0 && i <= 10) {
				break;
			}
			else if (i <=0 || i > 10) {
				System.out.println("������ ���, �ٽ� �Է�");
				continue;
				
			}
			System.out.println("while �ٽ� ����");
		}
		for (int k = 1 ; k <= i ; k++) {
			sum += k;
		}
		System.out.println("1 ~ " + i + "������ �� : " + sum);
	}
}
