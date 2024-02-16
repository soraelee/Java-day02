package variable;

public class TestClass05_1 {
	public static void main(String[] args) {
		//경로 지정
		//여러 파일에서 요청하는 경우 인스턴스 함수는 조금 어려울 수 있음
//		StaticTest05 s = new StaticTest05();
		System.out.println("해당 경로에 데이터를 추가합니다.");
		System.out.println(StaticTest05.url);
	}

}
