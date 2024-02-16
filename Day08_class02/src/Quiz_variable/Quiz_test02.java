package Quiz_variable;

import java.util.Scanner;

public class Quiz_test02 {
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	
	public void scanF() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = input.next();
	
		System.out.print("국어 성적 : ");
		kor = input.nextInt();
		
		System.out.print("영어 성적 : ");
		eng = input.nextInt();
		
		System.out.print("수학 성적 : ");
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
			System.out.println("-----성적표-----");
			System.out.println("이름 : " + name);
			System.out.println("--------------");
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("--------------");
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.2f \n", avg);
			System.out.println("--------------");
			System.out.println("등급 : " + grade);
			System.out.println("--------------");
		
	}
	
	
	
	
	
	
	

}
