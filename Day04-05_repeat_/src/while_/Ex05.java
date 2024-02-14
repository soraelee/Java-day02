package while_;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//연산하는 방법
		Scanner input = new Scanner(System.in);
		int i, temp;
		
		System.out.println("수 입력");
		i = input.nextInt();
		
		boolean bool = true;
		
		while (bool) {
			System.out.println("while");
//			temp = i % 10;
//			i = i / 10;
//			System.out.print(temp + ", ");
			if ( bool ) {
				System.out.println("bool : " + bool);
				bool = false ; 
				break;
			}
			System.out.println("while 종속문장");
			
		}
		System.out.println("다음 문장을 실행");
	}
}
