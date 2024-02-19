package Quiz_constructor_student;

import java.util.Scanner;

public class MemberService {
	Scanner input = new Scanner(System.in);
	MemberDTO dto = new MemberDTO();
	private String name, grade;
	private int kor, math, eng;
	
	public void display() {
		while (true) {
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 보기");
			System.out.println("3. 정보 수정");
			System.out.println("4. 회원 탈퇴");
			System.out.print(">>> ");
			int num = input.nextInt();
			switch (num) {
			case 1: //등록
				register();
				break;
			case 2: //보기
				print();
				break;
			case 3:
				edit();
				break;
			case 4:
				exit();
				break;
			default:
				System.out.println("잘못 입력된 숫자 입니다.");	
				break;
			}
			
		}
	}
	private void opSum() {
		dto.setSum(dto.getKor() + dto.getMath() + dto.getEng());
	}
	private void opAvg() {
		dto.setAvg(dto.getSum()/3.0);
	}
	private void opGrade() {
		switch ((int) dto.getAvg() / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default:
			grade = "F";
			break;
		}
		dto.setGrade(grade);
	}
	private void register() {
		if (dto.getName() == null) {
			System.out.print("이름 : ");
			name = input.next();
			System.out.print("국어 : ");
			kor = input.nextInt();
			System.out.print("수학 : ");
			math = input.nextInt();
			System.out.print("영어 : ");
			eng = input.nextInt();
			
			dto.setName(name);
			dto.setKor(kor);
			dto.setMath(math);
			dto.setEng(eng);

		}
		else 
			System.out.println("이미 등록된 정보가 있습니다.");
		
		opSum();
		opAvg();
		opGrade();
	}
	
	private void print() {
		System.out.println("----성적표-----");
		System.out.println("이름 : " + dto.getName());
		System.out.println("국어 : " + dto.getKor());
		System.out.println("수학 : " + dto.getMath());
		System.out.println("영어 : " + dto.getEng());
		System.out.println("--------------");
		System.out.println("합계 : " + dto.getSum());
		System.out.println("평균 : " + dto.getAvg());
		System.out.println("등급 : " + dto.getGrade());
		System.out.println("---------------");
		
	}
	private void edit() {
		System.out.println("1. 이름 수정");
		System.out.println("2. 국어점수 수정");
		System.out.println("3. 수학점수 수정");
		System.out.println("4. 영어점수 수정");
		System.out.print(">>> ");
		int num = input.nextInt();
		
		if (num == 1) {
			System.out.print("이름 : ");
			name = input.next();
			dto.setName(name);
		}
		else {
			if (num == 2) {
				System.out.print("국어 : ");
				kor = input.nextInt();
				dto.setKor(kor);
			}
			else if (num == 3) {
				System.out.print("수학 : ");
				math = input.nextInt();
				dto.setMath(math);
			}
			else if (num == 4) {
				System.out.print("영어 : ");
				eng = input.nextInt();
				dto.setEng(eng);
			}
			else 
				System.out.println("잘못 입력된 숫자 입니다.");
			
			opSum();
			opAvg();
			opGrade();
		}
		
	}
	private void exit() {
			dto.setName(null);
			dto.setKor(0);
			dto.setMath(0);
			dto.setEng(0);
			dto.setSum(0);
			dto.setAvg(0);
			dto.setGrade(null);
	}

}
