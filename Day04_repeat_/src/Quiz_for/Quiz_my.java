package Quiz_for;

import java.util.Scanner;

public class Quiz_my {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int kor = 0, cnt = 0, tot_kor = 0, j = 1;
		double avg_kor = 0;
		
		System.out.print("총 학생 수 : ");
		cnt = input.nextInt();
		
		for (int i = 0 ; i < cnt ; i++) {
			
			System.out.print(j + "번 학생 국어 성적 : ");
			kor = input.nextInt();
			
			if (kor <= 100 && kor > 0) {
				tot_kor += kor;
				j++;
			}
			else {
				System.out.print(j + "번 학생 다시 입력해주세요 : ");
				kor = input.nextInt();
			}				
		}
		
		
		avg_kor = tot_kor / (double)cnt;
				
		System.out.println("총 점 : " + tot_kor);
		System.out.println("총 평균 : " + avg_kor);
		
		
	}

}
