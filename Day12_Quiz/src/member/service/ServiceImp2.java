package member.service;

import java.util.ArrayList;
import java.util.Scanner;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class ServiceImp2 implements Service{
	MemberDAO dao = new MemberDAO();
	
	@Override
	public void checkService() {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("고객 정보확인 서비스");
			System.out.println("1) 금일 납부 목록");
			System.out.println("2) 고객 검색");
			System.out.println("3) 전체 목록");
			System.out.println("4) 연령대 별 목록");
			System.out.println("5) 나가기");
			System.out.print(">>> ");
			
			int num = input.nextInt();
			
			switch (num) {
			case 1:
				paylist();
				break;
			case 2:
				search();
				break;
			case 3:
				stList();
				break;
			case 4:
				searchAge();
				break;
			case 5:
				return;

			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		}
		
		
	}
	public void paylist() {
//		Scanner input = new Scanner(System.in);
		ArrayList<MemberDTO> d = new ArrayList<>();
//		System.out.print("금일 날짜 : ");
//		int day = input.nextInt();
		
//		d = dao.searchNo();
//		System.out.println("----------------");
//		for (MemberDTO dto : d) {
//			System.out.println("이름 : " + dto.getName());
//			System.out.println("나이 : " + dto.getAge());
//			System.out.println("납입 여부 : " + dto.getPay());
//			System.out.println("----------------");
//		}
	}
	public void search() {
		Scanner input = new Scanner(System.in);
		String name;

		System.out.print("검색할 이름 : ");
		name = input.next();
		MemberDTO dto = dao.search(name);
		System.out.println("----------------");
		System.out.println("이름 : " + dto.getName());
		System.out.println("나이 : " + dto.getAge());
		System.out.println("납입 일자 : " + dto.getDay());
		System.out.println("납입 여부 : " + dto.getPay());
		System.out.println("----------------");
	}
	public void stList() {
		System.out.println("----------------");
		for (MemberDTO dto : dao.arr) {
			System.out.println("이름 : " + dto.getName());
			System.out.println("나이 : " + dto.getAge());
			System.out.println("납입 일자 : " + dto.getDay());
			System.out.println("납입 여부 : " + dto.getPay());
			System.out.println("----------------");
		}
		
	}
	public void searchAge() {
		Scanner input = new Scanner(System.in);
		ArrayList<MemberDTO> d = new ArrayList<>();
		System.out.print("연령 : ");
		int age = input.nextInt();
		
		d = dao.searchAge(age);
		
		System.out.println("----------------");
		for (MemberDTO dto : d) {
			System.out.println("이름 : " + dto.getName());
			System.out.println("납입 일자 : " + dto.getDay());
			System.out.println("납입 여부 : " + dto.getPay());
			System.out.println("----------------");
		}
	}
	
	
	@Override
	public void registerService() {
		// TODO Auto-generated method stub
		
	}

}
