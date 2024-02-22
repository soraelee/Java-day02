package member.service;

import java.util.Scanner;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class ServiceImp1 implements Service{
	MemberDAO dao = new MemberDAO();

	@Override
	public void checkService() {}
	
	@Override
	public void registerService() {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("�� ��� ����");
			System.out.println("1) ���");
			System.out.println("2) ����");
			System.out.println("3) ����");
			System.out.println("4) ������");
			System.out.print(">>> ");
			
			int num = input.nextInt();
			
			switch (num) {
			case 1:
				register();
				break;
			case 2:
				edit();
				break;
			case 3:
				delete();
				break;
			case 4:
				return;
			default:
				System.out.println("�ٽ� �Է����ּ���");
				break;
			}
			
		}
		
	}

	public void paylist() {
		
	}
	public void register() {
		Scanner input = new Scanner(System.in);
		MemberDTO dto = new MemberDTO();
		String name, pay;
		int age, day;
		
		System.out.print("�̸� : ");
		name = input.next();
		dto.setName(name);
		
		System.out.print("���� : ");
		age = input.nextInt();
		dto.setAge(age);
		
		System.out.print("����� : ");
		day = input.nextInt();
		dto.setDay(day);
		
		System.out.print("���� ���� : ");
		pay = input.next();
		dto.setPay(pay);
		
		dao.register(dto);
	}
	public void edit() {
		Scanner input = new Scanner(System.in);
		String name, pay;
		int age, day;
		System.out.print("������ �̸� : ");
		name = input.next();
		MemberDTO d = dao.search(name);
		
		if (d != null) {
			System.out.println("� ���� �����Ͻðڽ��ϱ�?");
			System.out.println("1. ����");
			System.out.println("2. �����");
			System.out.println("3. ���� ����");
			System.out.print(">>> ");
			int num = input.nextInt();
			
			System.out.print("�Է� : ");
			switch (num) {
			case 1:
				age = input.nextInt();
				d.setAge(age);
				break;
			case 2:
				day = input.nextInt();
				d.setDay(day);
				break;
			case 3:
				pay = input.next();
				d.setPay(pay);
				break;
			}
		}
	}
	public void delete() {
		Scanner input = new Scanner(System.in);
		System.out.print("������ �̸� : ");
		String name = input.next();
		MemberDTO d = dao.search(name);
		dao.delete(d);
	}

}
