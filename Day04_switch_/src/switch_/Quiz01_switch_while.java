package switch_;

import java.util.Scanner;

public class Quiz01_switch_while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num ;
		String str1 = null, str2 = null ;
		
		while (true) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			num = input.nextInt();
			System.out.println();
			
			switch (num) {
			case 1 :
				System.out.print("우리집 목적지 입력 : ");
				str1 = input.next();
				System.out.println("등록 성공\n");
				break;
			case 2:
				System.out.print("회사 목적지 입력 : ");
				str2 = input.next();
				System.out.println("등록 성공\n");
				break;
			case 3:
				if (str1 == null) {
					System.out.println("집 주소를 등록하세요");
				}
				else {
				System.out.println("우리집 : " + str1);
				break;
				}
				if (str2 == null) {
					System.out.println("회사 주소를 등록하세요\n");
				}
				else {
				System.out.println("회사 : " + str2 + "\n");
				break;
				}
			}
		}
		
	}
}
