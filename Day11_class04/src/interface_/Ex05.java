package interface_;

class A����05 implements TestInt05 {

	@Override
	public void attack() {
		attack1();
		attack2();
		attack3();
		attack4();
		
	}public void attack1() {
		System.out.println("���� ����");
		
	}public void attack2() {
		System.out.println("���� ����");
		
	}public void attack3() {
		System.out.println("���� ����");
		
	}public void attack4() {
		System.out.println("���� ����");
		
	}

	@Override
	public void defense() {
		System.out.println("���� ���");
		
	}
	
}

public class Ex05 {
	public static void main(String[] args) {
		A����05 a = new A����05();
		a.attack(); 
		a.defense();
		
	}
}
