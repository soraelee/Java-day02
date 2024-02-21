package interface_;

class Test07 { // 새로운 기능 => 기존의 과거 기능이 있던 자리에 해당 기능으로 변경해야함
	public void test() {
		System.out.println("새로운 기능으로 만듭니다");
	}
}

class Test06 { //과거의 기능
	public void test() {
		System.out.println("test기능 입니다.");
	}
}

class Singleton06 {
	
}

public class Ex06 {
	public static void main(String[] args) {
		Test06 t01 = new Test06();
		t01.test();
	}
}
