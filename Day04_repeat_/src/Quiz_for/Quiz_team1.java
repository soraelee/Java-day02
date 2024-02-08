package Quiz_for;

import java.util.Scanner;

public class Quiz_team1 {
	public static void main(String[] args) {
		
		//1.사용자로부터 정수를 입력받고, 1부터 입력받은 수 까지의 합을 출력하는 프로그램을 만드시오
		
		Scanner input = new Scanner(System.in);
		int num1 = 0, sum = 0;
		
		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		
		for (int i = 1 ; i <= num1 ; i ++) {
			sum += i;
		}
		System.out.println("총 합 : " + sum);
		
		
//		2.숫자 맞추기 게임
//
//		`출력 "숫자 맞추기 게임을 시작합니다."`
//
//		`int computerNum 변수에 1~100 사이의 임의의 정수 저장`
//
//		`힌트 출력 "짝수입니다 / 홀수입니다"`
//
//		`출력 "1~100 사이의 값을 입력하세요: "`
//
//		`int userNum 변수에 사용자 입력값 저장`
//
//		`비교 if userNum computerNum`
//
//		`userNum이 ComputerNum보다 크면`
//
//		`출력 "더 작은 수입니다."`
//
//		`userNum이 ComputerNum보다 작으면`
//
//		`출력 "더 큰 수입니다."`
//
//		`userNum이 ComputerNum과 같으면`
//
//		`출력 "맞췄습니다." 게임종료`
		
//		Scanner input = new Scanner(System.in);
		int computerNum, userNum;
		
		System.out.println("숫자 맞추기 게임을 시작합니다.");
		computerNum = input.nextInt();
		
		if (computerNum % 2 == 0)
			System.out.println("힌트 : 짝수입니다.");
		else
			System.out.println("힌트 : 홀수입니다.");

		
		for (;;) {
			
			System.out.println("1 ~ 100 사이의 값을 입력하세요.");
			userNum = input.nextInt();
			
			if (userNum < computerNum)
				System.out.println("더 큰 수 입니다.");
			else if (userNum > computerNum)
				System.out.println("더 작은 수 입니다.");
			else {
				System.out.println("맞췄습니다.");
				break;
			}
		}
		
		
//		3.난수 생성기
//		사용자가 원하는 범위를 받아서 그 범위 내에서 사용자가 원하는 만큼의 난수를 발생시키고 
//		사용 종료를 원하면 종료되도록 만드시오.
//		(난수 생성은 Math.random()함수를 사용하면 된다)
//		필요하다면 continue;도 사용
//
//		ex)
//		1.난수 생성기 사용
//		2.사용 종료
//		원하시는 기능의 숫자를 입력해주세요:1
//		시행 횟수를 입력해주세요.20
//		범위의 최소를 입력해주세요.0
//		범위의 최대를 입력해주세요.10
		
//		Scanner input = new Scanner(System.in);
		int use, times, min, max, yes;
		
		System.out.println("1. 난수 생성기 사용");
		System.out.println("2. 사용 종료");
		use = input.nextInt();
		
		while (true) {
			switch (use) {
			case 1:
				System.out.print("시행 횟수를 입력하세요 : "); 
				times = input.nextInt();
				
				System.out.print("범위의 최소를 입력해주세요 : ");
				min = input.nextInt();
				
				System.out.print("범위의 최대를 입력해주세요 : ");
				max = input.nextInt();
				
				for (int i = 0 ; i < times ; i++) {
					int nn = (int) ((Math.random()*(max-min))+min);
					System.out.println(i+",range("+min+"~"+max+"):"+ nn);
				}
				break;
				
			case 2:
				break;
			}
			
			System.out.println("계속 진행하시겠습니까?");
			System.out.println("1. 예 2. 아니요");
			yes = input.nextInt();
				
			if (yes == 1) 
				continue;
			else
				break;	
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
