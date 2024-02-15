package Quiz_array_;

import java.util.Scanner;

public class Quiz_team2 {
	public static void main(String[] args) {
//		문제) 1
//
//		정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
//	
//		1+1+1+1
//		1+1+2
//		1+2+1
//		2+1+1
//		2+2
//		1+3
//		3+1
//		정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
//	
//		입력
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.
//	
//		출력
//		각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		//일단 넘김
		
//		문제) 2
//
//		배열에 저장되 요소의 합과 최대값을 구하세요
//
		int arr[] = new int [] {12, 56, 23, 39};
		int sum = 0, max = 0;
		
		for (int a : arr) {
			sum += a;
			if (max < a) {
				max = a;
			}
		}
		System.out.println("합 : " + sum);
		System.out.println("최댓값 : " + max);
		
//		문제) 3
//
//		숫자 5개를 입력받아 높은 순서대로 나열하세요
		
		int numb[] = new int[5];
		int vsnum = 0, index = 0, n_index = 0;
		boolean bool = true;
		
		System.out.print("수 입력 : ");
		int n = input.nextInt();
//		vsnum = n;
		numb[0] = n;
		
		for (int i = 1 ; i < numb.length ; i++) {
			System.out.print("수 입력 : ");
			n = input.nextInt();
			numb[i] = n;
//			for (int j = numb.length - i ;  j >= 1 ; j--) { // 비교횟수는 1-2-3-4로 늘어남
				for (int k = 0 ; k < i ; k++) {
					n = numb[i];
					vsnum = numb[k];
					if (n > vsnum) {
						numb[i] = vsnum;
						numb[k] = n;
						System.out.print("현재 배열 : ");
						for (int a : numb) {
							System.out.print(a + "  ");
						}
						System.out.println();
					} 
					else {
						numb[i] = n;
						numb[k] = vsnum;
						System.out.print("현재 배열 : ");
						for (int a : numb) {
							System.out.print(a + "  ");
						}
						System.out.println();
					}
				}
//			}
		}
		System.out.print("최종 배열 : ");
		for (int a : numb) {
			System.out.print(a + "  ");
		}
	}

}
