package inheritance;
//오버로딩

class Test09 {
	public Test09() {
		//부모도 똑같이 기본 생성자를 만들게 되면 에러를 줄일 수 있음
		System.out.println("부모 기본 생성자");
	}
	public Test09(String s) {
		System.out.println(s + " : 부모 생성자");
	}
}
class TestClass09 extends Test09{//자식이 기본 생성자 + 매개변수 생성자를 사용
	
	public TestClass09() {
		System.out.println("자식 기본 생성자");
		
	}
	public TestClass09(String s) {
		super(s); //이 때는 부모의 매개변수를 전달받는 생성자가 실행됨
		System.out.println(s + " : 자식 생성자");
		
	}
}



public class MainClass09 {
	public static void main(String[] args) {
		TestClass09 tc2 = new TestClass09("전달");
		TestClass09 tc = new TestClass09();
		
	}

}
