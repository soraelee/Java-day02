package if_;

import java.util.Scanner;

public class Quiz_team1 {
	public static void main(String[] args) {
		// 1.입력받은 수가 양수인지 음수인지 판단하는 프로그램을 작성하세요.
//		Scanner input = new Scanner(System.in);
//		int num ;
//		
//		System.out.print("정수를 입력하세요 : ");
//		num = input.nextInt();
//		
//		if (num > 0)
//			System.out.println(num + "은 양수 입니다.");
//		else if (num < 0)
//			System.out.println(num + "은 음수 입니다.");
		
		
		// 2. 두 수를 입력 받아 아래 기능을 수행하는 계산기를 만드시오.
//		Scanner input = new Scanner(System.in);
//		int num1 = 0, num2 = 0, num3 = 0;
//		int sum, sub, mul, left;
//		double div;
//		
//		System.out.println("계산기 입니다.");
//		System.out.print("두 수 입력 : ");
//		num1 = input.nextInt();
//		num2 = input.nextInt();
//		System.out.println("연산의 종류는 다음과 같습니다.");
//		System.out.println("1.덧셈");
//		System.out.println("2.뺄셈");
//		System.out.println("3.곱셈");
//		System.out.println("4.나눗셈");
//		System.out.println("5.나머지");
//		System.out.print("진행하고자 하는 연산의 번호를 고르시오 : ");
//		num3 = input.nextInt();
//		
//		sum = num1 + num2;
//		sub = num1 - num2;
//		mul = num1 * num2;
//		div = (double)num1 / num2;
//		left = num1 % num2;
//		
//		if (num3 == 1)
//			System.out.println("덧셈 : " + sum);
//		else if (num3 == 2)
//			System.out.println("뺄셈 : " + sub);
//		else if (num3 == 3)
//			System.out.println("곱셈 : " + mul);
//		else if(num3 == 4)
//			System.out.println("나눗셈 : " + div);
//		else if (num3 == 5)
//			System.out.println("나머지 : " + left);
		
		//3. 문자열을 입력받아 , 입력받은 문자열안에 a가 포함되어있는지 여부를 출력하는 문제를 만드시오 (str.contains(String) )
		Scanner input = new Scanner(System.in);
		String st = null;
		
		System.out.print("단어 입력 : ");
		st = input.next();
		
		if (st.contains("a"))
			System.out.println("a가 포함되어 있습니다.");
		else 
			System.out.println(st);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
