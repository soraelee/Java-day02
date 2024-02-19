package constructor;

public class TestClass05 {
	private String name, addr;
	
	public TestClass05() { //디폴트 생성자
		System.out.println("기본 생성자");
	}
	
	public void display() { //사용자들의 인적사항을 저장
		System.out.println("1. 저장합니다");
		name = "홍길동"; //같은 클래스에 있는 경우는 이와같이 주로 작성
		setAddr("산골짜기");
		
		System.out.println("2. 출력합니다");
		System.out.println(getName());
		System.out.println(addr);
	} //저장된 값을 출력 >> 클래스를 나누어 사용
	//데이터를 저장함으로서 이동 >>DTO라고 함
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	

}
