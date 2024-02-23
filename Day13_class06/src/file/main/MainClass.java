package file.main;

import java.util.Scanner;

import file.service.ServiceMember;
import file.service.ServiceMemberImp1;

public class MainClass {
	public static void main(String[] args) {
		//기본틀 작성
		Scanner input = new Scanner(System.in);
		
		int num;
		ServiceMember member = new ServiceMemberImp1();
		
		while (true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 검색");
			System.out.println("3. 회원 목록 보기");
			System.out.println("4. 탈퇴");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				member.register();
				break;
			case 2:
				member.search();
				break;
			case 3:
				member.list();
				break;
			case 4:
				member.delete();
				break;
			case 5:
				System.out.println("프로그램 종료");
				return;

			default:
				break;
			}
		}
	}
	

}
