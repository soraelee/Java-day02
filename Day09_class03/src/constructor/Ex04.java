package constructor;

import java.util.ArrayList;

class TestClass04 {
	public TestClass04(int num) { // 생성자를 만드는 순간 디폴트 생성자는 사라짐 (디폴트: 아무것도 전달하지 않음)
		System.out.println("매개 변수 받는 생성자");
	}
	public TestClass04() {
		System.out.println("기본 생성자 실행"); // 디폴트 생성자를 생성해야 함
	}
	
	public void test() {
		System.out.println("test 호출");
	}
	public void test(int num) {
		System.out.println(num + " test 호출");
	}
	
}


public class Ex04 {
	public static void main(String[] args) {
		//생성자 오버로딩
		// - 오버로딩 : 메소드의 이름이 같을 수 있음
		TestClass04 t = new TestClass04(); // 디폴트 생성자 객체
		t.test(); t.test(100);
		
		TestClass04 t2 =new TestClass04(1000); //매개변수를 보내는 객체
		
		ArrayList arr = new ArrayList<>(); //생성자를 생성 -> ctrl + 클ㄹ릭
		String s = new String();
		String s1 = new String("a"); //대문자로 시작하는 자료형은 클래스 생성자를 가짐
		
		
	}

}
