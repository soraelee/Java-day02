package exception;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, result = 0;
		System.out.println("수 입력");
		x = input.nextInt();
		y = input.nextInt();
		try {
			System.out.println("try 실행");
			result = x / y; //문제 발생 시에는 연산까지만 실행 됨
			System.out.println("정상동작");
			System.out.println("정상동작");
			System.out.println("정상동작");
			//원하는 연산 => 문제 발생
			//문제가 발생하지 않을 경우 try 실행 및 catch 건너뜀
		} 
		catch (ArithmeticException e) { //연산오류
			//에러 발생 시 진행할 내용
			System.out.println("문제 발생");
			System.out.println("0으로 나눌 수 없음");
		}
		
		System.out.println("결과 : " + result);
	}

}
