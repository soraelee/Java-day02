package collection.service;

import java.util.ArrayList;
import java.util.Scanner;

import collection.dao.MemberDAO;
import collection.dto.MemberDTO;

public class MemberServiceImp1 implements MemberService{//중간자 => 데이터베이스에 접근해서 연산을 담당 //인터페이스 상속
	
	MemberDAO dao;
	
	public MemberServiceImp1() {
		dao = new MemberDAO(); //Dto가 아닌 Dao와 연동
	}
	@Override
	public void display() {
		Scanner input = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("1. 저장");
			System.out.println("2. 목록 확인");
			System.out.println("3. 검색");
			System.out.println("4. 종료");
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
		System.out.println("회원가입 기능입니다.");
		String name, addr;
		MemberDTO dto = new MemberDTO();
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력");
		name = input.next();
		
		System.out.println("주소 입력");
		dto.setAddr(input.next());
		dto.setName(name);
		dao.register(dto);
	}

	private void memberViews() {
		System.out.println("목록 확인 기능입니다. ");
		ArrayList<MemberDTO> arr = dao.getData();
		
		for (MemberDTO m : arr) {
			System.out.println("이름 : " + m.getName());
			System.out.println("주소 : " + m.getName());
			System.out.println("-------------------");
		}
		dao.getData();
	} 
	
	
	private void search() {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("검색이름 입력");
		name = input.next();
		MemberDTO m = dao.search(name);
		if(m == null) {
			System.out.println(name + "사용자는 없습니다.");
		}else {
			System.out.println("이름 : " + m.getName());
			System.out.println("주소 : " + m.getAddr());
		}
		
	}
	
}
