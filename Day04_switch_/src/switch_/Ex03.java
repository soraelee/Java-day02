package switch_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		System.out.println("문자열 입력");
		str = input.next();
		
		switch(str ) {
		case "안녕" : System.out.println("하세요");break;
		case "그래": System.out.println("반갑다!");break;
		default : System.out.println("그 외의 값");
		}
	}
}
