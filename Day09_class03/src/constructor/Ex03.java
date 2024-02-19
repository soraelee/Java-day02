package constructor;

class TestClass03{
	private String name, addr;
	private int age;
	
	public TestClass03 (String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
		System.out.println("생성자를 통한 초기화");
	}
	
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}


public class Ex03 {
	public static void main(String[] args) {
//		TestClass03 t = new TestClass03();
//		 
//		System.out.println(t); //객체 생성 시 객체의 정보 나옴
		
		TestClass03 t = null;
//		System.out.println(t);
		String name = "홍길동";
		String addr = "산골짜기";
		int age = 20;
		t = new TestClass03(name, addr, age); //초기화를 위해 이와 같이 작성(생성자 메소드
		
//		t.setName(name);t.setAddr(addr);t.setAge(age); //초기화를 위해 setter를 여러번 실행 => 이 부분을 줄이기
		
		System.out.println("이름 : " + t.getName());
		System.out.println("나이 : " + t.getAddr());
		System.out.println("주소 : " + t.getAge());
	}
}
