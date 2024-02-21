package interface_;

public class Singleton07 {
	private static TestInt07 t ; //2) 인터페이스를 static으로 불러오고
	private Singleton07() {} //1) 생성자를 숨기고
											//3) 싱글톤 생성 => 인터페이스를 객체생성메소드로 불러오기 위해 getinstance화 함
	public static TestInt07 getInstance() { //getInstance(): new를 통해 객체를 계속 생성하지 못하게 막음
											//				 싱글톤에서 유일하게 외부에서 객체를 얻는 방법
											//				 최초에 할당된 하나의 메모리를 계속 쓰는 방식
		if(t == null) {
			t = new TestClass07_1(); //교체 => 모든 값 변동됨
		}
		return t; //인터페이스와 연동 시 큰 진행 없이 싱글톤에서 해당 객체를 불러오는 클래스만 변경하면 전체적으로 교체 됨 
	}


}
