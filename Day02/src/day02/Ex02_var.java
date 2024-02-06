package day02;

public class Ex02_var {
	public static void main(String[] args) {
		int number = 123;
		System.out.println("변경 전 num : " + number);
		number = 100; // 같은 변수를 계속 사용할 때에는 처음에만 자료형을 넣어줌
		System.out.println("변경 후 num : " + number);
		number = number + 200;
		System.out.println("변경 후 num : " + number);
	}
}
