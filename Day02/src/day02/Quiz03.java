package day02;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
//		1) 수를 입력 받아 짝 홀수를 구분하여 출력
		Scanner input = new Scanner(System.in);
		int n1 = 0;
		
		System.out.println("수 입력");
		n1 = input.nextInt();
//		System.out.println(n1 % 2 == 0 ? "짝수" : "홀수");

//		2) 수를 입력 받아 3의 배수이면 출력
		System.out.println("\n수 입력");
		n1 = input.nextInt();
		System.out.println(n1 % 3 == 0 ? "3의 배수이다" : "3의 배수가 아니다");
//	
//		3) 두 수를 입력 받아 큰 수를 출력
		int n2 = 0, n3 = 0;
		
		System.out.println("\n두 수 입력");
		n1 = input.nextInt();
		n2 = input.nextInt();
		System.out.println("num1 : " + n1);
		System.out.println("num1 : " + n2);
		
		System.out.println(n1 >= n2 ? "num1이 num2보다 크거나 같다" : "num2가 num1보다 크다");
//		
//		4) 두 수를 입력 받아 큰수가 짝수면 "큰수는 짝수입니다" 아니면 "아님"출력
		System.out.println("\n두 수 입력");
		n1 = input.nextInt();
		n2 = input.nextInt();
		System.out.println("num1 : " + n1);
		System.out.println("num1 : " + n2);
		n3 = n1 > n2 ? n1 : n2;
		System.out.println(n3 % 2 == 0 ? "큰 수는 짝수 입니다" : "큰 수는 짝수가 아닙니다.");
		
		
		
	}

}
