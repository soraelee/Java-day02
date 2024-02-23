package quiz.service;

import java.util.ArrayList;
import java.util.Scanner;

import quiz.dao.MemberDAO;
import quiz.dto.MemberDTO;

public class MemberServiceImpl implements MemberService{
	MemberDAO dao ;
	public MemberServiceImpl() {
		dao = new MemberDAO();
	}

	@Override
	public void register() { //ȸ�� ���
		Scanner input = new Scanner(System.in);
		MemberDTO dto = new MemberDTO();
		
		System.out.println("����� ȸ���� ������ �Է��ϼ���");
		System.out.print("�̸� : ");
		dto.setName(input.next());
		
		System.out.print("���� : ");
		dto.setAge(input.nextInt());
		
		System.out.print("��� ���� : ");
		dto.setDay(input.nextInt());
		
		System.out.print("���� ���� : ");
		dto.setPay(input.next().equals("yes") ? true : false);
		
		dto.setId(dto.getAge() + "_" + dto.getName());
		
		if (dao.Exist(dto.getId()) == false) 
			System.out.println("�̹� �����ϴ� ȸ���Դϴ�.");
		else 
			dao.register(dto);
		
	}

	@Override
	public void list() {
		System.out.println("���� ��ϵ� �� ����Ʈ �Դϴ�.");
		String[] ls = dao.list();
		int i = 1;
		for (String cus : ls) {
			System.out.println(i + ": " + cus);
			i++;
		}
	}

	@Override
	public void paylist() {
		ArrayList<MemberDTO> dto = new ArrayList<>();
		System.out.println("���� ���� ������ ��� �Դϴ�.");
		dto = dao.paylist(dao.allList());
		for (MemberDTO d : dto) {
			System.out.println("--------------------");
			System.out.println("�̸� : " + d.getName());
			System.out.println("���� : " + d.getAge());
			System.out.println("��� ���� : " + d.getDay() + "��");
		}
		System.out.println("--------------------");
		
	}
	
	

}
