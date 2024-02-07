package if_;

import java.util.Scanner;

public class Quiz_team3 {
	public static void main(String[] args) {
//		1. 한국초등학교에서 학년별 대표가 국어, 영어, 수학시험을 본다. 1,2,3학년은 평균이 65점 이상이면 합격이고
//		4,5학년은 평균 75점 이상이면 합격, 6학년은 80점 이상이어야지 합격이다. 
//		학년과 시험 점수를 입력하고 합격일 시 "합격입니다."를 출력하고, 
//		불합격 일시 평균 점수가 몇 점 미달인지를 알려주는 "OO 점 미달로 불합격입니다"를 출력하시오.
		
//		Scanner input = new Scanner(System.in);
//		int kor = 0, eng = 0, math = 0, grade = 0, fail = 0;
//		double avg = 0;
//		
//		System.out.print("학년을 입력하시오 : ");
//		grade = input.nextInt();
//		
//		System.out.println("점수를 입력하시오");
//		System.out.print("국어 점수 : ");
//		kor = input.nextInt();
//		System.out.print("영어 점수 : ");
//		eng = input.nextInt();
//		System.out.print("수학 점수 : ");
//		math = input.nextInt();
//		
//		avg = (kor + eng + math) / 3.0;
//		System.out.printf("평균 : %.2f\n", avg);
//		
//		if (grade >= 1 && grade <= 3) {
//			if (avg >= 65)
//				System.out.println("합격입니다.");
//			else {
//				fail = 65 - (int)avg;
//				System.out.println(fail + "점 미달로 불합격 입니다.");
//			}
//		}
//		else if (grade == 4 && grade == 5) {
//			if (avg >= 75)
//				System.out.println("합격입니다.");
//			else {
//				fail = 75 - (int)avg;
//				System.out.println(fail + "점 미달로 불합격 입니다.");
//			}
//		}
//		else {
//			if (avg >= 80)
//				System.out.println("합격입니다.");
//			else {
//				fail = 80 - (int)avg;
//				System.out.println(fail + "점 미달로 불합격 입니다.");
//			}
//		}
		
		
		
//		2. 오늘은 5월 1일 수요일입니다.
//		사용자 입력으로 일수를 받고 n일 뒤 무슨 요일인지 출력하세요.
//		단,0보다 작거나 31이상의 숫자는 '1이상 30이하의 숫자를 입력해주세요' 문구 출력
//		(2024년 5월과 일수-요일이 같으니 달력으로 올바른지 확인 가능)
		
//		Scanner input = new Scanner(System.in);
//		int day = 0;
//		
//		System.out.print("일 수 : ");
//		day = input.nextInt();
//		
//		if (day < 0 || day > 30)
//			System.out.println("1이상 30이하의 숫자를 입력하세요");
//		else {
//			if (day % 7 == 0)
//				System.out.println("수요일");
//			else if (day % 7 == 1)
//				System.out.println("목요일");
//			else if (day % 7 == 2)
//				System.out.println("금요일");
//			else if (day % 7 == 3) 
//				System.out.println("토요일");
//			else if (day % 7 == 4)
//				System.out.println("일요일");
//			else if (day % 7 == 5)
//				System.out.println("월요일");
//			else 
//				System.out.println("화요일");
//		}
		
//		3. 수학점수가 90점 이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점", 60점 이상이면 "D학점", 
//		나머지 "F학점"
		
		Scanner input = new Scanner(System.in);
		int math = 0;
		
		System.out.print("수학 점수 : ");
		math = input.nextInt();
		
		if (math % 10 >= 9)
			System.out.println("A 학점");
		else if (math % 10 >= 8)
			System.out.println("B 학점");
		else if (math % 10 >= 7)
			System.out.println("C 학점");
		else if (math % 10 >= 6)
			System.out.println("D 학점");
		else 
			System.out.println("F 학점");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
