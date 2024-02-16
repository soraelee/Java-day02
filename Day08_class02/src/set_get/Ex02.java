package set_get;

class Test02 {
	private int num, age; //값을 설정 = setter, 값을 꺼냄 getter

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} // 자동으로 생성
	
	/*
	public void setNum(int num) {
		this.num = num; //this를 사용하지 않고 num을 쓰는 경우 => 메소드 안의 num값으로 판단함
	}
	public int getNum() {
		return num;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	*/
	
}

public class Ex02 {
	public static void main(String[] args) {
		
		Test02 t =new Test02();
		
		t.setNum(100);
		t.setAge(20);
		
		int a = t.getAge();
		
		System.out.println("age : " + a);
		System.out.println(t.getNum());
		
		
		
		
		
	}
}
