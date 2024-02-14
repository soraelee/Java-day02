package Quiz_for;

import java.util.Scanner;

public class Quiz_team2 {
	public static void main(String[] args) {
//		문제1번) 
//		점수를 입력받아 80점 이상이면 합격메세지를 그렇지 않으면 
//		불합격 메세지를 출력하는 작업을 반복하다가
//		0에서 100점 이외의 점수가 입력되면 종료하는 프로그램

//		Scanner input = new Scanner(System.in);
//		
//		int num ;
//		
//		
//		for (;;) {
//			System.out.print("점수 등록 : ");
//			num = input.nextInt();
//			
//			if (num <= 100 && num >= 80)
//				System.out.println("합격 입니다.");
//			else if (num < 80 && num >= 0)
//				System.out.println("불합격 입니다.");
//			else {
//				System.out.println("잘못 입력된 점수입니다.");
//				break;
//			}
//		}
		
		
//		문제 2번)
//		숫자를 입력받아서 그 값이 짝수면 덧셈을, 홀수면 뺄셈을 진행하는 프로그램을 만듭니다.
//	
//		입력받는 숫자는 1~20사이의 값이고 100이되면 종료됩니다.
//		더해지거나 뺀 값은 0미만, 100초과가 될 수 없습니다.
//	
//		출력 예시 :
//		----------------------------
//		현재 숫자는 0 입니다.
//		숫자를 입력하세요 : 20
//	
//		숫자를 더합니다.
//	
//		현재 숫자는 20 입니다.
//		숫자를 입력하세요 : 19
//	
//		숫자를 뺍니다.
//	
//		현재 숫자는 1 입니다.
//		숫자를 입력하세요 : 3
//	
//		합계는 0이하로 내려갈 수 없습니다. 다시 입력해주세요
//	
//		현재 숫자는 1 입니다.
//		숫자를 입력하세요 : 
//		---------------------------
		
//		Scanner input = new Scanner(System.in);
//		int num1 = 0, num2, sum = 0;
//		
//		for (;;) {
//			System.out.println("현재 숫자는 " + num1 + "입니다.");
//			System.out.print("숫자를 입력하세요 : ");
//			num2 = input.nextInt();
//			
//			switch (num2 % 2) {
//			case 0:
//				sum = num1 + num2;
//				if (sum < 0) {
//					System.out.println("\n합계는 0이하로 내려갈 수 없습니다. 다시 입력해주세요\n");
//					continue;
//				}
//				else {
//					System.out.println("\n숫자를 더합니다.\n");
//					num1 = sum;
//				}
//				break;
//			case 1:
//				sum = num1 - num2 ;
//				if (sum < 0) {
//					System.out.println("\n합계는 0이하로 내려갈 수 없습니다. 다시 입력해주세요\n");
//					continue;
//				}
//				else {
//					System.out.println("\n숫자를 뺍니다.\n");
//					num1 = sum;
//				}
//				break;
//					
//			}
//
//		}
		
		
//		문제3번)
//		아래와 같은 모양을 만드세요
//	
//		*****
//		****
//		***
//		**
//		*
//		========
		
//		for (int i = 0 ; i < 5 ; i++) {
//			for (int j = 5 ; j - i > 0 ; j--) {
//				System.out.print("*");
//			}
//		System.out.println();
//		
//		}


//		문제4번
//		
//		
//		int형 양수 범위 숫자를 입력하였을 경우 각 자릿수의 합을 구하세요.
//		
//		반복해서 동작하다 입력값에 0이 들어가면 프로그램이 종료됩니다.
//		
//		입력           출력
//		
//		11               2 
//		111              3
//		1111            4
//		11111           5
//		895              22
//		222222222     18
		
		Scanner input = new Scanner(System.in);
		
		int num3, sum = 0, result = 0, val = 0;
		
		for (;;) {
			
			System.out.print("값 입력 : ");
			num3 = input.nextInt();
			
			if (num3 == 0)
				break;
			else {
				sum = 0; result = 0; val = 0;
				while(true) {
					
					if (num3 / 10 == 0) {
						val = num3 % 10;
						result += val ;
						break;
					}
					else if (num3 > 10) {
						val = num3 % 10;
						sum += val ;
						result = sum;
						num3 = num3 / 10;
					}
					else {
						result += num3 ;
						break;
					}
						
				}
				
				System.out.println("출 력 : " + result);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
