package constructor;

public class TestClass06 {
	private TestDTO t; //인스턴스 변수로 사용하여 모든 메소드에서 사용할 수 있도록 함
	public void display() { //내부에서만 연산이 필요한 경우 -> private로 만듬
		System.out.println("1. 저장합니다");
		//저장하는 목적으로DTO에 변수 만듬
		saveData();
		System.out.println("2. 출력합니다");
		printData();
	}
	public void saveData() {
		String name = "홍길동";
		String addr = "산골짜기";
		
		t = new TestDTO(name, addr);//생성자를 통해 전달
		//t.setName(name);t.setAddr(addr);//setter을 통해 전달
		
		System.out.println("저장완료");
	}
	public void printData() {
		System.out.println("이름 : " + t.getName());
		System.out.println("주소 : " + t.getAddr());
	}
}
