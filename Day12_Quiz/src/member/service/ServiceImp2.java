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
			System.out.println("�� ����Ȯ�� ����");
			System.out.println("1) ���� ���� ���");
			System.out.println("2) �� �˻�");
			System.out.println("3) ��ü ���");
			System.out.println("4) ���ɴ� �� ���");
			System.out.println("5) ������");
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
				System.out.println("�ٽ� �Է����ּ���");
				break;
			}
		}
		
		
	}
	public void paylist() {
//		Scanner input = new Scanner(System.in);
		ArrayList<MemberDTO> d = new ArrayList<>();
//		System.out.print("���� ��¥ : ");
//		int day = input.nextInt();
		
//		d = dao.searchNo();
//		System.out.println("----------------");
//		for (MemberDTO dto : d) {
//			System.out.println("�̸� : " + dto.getName());
//			System.out.println("���� : " + dto.getAge());
//			System.out.println("���� ���� : " + dto.getPay());
//			System.out.println("----------------");
//		}
	}
	public void search() {
		Scanner input = new Scanner(System.in);
		String name;

		System.out.print("�˻��� �̸� : ");
		name = input.next();
		MemberDTO dto = dao.search(name);
		System.out.println("----------------");
		System.out.println("�̸� : " + dto.getName());
		System.out.println("���� : " + dto.getAge());
		System.out.println("���� ���� : " + dto.getDay());
		System.out.println("���� ���� : " + dto.getPay());
		System.out.println("----------------");
	}
	public void stList() {
		System.out.println("----------------");
		for (MemberDTO dto : dao.arr) {
			System.out.println("�̸� : " + dto.getName());
			System.out.println("���� : " + dto.getAge());
			System.out.println("���� ���� : " + dto.getDay());
			System.out.println("���� ���� : " + dto.getPay());
			System.out.println("----------------");
		}
		
	}
	public void searchAge() {
		Scanner input = new Scanner(System.in);
		ArrayList<MemberDTO> d = new ArrayList<>();
		System.out.print("���� : ");
		int age = input.nextInt();
		
		d = dao.searchAge(age);
		
		System.out.println("----------------");
		for (MemberDTO dto : d) {
			System.out.println("�̸� : " + dto.getName());
			System.out.println("���� ���� : " + dto.getDay());
			System.out.println("���� ���� : " + dto.getPay());
			System.out.println("----------------");
		}
	}
	
	
	@Override
	public void registerService() {
		// TODO Auto-generated method stub
		
	}

}
