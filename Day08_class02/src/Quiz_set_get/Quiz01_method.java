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
	
	public void ageCal() { //나이를 만으로 계산하는 함수
		//생일 지난 기준으로 따지기
		age = age - 1;
	}
	

}
