package variable;

public class Ex03 {
	public String name; //글로벌하게 사용해야 하는 변수는 인스턴스로 적용
	public void inputData() { 
	String name = "홍길동"; //그렇지 않은 변수는 지역 변수화 시킴
	
}
	public void printData() {
		System.out.println(name);
	}

}
