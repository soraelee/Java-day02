package Quiz_while;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		//어떤 수의 약수를 구하는 프로그램
		Scanner input = new Scanner(System.in);
		
		int num ;
		
		System.out.print("수 입력 : ");
		num = input.nextInt();
		
		for (int i = 1 ; i <= num ; i++) {
			if (num % i == 0)
				System.out.println(i);
		}
	}

}
