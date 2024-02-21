package interface_;

class A지상군05 implements TestInt05 {

	@Override
	public void attack() {
		attack1();
		attack2();
		attack3();
		attack4();
		
	}public void attack1() {
		System.out.println("지상군 공격");
		
	}public void attack2() {
		System.out.println("지상군 공격");
		
	}public void attack3() {
		System.out.println("지상군 공격");
		
	}public void attack4() {
		System.out.println("지상군 공격");
		
	}

	@Override
	public void defense() {
		System.out.println("지상군 방어");
		
	}
	
}

public class Ex05 {
	public static void main(String[] args) {
		A지상군05 a = new A지상군05();
		a.attack(); 
		a.defense();
		
	}
}
