package quiz.service;

import java.util.Scanner;

import quiz.dao.MemberDAO;
import quiz.dto.MemberDTO;

public class MemberServicrImpl implements MemberService {
	MemberDAO dao ;
	public MemberServicrImpl() {
		dao = new MemberDAO();
	}
	public void memberList() {
		Scanner input = new Scanner(System.in);
		quiz.service.memlist.memberList ml = new quiz.service.memlist.memberList();
		
		while(true) {
			System.out.println("----ȸ�� ���----");
			System.out.println("1. ��ü ���");
			System.out.println("2. �̳��� ���");
			System.out.println("3. ���� �� ���");
			System.out.println("4. ������");
			System.out.print(">>> ");
			int num = input.nextInt();
			
			switch (num) {
			case 1:
				ml.totalMember();
				break;
			case 2:
				ml.payMember();
				break;
			case 3:
				ml.ageMember();
				break;
			case 4:
				return;
			}
		}
	}

	
	public void memberSearch() {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("�˻� ���̵� �Է� : " );
			String id = input.next();
			boolean bool = dao.memberChk(id);
			if (bool == true) {
				MemberDTO dto = dao.memberSearch(id);
				System.out.println("----ȸ�� �˻� ���----");
				System.out.println("���̵� : " + dto.getId());
				System.out.println("�̸� : " + dto.getName());
				System.out.println("���� : " + dto.getAge());
				System.out.println("������ : " + dto.getDay());
				System.out.println("���� ���� : " + dto.getPay());
				System.out.println("-----------------");
				break;
			} else 
				System.out.println("�������� �ʴ� �����Դϴ�. �ٽ� �Է����ּ���");
			
		}
		
	}

	public void memberRegist() {
		Scanner input = new Scanner(System.in);
		MemberDTO dto = new MemberDTO();
		
		while (true) {
			System.out.println("���̵� : " );
			String id = input.next();
			boolean bool = dao.memberChk(id);
			if (bool == false) {
				dto.setId(id);
				break;
			}
			System.out.println("�����ϴ� id �Դϴ�.");
		}
		
		System.out.print("�̸� : ");
		dto.setName(input.next());
		System.out.print("���� : ");
		dto.setAge(input.nextInt());
		System.out.print("������ : ");
		dto.setDay(input.nextInt());
		while (true) {
			System.out.print("���� ���� : ");
			String pay = input.next();
			if (pay.equals("yes") || pay.equals("no")) {
				dto.setPay(pay);
				break;
			}
			System.out.println("�ٽ� �Է��ϼ���(yes or no)");
		}
		
		int result = dao.memberRegist(dto);
		if (result == 1)
			System.out.println("ȸ�� ����� �Ϸ�Ǿ����ϴ�. ");
		
	}

	public void memberDel() {
		Scanner input = new Scanner(System.in);
		MemberDTO dto = new MemberDTO();
		
		while (true) {
			System.out.println("�����Ͻ� ȸ���� ���̵� : " );
			String id = input.next();
			boolean bool = dao.memberChk(id);
			if (bool == true) {
				dao.memberDel(id);
				System.out.println("�ش� ȸ���� ������ �����Ǿ����ϴ�.");
				break;
			}
			System.out.println("�������� �ʴ� id �Դϴ�.");
		}
	}
}
