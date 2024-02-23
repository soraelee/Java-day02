package quiz.main;

import java.util.Scanner;

import quiz.service.MemberService;
import quiz.service.MemberServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		//회원 관리 시스템
		//1. 회원 등록
		//2. 회원 정보 목록
		//1) 일별 회원
		//2) 나이별 회원
		//3) 납부 여부 별 회원
		//3. 회원 검색
		//4. 회원 삭제
		
		Scanner input = new Scanner(System.in);
		MemberService member = new MemberServiceImpl();
		
		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 정보 목록");
			System.out.println("3. 납부 여부 별 회원");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 나가기");
			System.out.print(">>> ");
			int num = input.nextInt();
			
			switch (num) {
			case 1:
				member.register();
				break;
			case 2:
				member.list();
				break;
			case 3:
				member.paylist();
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				break;
			}
			
			
			
		}
	}

}
