package variable;

class Test06{
	public static int su;
	public void test() {
		su = 1234;
	}
	public int num;
	public static void test2() { //함수가 static인데 변수가 인스턴스 변수인 경우 
//		num = 123;				 // 에러 발생 => 생성 순서가 다르기 떄문
	}
}


public class Ex06 {
	static int num;
	public static void main(String[] args) {
		test1();
		num = 123;
		
		
	}
	public static void test1() {
		num = 123;
		System.out.println(num);
		
	}
}
