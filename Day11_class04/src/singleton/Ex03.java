package singleton;

class Test03 {
	private static Test03 t; // 객체생성 메소드가 static이므로 이 부분을 static으로 구성해야 사용할 수 있음...
	int num;
	private Test03() { //객체를 생성하지 못하게 함
		System.out.println("생성자 실행");
	}
	public static Test03 객체생성메소드() { //static은 클래스 이름으로 접근할 수 있음
		System.out.println("객체생성 메소드 연동");
		System.out.println("t : " + t);
		if (t == null) 
			t = new Test03(); //생성자가 한번만 실행되도록 하는 식
		return t;
	}
//	public static void test() {	} 
}

public class Ex03 {
	public static void main(String[] args) {
		Test03.객체생성메소드(); //최초로는 null 값
		Test03.객체생성메소드(); //이후 부터는 객체의 값을 가짐 //t : singleton.Test03@49e4cb85
		
		Test03 t01 = Test03.객체생성메소드();
		Test03 t02 = Test03.객체생성메소드();
		Test03 t03 = Test03.객체생성메소드();
		t01.num = 1000;
		t02.num = 2000;
		t03.num = 3000;
		
		System.out.println(t01 + " : " + t01.num);
		System.out.println(t02 + " : " + t02.num);
		System.out.println(t03 + " : " + t03.num); //한공간을 가짐이 입증됨
	}
}
