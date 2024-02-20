package inheritance;

//생성자 주의 사항

class Test08 {
	public Test08(String s) {
		System.out.println(s + "부모생성자 실행!");
	} //부모 생성자에 매개변수를 받는 경우
}
class TestClass08 extends Test08{
	public TestClass08() {
		super("값 전달 "); //값을 전달하는 부분이 없기 때문 //무조건 자식 생성자의 첫번째에 넣어야 함
		System.out.println("자식 생성자 실행  !!");
		
	}
}


public class MainClass08 {
	public static void main(String[] args) {
		Test08 tc = new TestClass08() ;
	}

}
