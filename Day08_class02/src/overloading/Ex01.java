package overloading;

import java.util.ArrayList;

class TestClass01 { // 보편적으로는 파일을 나눔 // default : 다른 파일에서 해당 메소드 사용 불가
	public void sumFunc() {
		System.out.println("매개변수 없는 sumFunc");
	}
	public void sumFunc(int n) { //메소드의 이름은 같으나 매개변수의 개수가 다르므로 다른 함수로 인식
		System.out.println("n을 가지고 연산합니다");
	}
	public void sumFunc(int n, int num) {
		System.out.println(n + num + " 입니다");
	}
	public void sumFunc(String n, String num) {
		System.out.println(n + num + " 입니다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
	TestClass01 t = new TestClass01();
	t.sumFunc();
	t.sumFunc(10);
	t.sumFunc(10, 20);
	t.sumFunc("안녕", "하세요");
	
	
	}
}
