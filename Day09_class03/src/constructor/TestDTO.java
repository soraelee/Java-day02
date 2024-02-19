package constructor;

public class TestDTO {//값을 저장하는 class
	private String name, addr;
	public TestDTO() {} //디폴트 생성자
	public TestDTO(String name, String addr)
	{//매개변수를 받는 생성자
		this.name = name;
		this.addr = addr;
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

}
