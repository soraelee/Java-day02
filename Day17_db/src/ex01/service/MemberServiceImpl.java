package ex01.service;

import java.util.ArrayList;
import java.util.Scanner;

import ex01.dao.MemberDAO;
import ex01.dto.MemberDTO;

public class MemberServiceImpl implements MemberService{
	private MemberDAO dao;
	public MemberServiceImpl() {
		dao = new MemberDAO();
	}
	
	public void memberView() { //dao �����ؼ� ������ ��������
		System.out.println("ȸ�� ���� ���");
		ArrayList<MemberDTO> member = dao.getMembers();
		if(member.size() == 0) {
			System.out.println("��ϵ� ������ �����ϴ�!");
		}
		else {
			System.out.println("-----------------");
			for (int i = 0; i < member.size(); i++) {
				MemberDTO dto = member.get(i);
				System.out.println("id : " + dto.getId());
				System.out.println("pwd : " + dto.getPwd());
				System.out.println("�̸� : " + dto.getName());
				System.out.println("���� : " + dto.getAge());
				System.out.println("-----------------");
			}
		}
	}
	public void modify() {
		System.out.println("���� ���");
		Scanner input = new Scanner(System.in);
		String id, pwd, name;
		int age;
		while (true) {
			System.out.println("������ id �Է�");
			id = input.next();
			MemberDTO m = dao.memberChk(id); // �ִ� ���� ������ ����
			if (m != null) 
				break;
			
			System.out.println("�������� �ʴ� id �Դϴ�..");
			
		}
		System.out.println("������ pwd");
		pwd = input.next();
		System.out.println("������ �̸�");
		name = input.next();
		System.out.println("������ ����");
		age = input.nextInt();
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id); dto.setPwd(pwd); dto.setName(name); dto.setAge(age);
//		int result = dao.modify(dto);
		int result = dao.modify(id, pwd, name, age);
		if (result == 1) {
			System.out.println("���� �Ǿ����ϴ�");
		} else {
			System.out.println("���� ����");
		}
		
	}
}
