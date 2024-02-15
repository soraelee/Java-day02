package class_;

import java.util.Scanner;

public class TestClass04 {
	public void sumFunc() {
Scanner input = new Scanner(System.in);
		
		int num = 0, sum = 0;
		
		// 입력
		System.out.println("수 입력");
		num = input.nextInt(); 
		
		for (int i = 1 ; i <= num ; i++) {
			sum += i;
		} //연산
		
		//출력
		System.out.println("1 ~ "+ num + "까지의 합 : " + sum);
	}

}
