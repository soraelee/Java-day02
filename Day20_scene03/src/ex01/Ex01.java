package ex01;

import ex01.AAA.Data;

class AAA{
	public void test() { System.out.println("AAAtest");}
	
	//inner class
	//클래스 안에 또다른 클래스 정의
	static class Data {
		public Data	(String str, int num) {
			System.out.println("생성자 실행");
		}
		public void test() {
			System.out.println("Data test 호출");
		}
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.test();
		
		//객체 생성 시
		Data d = new AAA.Data("ssss", 10);
		d.test();
	}
	

}
