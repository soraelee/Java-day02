package ex01;

public class MemberDTO { 
	//�����ͺ��̽��� �÷��� �����ؾ� ��
	//id varchar2(20) primary key, --�⺻Ű�� �����ϴ� �Ǵٸ� ���
	//pwd varchar2(20),
	//name varchar2(20),
	//age number
	
	private String id, pwd, name;
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
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
}
