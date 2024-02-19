package Quiz_time;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		TimeService ts = new TimeService();
		/*
		 1. 시작 시간 설정
		 2. 시작 시간 확인(년월일시분초)
		 3. 종료시간 설정
		 4. 종료 시간 확인(년월일시분초)
		 5. 사용시간 가져오기
		 	- ?시간 ?분 ?초 사용함
		 */
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 시작 시간 설정");
			System.out.println("2. 시작 시간 확인");
			System.out.println("3. 종료시간 설정");
			System.out.println("4. 종료 시간 확인");
			System.out.println("5. 사용 시간 가져오기");
			System.out.print(">>> ");
			int num = input.nextInt();
				
			switch (num) {
			case 1:
				ts.startSet();
				break;
			case 2:
				System.out.println(ts.startcheck());
				
				break;
				
			case 3:
				ts.endSet();
				break;
			case 4:
				System.out.println(ts.endcheck());
				
				break;
			case 5:
				System.out.println(ts.useTime());
				break;
			default:
				System.out.println("잘못 입력된 숫자");
					break;	
			}
		}
	}

}
