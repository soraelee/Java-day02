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
	public void register() { //회원 등록
		Scanner input = new Scanner(System.in);
		MemberDTO dto = new MemberDTO();
		
		System.out.println("등록할 회원의 정보를 입력하세요");
		System.out.print("이름 : ");
		dto.setName(input.next());
		
		System.out.print("나이 : ");
		dto.setAge(input.nextInt());
		
		System.out.print("등록 일자 : ");
		dto.setDay(input.nextInt());
		
		System.out.print("납입 여부 : ");
		dto.setPay(input.next().equals("yes") ? true : false);
		
		dto.setId(dto.getAge() + "_" + dto.getName());
		
		if (dao.Exist(dto.getId()) == false) 
			System.out.println("이미 존재하는 회원입니다.");
		else 
			dao.register(dto);
		
	}

	@Override
	public void list() {
		System.out.println("현재 등록된 고객 리스트 입니다.");
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
		System.out.println("현재 납부 이전인 명단 입니다.");
		dto = dao.paylist(dao.allList());
		for (MemberDTO d : dto) {
			System.out.println("--------------------");
			System.out.println("이름 : " + d.getName());
			System.out.println("나이 : " + d.getAge());
			System.out.println("등록 일자 : " + d.getDay() + "일");
		}
		System.out.println("--------------------");
		
	}
	
	

}
