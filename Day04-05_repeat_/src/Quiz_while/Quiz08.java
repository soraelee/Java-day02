package Quiz_while;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		// 이중 반복문 문제
		//		1) 2에서부터 입력된 어떤 수까지 내에 이쓴ㄴ 소수를 찾는 프로그램을 완성하기
		Scanner input = new Scanner(System.in);

		System.out.print("수 입력 : ");
		int num = input.nextInt();


		System.out.print("소수 : " );
		for (int k = 2 ; k <= num ; k++) {
			int j = 0 ;
			for (int i = 1 ; i <= k ; i ++) {
				if (k % i == 0) {
					j++;
				}
			}
			if (j == 2) {
				System.out.print(k + ", ");
			}
		}
	}

}
