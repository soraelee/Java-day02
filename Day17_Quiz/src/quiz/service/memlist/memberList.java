package quiz.service.memlist;

import java.util.ArrayList;
import java.util.Scanner;

import quiz.dao.MemberDAO;
import quiz.dto.MemberDTO;

public class memberList {
	MemberDAO dao ;
	public memberList() {
		dao = new MemberDAO();
	}
	public void totalMember() {
		System.out.println("----회원 전체 목록----");
		
		ArrayList<MemberDTO> mem = dao.totalMember();
		
		for (MemberDTO m : mem) {
			System.out.println("아이디 : " + m.getId());
			System.out.println("이름 : " + m.getName());
			System.out.println("연령 : " + m.getAge());
			System.out.println("납부일 : " + m.getDay());
			System.out.println("납부 여부 : " + m.getPay());
			System.out.println("-----------------");
		}
	}
	
	public void payMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("금일 날짜 : ");
		int day = input.nextInt(); 
		ArrayList<MemberDTO> mem = dao.payMember(day);
		
		System.out.println("----미납부 회원 목록----");
		
		for (MemberDTO m : mem) {
			System.out.println("아이디 : " + m.getId());
			System.out.println("이름 : " + m.getName());
			System.out.println("연령 : " + m.getAge());
			System.out.println("납부일 : " + m.getDay());
			System.out.println("납부 여부 : " + m.getPay());
			System.out.println("-----------------");
		}
	}
	public void ageMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("연령 입력 : ");
		int age = input.nextInt(); 
		ArrayList<MemberDTO> mem = dao.ageMember(age);
		
		System.out.println("----" +age+ "세 목록----");
		
		for (MemberDTO m : mem) {
			System.out.println("아이디 : " + m.getId());
			System.out.println("이름 : " + m.getName());
			System.out.println("연령 : " + m.getAge());
			System.out.println("납부일 : " + m.getDay());
			System.out.println("납부 여부 : " + m.getPay());
			System.out.println("-----------------");
		}
	}

}
