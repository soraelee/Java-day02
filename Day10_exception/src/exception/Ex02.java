package exception;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		while (true) {
			System.out.println("수 입력");
			num = input.nextInt();
			try {
				System.out.println("결과 : " + (100 / num));
			}
			catch (Exception e) {//자식 클래스 일 경우 부모 클래스로 퉁쳐서 사용 가능 (대신 처리)
				System.out.println("0 입력하시면 안되요!");
				System.out.println("에러 : " + e);
			}
		}
	}

}
