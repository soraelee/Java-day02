package inheritance;
//다중상속

class A {
	public void a() {
		System.out.println("a 메소드 실행");
	}
}
class B extends A{
	public void b() {
		System.out.println("bb 메소드 실행");
	}
}
class C extends B{ //클래스에서는 여러개를 상속 받을 수 없음 //논리구조로 상속을 받음
	public void c() {
		System.out.println("ccc 메소드 실행");
	}
}
public class MainClass11 {
	public static void main(String[] args) {
		C c = new C();
		c.c();
	}

}
