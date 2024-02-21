package abstract_;

abstract class Test01 { //추상 클래스 입니다.
	public abstract void speed();  //추상 기능입니다. => 나중에 따로 구현하세요
//	{ // 뒤에 내용 제거
//		System.out.println("2024년 속도 기능"); // 계속 변동될 정보 => 추상화 진행
//	}
	public void myBreak() {
		System.out.println("멈춤 기능");
	}
}
class TestClass01 extends Test01 {
	public void speed() { // 올해의 내용 => 추상된 메소드를 오버라이딩 해서 사용
		System.out.println("2025");
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t =new TestClass01();
		t.speed(); t.myBreak(); t.autoSystem();
	}
}
