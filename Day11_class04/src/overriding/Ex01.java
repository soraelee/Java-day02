package overriding;

class Ferrari {
	private int ye;
	public Ferrari(int ye) {
		this.ye = ye;
	}
	public int getYe() {
		return ye;
	}
	public void speed() {
		System.out.println(ye + "��� ��� �ӵ� : 300km�� �޸��ϴ�");
	}
	public void onCar() {
		System.out.println("�ڵ��� �õ��� �մϴ�!");
	}
}

class NewFerrari extends Ferrari{

	public NewFerrari(int ye) {
		super(ye);
	}
	public void autoSystem() {
		System.out.println("�ڵ� ������带 �����մϴ�!");
	}
	public void speed() {
		System.out.println(getYe() + "��� ��� �ӵ� ����");
		System.out.println("500km���� �޸� �� �ֽ��ϴ�"); //overriding
	}
}

public class Ex01 {
	public static void main(String[] args) {
		NewFerrari f  = new NewFerrari(2025);
		f.onCar();
		f.speed();
		f.autoSystem();
	}

}
