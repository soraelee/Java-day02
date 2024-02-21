package upcasting;

public class Ex03 {
	public static void main(String[] args) {
		//object : 최고 공통 조상 부모
		Object num = 100;
		Object name = "홍길동" ; //int와 String 자료형 또한 Object로 받을 수 있음
		System.out.println(num);
		System.out.println(name);
		
		System.out.println(num.getClass());
		System.out.println(name.getClass());
		
		int a = 100 + (int)num ; //object타입과 정수 타입은 연산이 불가
	}

}
