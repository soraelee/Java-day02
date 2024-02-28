package ex01;

public class MemberDTO { 
	//데이터베이스의 컬럼과 동일해야 함
	//id varchar2(20) primary key, --기본키를 지정하는 또다른 방법
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
