package lambda;

import java.util.Scanner;

interface Test04 {
	public void test(); //인터페이스에서 간단하게 한번만 출력하기 위한 람다식 활용
}

class TestClass04 {
	public void testClass(Test04 t) { //인터페이스 자료형을 받아서 사용하겠습니다
		System.out.println("깅능 실행합니다");
		t.test();
	}
}
public class Ex04 {
	public static void main(String[] args) {
		TestClass04 t01 = new TestClass04();
		
		Test04 t04 = new Test04() {

			@Override
			public void test() {
				System.out.println("test 실행됩니다.");
			}
			
		};
		
		t01.testClass(t04); // <- Test04라는 클래스를 받아줘야 함
		
		t01.testClass(new Test04() {//전달하기위한 목적으로 한번만 사용하고자 함 => 변수를 만들 필요가 없다
									// 객체를 만들고 해당 메소드를 찾아감

			@Override
			public void test() {
				System.out.println("test11 실행됩니다.");
			}
			
		});
		
		
		//Scanner에 적용
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("scanner : " + input.next()); //따로 자료형 받을 필요 없이 한번만 사용한다면 이렇게도 사용함
//		
		
		System.out.println("------------------------");
		
		Test04 t1 = () -> {
			System.out.println("t1 실행");
		};
		t01.testClass(t1);
	}

}
