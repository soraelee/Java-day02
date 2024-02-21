package upcasting; 
 
//casting : 형변환
//upcasting : 자식형태 -> 부모형태로 변환
//downcasting : 부모형태 -> 자식형태

class A01 {
	public void test() {
		System.out.println("aaaaaaa");
	}
}
class B01 extends A01{
	public void test() {
		System.out.println("bbbbb");
	}
	
}
class C01 extends A01 {
	public void test() {
		System.out.println("ccccc");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		A01 a;
		a = new B01(); a.test();
		a = new C01(); a.test();
		//A01이라는 공통 부모를 가지고 있으므로 
		//부모에 B01 C01의 값을 넣음 -> 호출 시 자식의 메소드가 나옴
		
		/*
		B01 b;
		C01 c ; //변수를 적게 만들 수 있음
		
		b = new B01(); b.test();
		c = new C01(); c.test();
		*/
	}

}
