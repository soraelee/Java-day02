package if_;

import java.util.Scanner;

public class Quiz_team2 {
	public static void main(String[] args) {
//		문제 1. 
//		1과목, 2과목, 3과목, 4과목, 5과목 까지 있는 시험을 치른다.
//		한 과목이라도 60점 미만인 경우 "불합격입니다."를 출력하고
//		총점이 400점 이상이면 "합격입니다!"를 출력하시오.
		
//		Scanner input = new Scanner(System.in);
//		
//		int s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;
//		
//		System.out.print("점수 입력 : ");
//		s1 = input.nextInt();
//		s2 = input.nextInt();
//		s3 = input.nextInt();
//		s4 = input.nextInt();
//		s5 = input.nextInt();
//		
//		if (s1 < 60 || s2 < 60 || s3 < 60 || s4 < 60 || s5 < 60)
//			System.out.println("불합격 입니다.");
//		else if ((s1 + s2 + s3 + s4 + s5) >= 400)
//			System.out.println("합격 입니다!");
//		
		
//		문제 2.
//		점수와 학년을 입력했을때 합격 불합격 여부
//
//		조건 -1) 점수가 60점 이상면 합격 그렇지 않으면 불합격 출력
//		        2)  단, 4학년을 입력했을때는 70점 이상이여야 합격이다
		
		
//		Scanner input = new Scanner(System.in);
//		
//		int grade = 0, score = 0;
//		
//		System.out.print("학년 : ");
//		grade = input.nextInt();
//		System.out.print("점수 : ");
//		score = input.nextInt();
//		
//		
//		if (grade == 4) {
//			if (score >= 70)
//				System.out.println("합격");
//			else 
//				System.out.println("불합격");
//		}
//		else {
//			if (score >= 60)
//				System.out.println("합격");
//			else
//				System.out.println("불합격");
//		}
		
		
//		문제 3.
//		연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//
//		윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//
//		예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
//		1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
//		하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//
//		입력)
//		첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//
//		출력)
//		첫째 줄에 윤년이면 1, 아니면 0을 출력한다
		
		
//		Scanner input = new Scanner(System.in);
//		int year = 0;
//		
//		System.out.print("연도 : ");
//		year = input.nextInt();
//		
//		if (year < 1 || year > 4000)
//			System.out.println("1~4000 사이를 입력하세요");
//		else {
//			
//			if (year % 4 == 0) {
//				if (year % 400 == 0)
//					System.out.println(1);
//				else if (year % 100 != 0)
//					System.out.println(1);
//				else 
//					System.out.println(0);
//			}
//			else 
//				System.out.println(0);
//		}
//		
		
		
//		문제 4.
//		현재 년도를 입력합니다.
//		나이를 입력합니다.
//		태어난 년대를 구합니다.
		
		Scanner input = new Scanner(System.in);
		int year = 0, age = 0, born = 0;
		
		System.out.print("현재 년도 : " );
		year = input.nextInt();
		System.out.print("나이 : " );
		age = input.nextInt();
		
		born = year - age + 1;
		
		if (born / 10 == 201)
			System.out.println("2010년대에 태어났습니다.");
		else if (born / 10 == 200)
			System.out.println("2000년대에 태어났습니다.");
		else if (born / 10 == 199)
			System.out.println("1990년대에 태어났습니다.");
		else if (born / 10 == 198)
			System.out.println("1980년대에 태어났습니다.");
		else if (born / 10 == 197)
			System.out.println("1970년대에 태어났습니다.");
		else if (born / 10 == 196)
			System.out.println("1960년대에 태어났습니다.");
		else if (born / 10 == 195)
			System.out.println("1950년대에 태어났습니다.");
		else if (born / 10 == 194)
			System.out.println("1940년대에 태어났습니다.");
		else if (born / 10 == 193)
			System.out.println("1930년대에 태어났습니다.");
			
		
	}
}
