package constructor;

class TestClass01 {
	public TestClass01() {
		System.out.println("생성자 실행"); //초기화의 용도로 사용
	}
	public void test() {
		System.out.println("test 호출");
	}
}


public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01(); //객체 생성 시 자동호출
		t.test();
	}

}
