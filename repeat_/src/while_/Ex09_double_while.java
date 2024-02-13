package while_;

import java.util.Scanner;

public class Ex09_double_while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, sum = 0;
		
		while( true ) {
			System.out.println("1 ~ 10 사이 수 입력");
			num = input.nextInt();
			if (num > 0 && num <= 10) {
//				break;
				for (int i = 1 ; i <= num ; i++) {
					sum += i;
				}
				break;
			}
		}
		
		System.out.println("입력 수 까지의 합 : " + sum);
	}

}
