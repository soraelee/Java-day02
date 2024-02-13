package Quiz_array_;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
//		짝수 입력 시 index가 짝수 번째 인 값 출력
//		홀수 입력 시 index가 홀수 번째인 값 출력
		
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[] {10, 54, 13, 17, 25, 30};
		String odd_even = null;
		
		System.out.print("짝수 홀수 입력 : ");
		odd_even = input.next();
		
		for (int i = 0 ; i < arr.length ; i++) {
			switch (odd_even) {
			case "짝수" :
				if (i % 2 == 0) {
					System.out.println("짝수 " + i + "번째 배열");
					System.out.println("값 : " + arr[i]);
				}
				break;
			case "홀수" :
				if (i % 2 == 1) {
					System.out.println("홀수 " + i + "번째 배열");
					System.out.println("값 : " + arr[i]);
				}
				break;
			}
		}
		//인덱스를 미리 정의하여 짝수 홀수 분류
		int k = 0;
		if( odd_even.equals("짝수")) {
			k = 0;
		}else {
			k = 1;
		}
		for( ;k < arr.length ; k = k + 2 ) {
			System.out.println(k + "."+arr[k]);
		}

		//삼항 연산자의 활용
		
		for(int j = (odd_even.equals("짝수")?0:1) ; j < arr.length ; j+=2  ) {
			System.out.println(j + "."+arr[j]);
	      }


	}

}
