package Quiz_for;

public class Quiz_team7 {
	public static void main(String[] args) {
//		1번 문제
//
//		1부터 100까지의 짝수 합을 구하시오 [변수명 Psum]
//		1부터 100까지의 홀수 합을 구하시오 [변수명 Hsum]
		
//		int Psum = 0, Hsum = 0, j = 1;
//		
//		for (int i = 0 ; i < 100; i++) {
//			
//			if (j % 2 == 0)
//				Psum += j;
//			else 
//				Hsum += j;
//				
//			j++;
//		}
//		
//		System.out.println("1 ~ 100 홀수의 합 : " + Hsum);
//		System.out.println("1 ~ 100 짝수의 합 : " + Psum);


//		2번 문제
//
//		구구단을 작성하세요
		
//		for (int i = 1 ; i <= 9 ; i ++) {
//			for (int j = 1 ; j <= 9 ; j++)
//				System.out.println(i + "X" + j + "=" + i*j);
//		}
		
//		3번 문제
//		[보기의] 별 트리를 만드세요
//
//			[보기]	  *     중첩 for문을 사용하여 완성하시오
//				     ***
//				    *****
//				   *******
//				  *********  
		
		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; 5 - i - 1 > j ; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i ; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < i ; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

		
	}

}
