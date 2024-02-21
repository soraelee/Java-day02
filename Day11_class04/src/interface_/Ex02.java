package interface_;

class Test02 implements TestInt02{

	@Override
	public void test1() { //상속 받은 인터페이스의 내용을 구성해야 함
		System.out.println("test1실헹");
	}

	@Override
	public void test2() {
		System.out.println("test2실헹");
	}
	
}


public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.test1(); t.test2();
	}

}
