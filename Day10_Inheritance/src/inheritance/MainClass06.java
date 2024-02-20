package inheritance;

class Test06{
	public void test() {
		System.out.println("부모 test 메소드");
	}
}
class TestClass06 extends Test06 {
	public void test() {
		System.out.println("자식 test 메소드");
	}
	public void display() {
		this.test();
		super.test(); //부모와 자식 모두 같은 명칭의 메소드가 있으면 자식 메소드로 
		//우선적으로 자신 지역에서 먼저 찾음
		//부모로 명명하고 싶은 경우 super.메소드;
		//본인으로 명시 -> this.test();
	}
}

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 tc = new TestClass06();
		tc.display();
	}
}
