package inheritance;

class Calc05{
	public void display() {
		System.out.println("���� ���� �Դϴ�.");
	}
	
}
class Computer05 extends Calc05{
	
	public void print() {
		System.out.println("��ǻ�ͷ� �����մϴ�");
		display();
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		Computer05 com = new Computer05();
		
		com.print();
	}
}