package Quiz_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("인증 프로그램 입니다.");
		
		System.out.println("주민번호 입력(앞 6자리)");
		
		try {
			num = input.nextInt();
			if (num / 100000 == 0 || num / 100000 > 9)
				throw new Exception("길이가 틀렸습니다");
			else if (num / 100000 == 9 )
				throw new Exception("가입 불가");
			
			System.out.println("가입가능");
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
