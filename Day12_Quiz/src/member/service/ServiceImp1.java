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
			System.out.println("고객 등록 서비스");
			System.out.println("1) 등록");
			System.out.println("2) 수정");
			System.out.println("3) 삭제");
			System.out.println("4) 나가기");
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
				System.out.println("다시 입력해주세요");
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
		
		System.out.print("이름 : ");
		name = input.next();
		dto.setName(name);
		
		System.out.print("나이 : ");
		age = input.nextInt();
		dto.setAge(age);
		
		System.out.print("등록일 : ");
		day = input.nextInt();
		dto.setDay(day);
		
		System.out.print("납부 여부 : ");
		pay = input.next();
		dto.setPay(pay);
		
		dao.register(dto);
	}
	public void edit() {
		Scanner input = new Scanner(System.in);
		String name, pay;
		int age, day;
		System.out.print("수정할 이름 : ");
		name = input.next();
		MemberDTO d = dao.search(name);
		
		if (d != null) {
			System.out.println("어떤 정보 수정하시겠습니까?");
			System.out.println("1. 나이");
			System.out.println("2. 등록일");
			System.out.println("3. 납부 여부");
			System.out.print(">>> ");
			int num = input.nextInt();
			
			System.out.print("입력 : ");
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
		System.out.print("삭제할 이름 : ");
		String name = input.next();
		MemberDTO d = dao.search(name);
		dao.delete(d);
	}

}
