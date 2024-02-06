package day02;

import java.util.Scanner;

public class Ex06_scanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num ;
		String name;
		System.out.println("이름 입력 : ");
		name = input.next(); // 문자열을 입력 받음
		
		System.out.println("수 입력 : ");
		num = input.nextInt(); // 정수만 입력 바듬
		
		System.out.println("이름 : "+ name);
		System.out.println("입력 수 : "+ num);
		
		double dou;
		System.out.println("실수 입력 : ");
		dou = input.nextDouble();
		System.out.println("실수 : " + dou);
		
	}
}
