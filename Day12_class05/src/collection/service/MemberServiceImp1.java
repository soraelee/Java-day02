package collection.service;

import java.util.ArrayList;
import java.util.Scanner;

import collection.dao.MemberDAO;
import collection.dto.MemberDTO;

public class MemberServiceImp1 implements MemberService{//�߰��� => �����ͺ��̽��� �����ؼ� ������ ��� //�������̽� ���
	
	MemberDAO dao;
	
	public MemberServiceImp1() {
		dao = new MemberDAO(); //Dto�� �ƴ� Dao�� ����
	}
	@Override
	public void display() {
		Scanner input = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("1. ����");
			System.out.println("2. ��� Ȯ��");
			System.out.println("3. �˻�");
			System.out.println("4. ����");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				register();
				break;
			case 2:
				memberViews();
				break;
			case 3:
				search();
				break;

			case 4:
				return;
			}
		}
	}


	private void register() {
		System.out.println("ȸ������ ����Դϴ�.");
		String name, addr;
		MemberDTO dto = new MemberDTO();
		Scanner input = new Scanner(System.in);
		System.out.println("�̸� �Է�");
		name = input.next();
		
		System.out.println("�ּ� �Է�");
		dto.setAddr(input.next());
		dto.setName(name);
		dao.register(dto);
	}

	private void memberViews() {
		System.out.println("��� Ȯ�� ����Դϴ�. ");
		ArrayList<MemberDTO> arr = dao.getData();
		
		for (MemberDTO m : arr) {
			System.out.println("�̸� : " + m.getName());
			System.out.println("�ּ� : " + m.getName());
			System.out.println("-------------------");
		}
		dao.getData();
	} 
	
	
	private void search() {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("�˻��̸� �Է�");
		name = input.next();
		MemberDTO m = dao.search(name);
		if(m == null) {
			System.out.println(name + "����ڴ� �����ϴ�.");
		}else {
			System.out.println("�̸� : " + m.getName());
			System.out.println("�ּ� : " + m.getAddr());
		}
		
	}
	
}
