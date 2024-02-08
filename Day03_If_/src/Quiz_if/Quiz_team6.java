package Quiz_if;

import java.util.Scanner;

public class Quiz_team6 {
	public static void main(String[] args) {
//		문제1.  
//
//		1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
//
//		1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//		2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//		3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
//
//		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
//		또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
//		3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//
//		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
//
//		입력: 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
//		출력: 첫째 줄에 게임의 상금을 출력 한다.
//
//		예제 입력1:  3 3 6	 예제 출력1: 1300
//		예제 입력2:  2 2 2  예제 출력2: 12000  
//		예제 입력3:  6 2 5  예제 출력2:   600
		
//		Scanner input = new Scanner(System.in);
//		int n1 = 0, n2 = 0, n3 = 0, result = 0;
//		
//		System.out.println("주사위의 눈 3개 입력");
//		n1 = input.nextInt();
//		n2 = input.nextInt();
//		n3 = input.nextInt();
//		
//		if (n1 == n2) {
//			if (n2 == n3) {
//				result = 10000 + n1 * 1000;
//				System.out.println("상금 : " + result);
//			}
//			else {
//				result = 1000 + n1 * 100;
//				System.out.println("상금 : " + result);
//			}
//		}
//		else if (n2 == n3) {
//			result = 1000 + n2 * 100;
//			System.out.println("상금 : " + result);
//			
//		}
//		else if (n1 == n3) {
//				result = 1000 + n1 * 100;
//				System.out.println("상금 : " + result);
//		}
//		else {
//			if (n1 > n2 && n1 > n3) {
//				result = n1 * 100;
//				System.out.println("상금 : " + result);
//			}
//			else if (n2 > n3 && n2 > n1) {
//				result = n2 * 100;
//				System.out.println("상금 : " + result);
//			}
//			else {
//				result = n3 * 100;
//				System.out.println("상금 : " + result);
//			}
//				
//		}
//		
		
		
//		메뉴판을 출력 후 금액을 입력 받은 뒤 메뉴를 선택하면 거스름돈과 주문한 메뉴가 출력된다.
//		 ------- 메뉴판 -------
//		 1. 햄버거(9,000원)
//		 2. 피자(11,000원)
//		 3. 치킨(32,000원)
//		 4. 금액 반환
//		 -----------------------
//		 ※ 만약 금액을 입력했을 때 가장 저렴한 금액의 메뉴보다 적은 금액이 입력되었다면, "주문할 수 있는 메뉴 없음 xxxx원 반환" 을 출력
//		 ※ 투입 금액보다 비싼 음식을 선택하는 경우 "투입 금액이 부족합니다. xxxx원 반환" 을 출력
//		 ※ 메뉴판에 없는 메뉴 선택 시 "올바른 주문이 아닙니다. xxxx원 반환" 을 출력
//		 ※ 메뉴를 선택할때 4번을 선택 시 "투입 금액 xxxx원 반환" 을 출력
//
//		 ※ 주문 시 ( 1. 포장, 2. 매장식사 ) 선택지를 출력하여 선택하게한 뒤 최종 메세지는 아래와 같이 출력한다
//		 ( 1, 2 외에 다른 숫자 선택 시 "선택 오류 xxxx원 반환" 을 출력 )
//		 -----------------------
//		 주문 메뉴 : xxxx
//		 포장 or 매장식사
//		 거스름돈 : xxxx원
//		 -----------------------
		
//		Scanner input = new Scanner(System.in);
//		int coin = 0, num = 0, menu = 0, inout = 0, remain = 0;
//		
//		System.out.println("------- 메뉴판 -------");
//		System.out.println("1. 햄버거(9,000원)");
//		System.out.println("2. 피자(11,000원)");
//		System.out.println("3. 치킨(32,000원)");
//		System.out.println("4. 금액 반환");
//		System.out.println("-----------------------");
//		
//		System.out.print("메뉴 선택 : ");
//		num = input.nextInt();
//		
//		
//		if (num > 4 || num < 1)
//			System.out.println("올바른 주문이 아닙니다. " + coin + "원 반환");
//		
//		else {
//			System.out.print("금액 : ");
//			coin = input.nextInt();
//			
//			if (coin < 9000)
//				System.out.println("주문할 수 없는 메뉴 없음 " + coin + "원 반환");
//			
//			else if (num == 1) {
//				menu = 9000;
//				if (coin < menu)
//					System.out.println("주문할 수 없는 메뉴 없음 " + coin + "원 반환");
//				else {
//					remain = coin - menu ;
//					
//					System.out.println("1. 포장 2. 매장식사");
//					inout = input.nextInt();
//					
//					if (inout == 1) {
//						System.out.println("-----------------------");
//						System.out.println("주문 메뉴 : 햄버거");
//						System.out.println("포장");
//						System.out.println("거스름돈 : " + remain + "원");
//						System.out.println("-----------------------");
//					}
//					else if (inout == 2) {
//						System.out.println("-----------------------");
//						System.out.println("주문 메뉴 : 햄버거");
//						System.out.println("매장식사");
//						System.out.println("거스름돈 : " + remain + "원");
//						System.out.println("-----------------------");
//					}
//					else {
//						System.out.println("선택 오류 " + coin + "원 반환");
//					}
//				}
//			}
//			else if (num == 2) {
//				menu = 11000;
//				if (coin < menu)
//					System.out.println("투입 금액이 부족합니다. " + coin + "원 반환");
//				else {
//					remain = coin - menu ; 
//					
//					System.out.println("1. 포장 2. 매장식사");
//					inout = input.nextInt();
//					
//					if (inout == 1) {
//						System.out.println("-----------------------");
//						System.out.println("주문 메뉴 : 피자");
//						System.out.println("포장");
//						System.out.println("거스름돈 : " + remain + "원");
//						System.out.println("-----------------------");
//					}
//					else if (inout == 2) {
//						System.out.println("-----------------------");
//						System.out.println("주문 메뉴 : 피자");
//						System.out.println("매장식사");
//						System.out.println("거스름돈 : " + remain + "원");
//						System.out.println("-----------------------");
//					}
//					else {
//						System.out.println("선택 오류 " + coin + "원 반환");
//					}
//			}
//			}
//			else if (num == 3) {
//				menu = 32000;
//				if (coin < menu)
//					System.out.println("투입 금액이 부족합니다. " + coin + "원 반환");
//				else {
//					remain = coin - menu;
//					
//					System.out.println("1. 포장 2. 매장식사");
//					inout = input.nextInt();
//					
//					if (inout == 1) {
//						System.out.println("-----------------------");
//						System.out.println("주문 메뉴 : 치킨");
//						System.out.println("포장");
//						System.out.println("거스름돈 : " + remain + "원");
//						System.out.println("-----------------------");
//					}
//					else if (inout == 2) {
//						System.out.println("-----------------------");
//						System.out.println("주문 메뉴 : 치킨");
//						System.out.println("매장식사");
//						System.out.println("거스름돈 : " + remain + "원");
//						System.out.println("-----------------------");
//					}
//					else {
//						System.out.println("선택 오류 " + coin + "원 반환");
//					}
//			}
//			}
//			else 
//				System.out.println("투입금액 " + coin + "원 반환");
//				
//				
//		}
		
		
//		문제 3.
		
//		짱구는 약속 시간에 맨날 늦는다.
//		그래서 약속 시간 보다 25분 빨리 알람을 맞출 것이다.
//		* 약속 시간을 입력하면, 약속 시간 25분 전의 시간을 출력해주는 프로그램을 만드세요
//
//		[조건]
//		1. 00시 00분의 형식으로 시간을 입력한다.
//		2. 시각(hour) 은 00시~23시 사이에만 존재하며,
//		    분(minute) 은 00분~59분 사이에만 존재한다.
//		 (이외의 시간이 입력되면 "시각[00시-23시] 분[0분-59분]이내의 범위로 다시 적어주세요"라고 출력한다)
//		3. 알람 출력 형태는 "XX시 XX분에 알람을 맞추겠습니다"이다.
//		 (단, 00시 00분~00시 24분 사이의 시간을 입력하면
//		   "전날 23시 XX분에 알람을 맞추겠습니다" 라고 출력한다)
		
		Scanner input = new Scanner(System.in);
		int hour = 0, min = 0, sub;
		
		System.out.println("시간을 입력하세요");
		
		System.out.print("시 : ");
		hour = input.nextInt();
		
		System.out.print("분 : ");
		min = input.nextInt();
		
		System.out.println("약속시간 : " + hour + "시 " + min + "분");
		
		if (hour > 23 || hour < 0 && min > 59 || min < 0) {
			System.out.println("시각[00시-23시] 분[0분-59분]이내의 범위로 다시 적어주세요");
		}
		else {
			sub = min - 25;
			if (hour == 0 && sub < 0) {				
				hour = 23;
				min = 60 + sub ;
				System.out.println("전날 " + hour + "시 " + min + "분에 알람을 맞추겠습니다.");
			}
			
			else if (sub < 0) {
				hour -= 1;
				min = 60 + sub ;
				System.out.println(hour + "시 " + min + "분에 알람을 맞추겠습니다.");
			}
			else {
				System.out.println(hour + "시 " + sub + "분에 알람을 맞추겠습니다.");				
			}
				
				
		}
			
			
		
		
		
		
		
		
		
				


			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
