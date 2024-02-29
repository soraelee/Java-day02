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
		System.out.println("----ȸ�� ��ü ���----");
		
		ArrayList<MemberDTO> mem = dao.totalMember();
		
		for (MemberDTO m : mem) {
			System.out.println("���̵� : " + m.getId());
			System.out.println("�̸� : " + m.getName());
			System.out.println("���� : " + m.getAge());
			System.out.println("������ : " + m.getDay());
			System.out.println("���� ���� : " + m.getPay());
			System.out.println("-----------------");
		}
	}
	
	public void payMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� ��¥ : ");
		int day = input.nextInt(); 
		ArrayList<MemberDTO> mem = dao.payMember(day);
		
		System.out.println("----�̳��� ȸ�� ���----");
		
		for (MemberDTO m : mem) {
			System.out.println("���̵� : " + m.getId());
			System.out.println("�̸� : " + m.getName());
			System.out.println("���� : " + m.getAge());
			System.out.println("������ : " + m.getDay());
			System.out.println("���� ���� : " + m.getPay());
			System.out.println("-----------------");
		}
	}
	public void ageMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int age = input.nextInt(); 
		ArrayList<MemberDTO> mem = dao.ageMember(age);
		
		System.out.println("----" +age+ "�� ���----");
		
		for (MemberDTO m : mem) {
			System.out.println("���̵� : " + m.getId());
			System.out.println("�̸� : " + m.getName());
			System.out.println("���� : " + m.getAge());
			System.out.println("������ : " + m.getDay());
			System.out.println("���� ���� : " + m.getPay());
			System.out.println("-----------------");
		}
	}

}
