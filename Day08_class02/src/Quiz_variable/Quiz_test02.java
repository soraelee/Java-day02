package Quiz_variable;

import java.util.Scanner;

public class Quiz_test02 {
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	
	public void scanF() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = input.next();
	
		System.out.print("���� ���� : ");
		kor = input.nextInt();
		
		System.out.print("���� ���� : ");
		eng = input.nextInt();
		
		System.out.print("���� ���� : ");
		math = input.nextInt();
	}
	public void calF() {
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		switch ((int)avg / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade =  "B";
			break;
		case 7 :
			grade = "C";
			break;
		case 6 :
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		
	}
		public void printF() {
			System.out.println();
			System.out.println("-----����ǥ-----");
			System.out.println("�̸� : " + name);
			System.out.println("--------------");
			System.out.println("���� : " + kor);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + math);
			System.out.println("--------------");
			System.out.println("�հ� : " + sum);
			System.out.printf("��� : %.2f \n", avg);
			System.out.println("--------------");
			System.out.println("��� : " + grade);
			System.out.println("--------------");
		
	}
	
	
	
	
	
	
	

}
