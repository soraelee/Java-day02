package constructor;

public class TestClass05 {
	private String name, addr;
	
	public TestClass05() { //����Ʈ ������
		System.out.println("�⺻ ������");
	}
	
	public void display() { //����ڵ��� ���������� ����
		System.out.println("1. �����մϴ�");
		name = "ȫ�浿"; //���� Ŭ������ �ִ� ���� �̿Ͱ��� �ַ� �ۼ�
		setAddr("���¥��");
		
		System.out.println("2. ����մϴ�");
		System.out.println(getName());
		System.out.println(addr);
	} //����� ���� ��� >> Ŭ������ ������ ���
	//�����͸� ���������μ� �̵� >>DTO��� ��
	

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
