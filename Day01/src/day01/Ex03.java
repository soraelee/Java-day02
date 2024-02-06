package day01;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(100 + 100); //숫자 + 숫자
		System.out.println(1.123 + 3.456); //실수 + 실수
		System.out.println("안녕" + "하세요"); //문자 + 문자
		System.out.println("100" + 200); //문자 + 숫자
		System.out.println("안녕" + 100 + 100); // 순차적으로 연산이 진행 
		// 문자 + 숫자 => 문자 + 문자 
		System.out.println("안녕" + (100 + 100));
		//괄호를 통해 숫자가 먼저 계산되도록 함
	}
}
