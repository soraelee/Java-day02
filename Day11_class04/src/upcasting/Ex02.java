package upcasting;

class Parents {
	public void familyName() {
		System.out.print("이");
	}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}

class Daughter extends Parents {
	public void name() { //오버라이딩
		familyName();
		System.out.println("국주");
	}
}
class Son extends Parents {
	public void name() { //오버라이딩
		familyName();
		System.out.println("기광");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		//		Parents par = new Parents();
		//		par.name();
		//		
		//		Daughter da = new Daughter();
		//		da.name();
		//		
		//		Son s = new Son();
		//		s.name();
		//		
		/*
		//일반 방법
		//1번 아빠 이름, 2번 딸, 3번 아들

		Parents par = new Parents();
		Daughter da = new Daughter();
		Son s = new Son(); //메모리 낭비 발생 가능

		int num = 1;
		if (num == 1) {
			par.name();
		}else if(num ==2) {
			da.name();
		}else {
			s.name();
		}
		 */

		//upcasting 방법
		//1번 아빠 이름, 2번 딸, 3번 아들

		Parents par;
		//Daughter da;
		//Son s; 

		int num = 3;
		if (num == 1) {
			par = new Parents();
			par.name();
		}else if(num ==2) {
			par = new Daughter();
			par.name();
		}else {
			par = new Son();
			par.name();
		}

	}

}
