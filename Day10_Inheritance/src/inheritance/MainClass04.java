package inheritance;

class Calc04{
	public void display() {
		System.out.println("���� ���� �Դϴ�.");
	}
	
}
class Computer04{
	Calc04 calc;
	public Computer04 () {
		calc = new Calc04();
	}
	public void print() {
		System.out.println("��ǻ�ͷ� �����մϴ�");
		calc.display();
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		Computer04 com = new Computer04();
		
		com.print();
	}
}
