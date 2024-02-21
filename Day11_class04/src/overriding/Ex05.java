package overriding;

class Test05 {
	
}

public class Ex05 {
	public static void main(String[] args) {
		Test05 t = new Test05();
		// 클래스를 사용하면 기본적으로 Object의 기능을 사용할 수 있음 (overriding)
		
		System.out.println("aaa".getClass()); //기본적인 자료형을 알려줌 : class java.lang.String
		
		System.out.println(t.getClass()); //class overriding.Test05
		
		System.out.println(t.toString()); //클래스의 저장 장소 : overriding.Test05@49e4cb85
		
		System.out.println(t); //위와 같은 값 : overriding.Test05@49e4cb85

	}

}

