package Quiz_constructor_student;

import java.util.Scanner;

public class MemberService {
	Scanner input = new Scanner(System.in);
	MemberDTO dto = new MemberDTO();
	private String name, grade;
	private int kor, math, eng;
	
	public void display() {
		while (true) {
			System.out.println("1. �л� ���");
			System.out.println("2. �л� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ȸ�� Ż��");
			System.out.print(">>> ");
			int num = input.nextInt();
			switch (num) {
			case 1: //���
				register();
				break;
			case 2: //����
				print();
				break;
			case 3:
				edit();
				break;
			case 4:
				exit();
				break;
			default:
				System.out.println("�߸� �Էµ� ���� �Դϴ�.");	
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
			System.out.print("�̸� : ");
			name = input.next();
			System.out.print("���� : ");
			kor = input.nextInt();
			System.out.print("���� : ");
			math = input.nextInt();
			System.out.print("���� : ");
			eng = input.nextInt();
			
			dto.setName(name);
			dto.setKor(kor);
			dto.setMath(math);
			dto.setEng(eng);

		}
		else 
			System.out.println("�̹� ��ϵ� ������ �ֽ��ϴ�.");
		
		opSum();
		opAvg();
		opGrade();
	}
	
	private void print() {
		System.out.println("----����ǥ-----");
		System.out.println("�̸� : " + dto.getName());
		System.out.println("���� : " + dto.getKor());
		System.out.println("���� : " + dto.getMath());
		System.out.println("���� : " + dto.getEng());
		System.out.println("--------------");
		System.out.println("�հ� : " + dto.getSum());
		System.out.println("��� : " + dto.getAvg());
		System.out.println("��� : " + dto.getGrade());
		System.out.println("---------------");
		
	}
	private void edit() {
		System.out.println("1. �̸� ����");
		System.out.println("2. �������� ����");
		System.out.println("3. �������� ����");
		System.out.println("4. �������� ����");
		System.out.print(">>> ");
		int num = input.nextInt();
		
		if (num == 1) {
			System.out.print("�̸� : ");
			name = input.next();
			dto.setName(name);
		}
		else {
			if (num == 2) {
				System.out.print("���� : ");
				kor = input.nextInt();
				dto.setKor(kor);
			}
			else if (num == 3) {
				System.out.print("���� : ");
				math = input.nextInt();
				dto.setMath(math);
			}
			else if (num == 4) {
				System.out.print("���� : ");
				eng = input.nextInt();
				dto.setEng(eng);
			}
			else 
				System.out.println("�߸� �Էµ� ���� �Դϴ�.");
			
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
