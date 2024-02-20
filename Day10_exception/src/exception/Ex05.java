package exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //stream(스트림) : 입력을 받은 내용을 연결하는 연결 통로 
												//열었으면 닫아야 함
		int x ;
		System.out.println("수 입력" );
		x = input.nextInt();

		try {
			int result = 10 / x;
			System.out.println("결과 : result " + result );
			return; //문제가 발생하지 않으면 함수 종료

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			input.close(); //stream 닫음 //finally에는 마지막 실행 내용을 정리
			System.out.println("finally 실행 " );
		}
		System.out.println("다음 문장 실행");
	}

}
