package constructor;

public class TestDTO {//���� �����ϴ� class
	private String name, addr;
	public TestDTO() {} //����Ʈ ������
	public TestDTO(String name, String addr)
	{//�Ű������� �޴� ������
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
