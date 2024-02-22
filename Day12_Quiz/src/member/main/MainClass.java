package member.main;

import java.util.Scanner;

import member.service.Service;
import member.service.ServiceImp1;
import member.service.ServiceImp2;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Service sv1 = new ServiceImp1();
		Service sv2 = new ServiceImp2();
		
		// 회원관리 프로그램
		// 1. 고객 정보 확인
		// 1) 납부 목록
		// 2) 고객 검색
		// 3) 전체 목록
		// 4) 연령대 별 목록
		// 5) 나가기

		// 2. 고객 등록
		// 1) 등록
		// 2) 수정
		// 3) 삭제
		// 4) 나가기

		while (true) {
			System.out.println("회원관리 프로그램");
			System.out.println("1. 고객 정보 확인");
			System.out.println("2. 고객 등록");
			System.out.print(">>> ");
			int num = input.nextInt();
			
			switch (num) {
			case 1:
				sv2.checkService();
				break;
			case 2:
				sv1.registerService();
				break;

			default:
				break;
			}
		}
		
		
		
		
	}

}
