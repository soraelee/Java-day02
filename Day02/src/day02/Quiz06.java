package day02;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		//학생 이름과 국어, 영어 수학 점수를 입력 받아 출력하시오
		Scanner input = new Scanner(System.in);
		String name = null;
		int kor = 0, eng = 0, math = 0, sum = 0;
		double avg = 0;
		
		System.out.println("학생 이름 : ");
		name = input.next();
		System.out.println("국어 점수 : ");
		kor = input.nextInt();
		System.out.println("영어 점수 : ");
		eng = input.nextInt();
		System.out.println("수학 점수 : ");
		math = input.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		System.out.println("================ 학생 정보 =====================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("----------------------------------------------");
//		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f", name, kor, eng, math, sum, avg);
	}

}
