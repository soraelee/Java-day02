package day02;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		//1) 올해년도와 태어난 년도를 구하여 나이를 계산하는 프로그램을 코딩하기
		Scanner input = new Scanner(System.in);
		int year = 0, born = 0, age = 0; 
		
		System.out.println("올해의 년도를 4자리로 입력하세요");
		year = input.nextInt();
		System.out.println("당신이 태어난 년도를 4자리로 입력하세요");
		born = input.nextInt();
		age = year - born + 1;
		System.out.println("당신의 나이는 " + age + "살 입니다.");
		
		//2) 600kg재한의 화물용 엘리베이터가 있다. 
		//   2개의 물건에 대한 무게를 실수로 입력받아 현재 엘리베이터에 더 적제할 수 있는 무게를 구하시오
		
		double th1 = 0, th2 = 0, val_w = 0;
		System.out.println("첫 번째 물건의 무게를 입력하시오");
		th1 = input.nextDouble();
		
		System.out.println("두 번째 물건의 무게를 입력하시오");
		th2 = input.nextDouble();
		
		val_w = 600 - (th1 + th2);
		System.out.println("현재 엘레베이터의 허용 무게는 " + val_w + "kg 입니다.");
		
		
		
		
		
	}
	

}
