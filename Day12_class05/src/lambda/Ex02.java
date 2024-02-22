package lambda;
interface Test02 {
	//인터페이스에 추상화된 메소드가 여러개인 경우
	public void test() ;
//	public void test12() ; 
	
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02() {
			
			@Override
			public void test() { //메인이지만 메소드를 정의
				System.out.println("test 실행");
			} // 람다 => 해당 코드를 줄임
		};
		t.test();
		
		System.out.println("-----------------");
		Test02 t02 = () -> System.out.println("test 실행 222");
		t02.test();
	}

}
