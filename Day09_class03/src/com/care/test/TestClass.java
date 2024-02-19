package com.care.test;

class Test001{
	void test001() { //앞에 표현이 없으면 default
		//패키지 외부에서 사용 불가
		
	}
}

public class TestClass { //public class : 딱 하나만 있어야 함
						 //외부 패키지에서 사용가능
	public void test() {
		System.out.println("test 메소드"); 
	}
	void test2() { //앞에 표현이 없으면 default
		System.out.println("test2 메소드");
	}

}
