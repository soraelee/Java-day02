package constructor;

class TestClass02 {
	private String officeName;
//	public TestClass02(String officeName) {
//		this.officeName = officeName;
//		System.out.println("생성자 실행");
//	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		String name = "나의 회사" ;
		TestClass02 t = new TestClass02();
		
		t.setOfficeName(name); //생성자도 하나의 객체  -> 값을 받아서 처리
		System.out.println(t.getOfficeName());
		
	}
}
