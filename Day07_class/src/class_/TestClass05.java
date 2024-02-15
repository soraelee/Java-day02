package class_;

import java.util.Scanner;

public class TestClass05 {
	public void sumFunc(int num) {
//		Scanner input = new Scanner(System.in);
				
		int sum = 0;
				
		// 입력
//		System.out.println("수 입력");
//		num = input.nextInt(); 
				
		for (int i = 1 ; i <= num ; i++) {
					sum += i;
		} //연산 => 사용자의 입력이 있어야 진행 가능
				
		//출력
		System.out.println("1 ~ "+ num + "까지의 합 : " + sum);
			}
}
