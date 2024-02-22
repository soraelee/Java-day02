package collection.main;

import java.util.Scanner;

import collection.service.MemberServiceImp1;

public class MainClass {// 기본 흐름
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		MemberServiceImp1 ms = new MemberServiceImp1();
		
		while(true) {
			System.out.println("1. 회원관리");
			System.out.println("2. 로그인 기능");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				ms.display();
				break;
			case 2:
				break;
			
			default:
				break;
			}
		}
	}

}
