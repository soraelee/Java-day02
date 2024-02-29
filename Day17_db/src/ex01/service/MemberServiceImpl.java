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
	
	public void memberView() { //dao 연동해서 데이터 가져오기
		System.out.println("회원 보기 기능");
		ArrayList<MemberDTO> member = dao.getMembers();
		if(member.size() == 0) {
			System.out.println("등록된 정보가 없습니다!");
		}
		else {
			System.out.println("-----------------");
			for (int i = 0; i < member.size(); i++) {
				MemberDTO dto = member.get(i);
				System.out.println("id : " + dto.getId());
				System.out.println("pwd : " + dto.getPwd());
				System.out.println("이름 : " + dto.getName());
				System.out.println("나이 : " + dto.getAge());
				System.out.println("-----------------");
			}
		}
	}
	public void modify() {
		System.out.println("수정 기능");
		Scanner input = new Scanner(System.in);
		String id, pwd, name;
		int age;
		while (true) {
			System.out.println("수정할 id 입력");
			id = input.next();
			MemberDTO m = dao.memberChk(id); // 있다 없다 유무만 받음
			if (m != null) 
				break;
			
			System.out.println("존재하지 않는 id 입니다..");
			
		}
		System.out.println("수정할 pwd");
		pwd = input.next();
		System.out.println("수정할 이름");
		name = input.next();
		System.out.println("수정할 나이");
		age = input.nextInt();
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id); dto.setPwd(pwd); dto.setName(name); dto.setAge(age);
//		int result = dao.modify(dto);
		int result = dao.modify(id, pwd, name, age);
		if (result == 1) {
			System.out.println("수정 되었습니다");
		} else {
			System.out.println("수정 실패");
		}
		
	}
}
