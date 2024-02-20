package inheritance;

//积己磊
class Test07 {
	public Test07() {
		System.out.println("何葛 积己磊 角青");
	}
}
class TestClass07 extends Test07{
	public TestClass07() {
		System.out.println("磊侥 积己磊 角青");
	}
	
}


public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 tc = new TestClass07();
	}

}
