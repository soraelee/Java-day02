package variable;

class Test02{
	public int num ; 
	
	public void test1() {
		num = 100;
		System.out.println("test1 : "+ num);
	}
	public void test2() {
		System.out.println("test2 : "+ num);
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02(); 
		
		t.test1();
		t.test2();
	}
}

//1) 객체 생성시 t안에 모든 method를 함께 갖고 태어남
//num 변수와 test1, test2라는 이름만 알고 있음
//method 호출 시 해당 test1 안의 지역변수가 생성, 종료시 사라짐
//인스턴스 변수는 객체가 main에서 운용 되는 동안 계속 유지 됨
// 불필요한 공간을 계속 차지함
//특정 공간에서 사용하고자 할 시 지역 변수 사용하기
