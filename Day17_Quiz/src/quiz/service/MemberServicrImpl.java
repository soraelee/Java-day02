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
			System.out.println("----회원 목록----");
			System.out.println("1. 전체 목록");
			System.out.println("2. 미납부 목록");
			System.out.println("3. 연령 별 목록");
			System.out.println("4. 나가기");
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
			System.out.print("검색 아이디 입력 : " );
			String id = input.next();
			boolean bool = dao.memberChk(id);
			if (bool == true) {
				MemberDTO dto = dao.memberSearch(id);
				System.out.println("----회원 검색 결과----");
				System.out.println("아이디 : " + dto.getId());
				System.out.println("이름 : " + dto.getName());
				System.out.println("연령 : " + dto.getAge());
				System.out.println("납부일 : " + dto.getDay());
				System.out.println("납부 여부 : " + dto.getPay());
				System.out.println("-----------------");
				break;
			} else 
				System.out.println("존재하지 않는 정보입니다. 다시 입력해주세요");
			
		}
		
	}

	public void memberRegist() {
		Scanner input = new Scanner(System.in);
		MemberDTO dto = new MemberDTO();
		
		while (true) {
			System.out.println("아이디 : " );
			String id = input.next();
			boolean bool = dao.memberChk(id);
			if (bool == false) {
				dto.setId(id);
				break;
			}
			System.out.println("존재하는 id 입니다.");
		}
		
		System.out.print("이름 : ");
		dto.setName(input.next());
		System.out.print("연령 : ");
		dto.setAge(input.nextInt());
		System.out.print("납부일 : ");
		dto.setDay(input.nextInt());
		while (true) {
			System.out.print("납부 여부 : ");
			String pay = input.next();
			if (pay.equals("yes") || pay.equals("no")) {
				dto.setPay(pay);
				break;
			}
			System.out.println("다시 입력하세요(yes or no)");
		}
		
		int result = dao.memberRegist(dto);
		if (result == 1)
			System.out.println("회원 등록이 완료되었습니다. ");
		
	}

	public void memberDel() {
		Scanner input = new Scanner(System.in);
		MemberDTO dto = new MemberDTO();
		
		while (true) {
			System.out.println("삭제하실 회원의 아이디 : " );
			String id = input.next();
			boolean bool = dao.memberChk(id);
			if (bool == true) {
				dao.memberDel(id);
				System.out.println("해당 회원의 정보가 삭제되었습니다.");
				break;
			}
			System.out.println("존재하지 않는 id 입니다.");
		}
	}
}
