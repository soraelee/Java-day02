package constructor;

class TestClass03{
	private String name, addr;
	private int age;
	
	public TestClass03 (String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
		System.out.println("�����ڸ� ���� �ʱ�ȭ");
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
//		System.out.println(t); //��ü ���� �� ��ü�� ���� ����
		
		TestClass03 t = null;
//		System.out.println(t);
		String name = "ȫ�浿";
		String addr = "���¥��";
		int age = 20;
		t = new TestClass03(name, addr, age); //�ʱ�ȭ�� ���� �̿� ���� �ۼ�(������ �޼ҵ�
		
//		t.setName(name);t.setAddr(addr);t.setAge(age); //�ʱ�ȭ�� ���� setter�� ������ ���� => �� �κ��� ���̱�
		
		System.out.println("�̸� : " + t.getName());
		System.out.println("���� : " + t.getAddr());
		System.out.println("�ּ� : " + t.getAge());
	}
}
