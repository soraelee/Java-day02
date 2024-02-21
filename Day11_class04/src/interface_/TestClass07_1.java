package interface_;

public class TestClass07_1 implements TestInt07{ //원하는 기능 추가
	public void test() { //인터페이스를 상속함으로서 굳이 메인에서 객체를 해당 값으로 변경하지 않아도 됨
		System.out.println("변경 기능입니다.");
	}
}
