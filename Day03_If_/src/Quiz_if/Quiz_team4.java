package Quiz_if;

import java.util.Scanner;

public class Quiz_team4 {
	public static void main(String[] args) {
//		문제1.
//		1에서부터 6까지의 눈을 가진 주사위를 두명이서 굴려서 승자를 정하는 게임
//		두명이 본인의 [이름]과 [주사위 수]를 입력 
//		출력 ex) [이름]님 승리
//		    	 [이름]님 승리
//		    	 무승부 
//		    	 1~6 사이의 숫자만 입력해주세요
		
		Scanner input = new Scanner(System.in);
		String a = null, b = null;
		int num1 = 0, num2;
		
		System.out.print("A 이름 : ");
		a = input.next();
		System.out.print("A 주사위 수 : ");
		num1 = input.nextInt();
		
		System.out.print("B 이름 : ");
		b = input.next();
		System.out.print("B 주사위 수 : ");
		num2 = input.nextInt();
		
		if (num1 < 1 || num1 > 6)
			System.out.println("1~6사이의 숫자만 입력해주세요");
		else if (num2 < 1 || num2 >6)
			System.out.println("1~6사이의 숫자만 입력해주세요");
		else {
			if (num1 > num2)
				System.out.println(a + "님 승리");
			else if (num1 < num2)
				System.out.println(b + "님 승리");
			else
				System.out.println("무승부");
		}
		
		
//		문제2. 
//		국어, 영어, 수학 점수를 입력하여 평균 점수와 등급을 출력하는 프로그램을 작성하시오.
//		단,  평균이 100점 초과이거나, 0점 미만인 경우 "잘못입력하셨습니다."를 출력하도록 작성하시오.
//		(A:90점 이상, B:90점 미만 80점 이상, C:80점 미만 70점 이상, D:70점 미만 60점 이상, F:60점 미만)
//		출력 ex ) 
//		국어, 영어, 수학 점수를 입력하세요 > 
//		95 90 85
//		평균 점수는 90점이며, 등급은 A입니다.
		
//		Scanner input = new Scanner(System.in);
		int kor = 0, math = 0 , eng = 0 ;
		double avg = 0;
		
		System.out.println("국어, 수학, 영어 점수를 입력하세요");
		kor = input.nextInt();
		math = input.nextInt();
		eng = input.nextInt();
		
		avg = (kor + math + eng) / 3.0;
		
		if (avg > 100 || avg < 0)
			System.out.println("잘못 입력하셨습니다.");
		else {
		
			if (avg % 10 >= 9)
				System.out.println("A");
			else if (avg % 10 >= 8)
				System.out.println("B");
			else if (avg % 10 >= 7)
				System.out.println("C");
			else if (avg % 10 >= 6)
				System.out.println("D");
			else
				System.out.println("F");
		}
		
//		문제3.
//		두 명이 가위, 바위, 보를 입력하여 결과를 출력하는 프로그램을 작성하시오.
//		단, 가위, 바위, 보가 아닌 것을 입력하면 "잘못입력하셨습니다." 출력
//		출력 ex )
//		첫번째 사람 가위 바위 보 입력 :
//		가위
//		두번째 사람 가위 바위 보 입력 :
//		바위
//		두번째 사람 승
		
//		Scanner input = new Scanner(System.in);
		String rsp1 = null, rsp2 = null;
		
		System.out.print("첫번째 사람 가위 바위 보 입력 : ");
		rsp1 = input.next();
		
		System.out.print("두번째 사람 가위 바위 보 입력 : ");
		rsp2 = input.next();
		
		if (("가위".equals(rsp1) || "바위".equals(rsp1) || "보".equals(rsp1)) && ("가위".equals(rsp2) || "바위".equals(rsp2) || "보".equals(rsp2)))
		{
			if ("가위".equals(rsp1)) {
				if ("보".equals(rsp2))
					System.out.println("첫번째 사람 승");
				else if ("바위".equals(rsp2))
					System.out.println("두번째 사람 승");
				else
					System.out.println("무승부");
				
			}
			else if ("바위".equals(rsp1)) {
				if ("보".equals(rsp2))
					System.out.println("두번째 사람 승");
				else if ("바위".equals(rsp2))
					System.out.println("무승부");
				else
					System.out.println("첫번째 사람 승");
			}
			else {
				if ("보".equals(rsp2))
					System.out.println("무승부");
				else if ("바위".equals(rsp2))
					System.out.println("첫번째 사람 승");
				else
					System.out.println("두번째 사람 승");
			}
				
		}
			
		else 
			System.out.println("잘못 입력하셨습니다");
		
			
	}
}
