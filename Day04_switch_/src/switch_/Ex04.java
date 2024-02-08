package switch_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//반복문
		Scanner input = new Scanner(System.in);
		
		String name;
		
		while (true) { // 참인지 거짓인지 - 참일 경우 반복 실행
			System.out.print("이름 입력 : ");
			name = input.next();
			
			System.out.println("입력한 이름 : "+ name);
		}
	}

}
