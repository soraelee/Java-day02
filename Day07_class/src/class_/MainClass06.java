package class_;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, sum;
		System.out.println("수 입력");
		num = input.nextInt();
		
		TestClass06 t = new TestClass06();
		sum = t.sumFunc(num); //메소드의 sum이 들어옴
		
		System.out.println("출력값: " + sum);
		
		t.test(20, "aaa");
		
		
	}

}
