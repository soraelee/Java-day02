package if_;

import java.util.Scanner;

public class Quiz01_if {
	public static void main(String[] args) {
		// 1) 두 수를 입력받아 큰 수를 출력하시오
		Scanner input = new Scanner(System.in);
		
		int n1 = 0, n2 = 0;
		
		System.out.print("첫 번째 숫자 : ");
		n1 = input.nextInt();
		System.out.print("두 번째 숫자 : ");
		n2 = input.nextInt();
		
		if (n1 > n2)
			System.out.println(n1);
		if (n2 > n1)
			System.out.println(n2);
		
		// 2) 세 수를 입력받아 큰 수를 출력하시오
//		Scanner input = new Scanner(System.in);
//		
//		int n1 = 0, n2 = 0, n3 = 0;
//		
//		System.out.print("첫 번째 숫자 : ");
//		n1 = input.nextInt();
//		System.out.print("두 번째 숫자 : ");
//		n2 = input.nextInt();
//		System.out.print("세 번째 숫자 : ");
//		n3 = input.nextInt();
//		
//		System.out.print("가장 큰 수는?  ");
//		
//		if (n1 > n2 && n1 > n3)
//			System.out.println(n1);
//		if (n2 > n1 && n2 > n3)
//			System.out.println(n2);
//		if (n3 > n1 && n3 > n2)
//			System.out.println(n3);
	}
}
