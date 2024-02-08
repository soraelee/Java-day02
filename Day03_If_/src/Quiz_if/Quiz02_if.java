package Quiz_if;

import java.util.Scanner;

public class Quiz02_if {
	public static void main(String[] args) {
		// 중첩된 if문
		Scanner input = new Scanner(System.in);
		int n1 = 0, n2 = 0, n3 = 0;
		
		System.out.print("n1을 입력하세요 : ");
		n1 = input.nextInt();
		System.out.print("n2을 입력하세요 : ");
		n2 = input.nextInt();
		System.out.print("n3을 입력하세요 : ");
		n3 = input.nextInt();
		
		System.out.println();
		
		//가장 큰 수, 두번째 큰 수, 마지막 큰 수 
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("n1이 가장 큼");
				if (n2 > n3) {
					System.out.println("n2가 두번째로 큼");
					System.out.println("n이 마지막 큰 수");
				}
				else {
					System.out.println("n3이 두번째로 큼");
					System.out.println("n2가 마지막 큰 수");
				}
			}
			else {
				System.out.println("n3가 가장 큼");
				System.out.println("n1이 두번째로 큼");
				System.out.println("n2가 마지막 큰 수");
				}
		}
			
		else {
			if (n2 > n3) {
				System.out.println("n2가 가장 큼");
				if (n1 > n3) {
					System.out.println("n1이 두번째로 큼");
					System.out.println("n3이 마지막 큰 수");
				}
				else {
					System.out.println("n3이 두번째로 큼");
					System.out.println("n1이 마지막 큰 수");
				}
			}
			else {
				System.out.println("n3이 가장 큼");
				System.out.println("n2가 두번째로 큼");
				System.out.println("n3이 마지막 큰 수");
			}
		}
	}
}
