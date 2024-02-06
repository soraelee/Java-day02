package day02;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
//		1) 다음과 같은 방법으로 표준 체중을 구할 수 있다
		Scanner input = new Scanner(System.in);
		double st_weight = 0, height = 0, weight = 0, obesity = 0;
		
//		System.out.println("표준 체중 = (현재 키 - 100) X 0.9");
//		System.out.println("키를 입력하여 표준 체중을 구하시오");
//		
//		System.out.println("키를 입력하세요");
//		height = input.nextDouble();
//		st_weight = (height - 100) * 0.9;
//		System.out.println("표준 체중은 " + st_weight + "kg 입니다.");
//		
//		2) 비만도 비율은 다음과 같은 방법으로 구할 수 있다.
		System.out.println("비만도(%) = (현재체중 / 표준페중) X 100");
		
		System.out.println("키를 입력하세요");
		height = input.nextDouble();
		
		System.out.println("현재 체중을 입력하세요");
		weight = input.nextDouble();
		
		st_weight = (height - 100) * 0.9;
		obesity = (weight / st_weight) * 100;
		
		System.out.printf("표준 체중은 %.2fkg이고 비만도는 %.2f 입니다.", st_weight, obesity);
		
	}

}
