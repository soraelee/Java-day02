package Quiz_set_get;

public class Quiz01_method {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void ageCal() { //���̸� ������ ����ϴ� �Լ�
		//���� ���� �������� ������
		age = age - 1;
	}
	

}
