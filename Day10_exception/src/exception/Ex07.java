package exception;

import java.util.Scanner;

//강제 예외
//코드상 문법적으로는 문제는 발생하지 않으나, 개발자의 의도와 다른 경우 

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.print("나이 입력 : ");
		try {
			age = input.nextInt();
			if (age < 0) {
				throw new Exception("음수는 안돼요!");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("당신의 나이는 : " + age);
	}

}
