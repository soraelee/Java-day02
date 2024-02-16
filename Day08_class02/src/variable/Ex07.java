package variable;

class Test07 {
	public static final String KOREA = "대한민국"; //해당하는 값은 변경할 수 없고, 
												// 클래스 명으로 접근하여 사용할 수 있음
	public static int num;
	static { //static의 값을 초기화하겠습니다. 
		num = 12345;
	}
}


public class Ex07 {
	public static void main(String[] args) {
//		final String KOREA = "대한민국"; //final로 지정 시 해당 변수는 변경할 수 없음
		
		System.out.println(Test07.KOREA); //static은 클래스명으로 접근
		System.out.println(Test07.num);
		
		Test07 t = new Test07();
		System.out.println(t.KOREA); // 객체로서 접근도 가능
	}

}
