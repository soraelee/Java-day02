package day02;

import java.util.Scanner;

public class Quiz02_scanner {
	public static void main(String[] args) {
		//Scanner 문제
		//1) scanner 세팅 및 변수 정의
		Scanner input = new Scanner(System.in);
		String name = null;
		int kor = 0, eng = 0, math = 0, sum = 0;
		
		//2) 각 값을 입력 받기
		System.out.println("당신의 이름은 무엇입니까? ");
		name = input.next();
		
		System.out.println(name + "님의 국어 점수 : ");
		kor = input.nextInt();
		
		System.out.println(name + "님의 영어 점수 : ");
		eng = input.nextInt();
		
		System.out.println(name + "님의 수학 점수 : ");
		math = input.nextInt();
		
		sum = kor + eng + math;
		
		//3) 원하는 형태로 출력하기
		System.out.println("\n===============");
		System.out.println("이 름 : " + name);
		System.out.println("================");
		System.out.println("국 어 : " + kor);
		System.out.println("영 어 : " + eng);
		System.out.println("수 학 : " + math);
		System.out.println("================");
		System.out.println("합 계 : " + sum);
		System.out.println("================");
		
		
	}
}
