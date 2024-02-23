package file.service;

import java.util.Scanner;

import file.dao.MemberDAO;
import file.dto.MemberDTO;

public class ServiceMemberImp1 implements ServiceMember{
	private MemberDAO dao;
	public ServiceMemberImp1() {
		dao = new MemberDAO();
	}
	@Override
	public void register() {//1. ȸ������
		MemberDTO dto = new MemberDTO();
		Scanner input = new Scanner(System.in);
		
		System.out.print("���̵� �Է� : ");
		dto.setId(input.next());
		
		System.out.print("�̸� �Է� : ");
		dto.setName(input.next());
		
		dao.register(dto);
		
	}
	@Override
	public void list() { //3. ȸ�� ���
		String[] listFile = dao.getList();
		if (listFile.length == 0) {
			System.out.println("����� ����� �����ϴ�");
		}
		else {
			for(int i = 0 ; i < listFile.length ; i++) {
				System.out.println(i + 1 + ". "+ listFile[i]);
			}
		}
	}
	@Override
	public void delete() {// 4. Ż��
		Scanner input = new Scanner(System.in);
		String id;
		System.out.println("������ id �Է�");
		id = input.next();
		dao.delete(id);
	}
	@Override
	public void search() {
		Scanner input = new Scanner(System.in);
		String id;
		System.out.println("�˻��� id �Է�");
		id = input.next();
		MemberDTO d = dao.search(id);
		if (d != null) {
			System.out.println("id : " + d.getId());
			System.out.println("name : " + d.getName());
		}
	}
	
	

}
