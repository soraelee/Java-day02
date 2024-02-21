package singleton;

class Test03 {
	private static Test03 t; // ��ü���� �޼ҵ尡 static�̹Ƿ� �� �κ��� static���� �����ؾ� ����� �� ����...
	int num;
	private Test03() { //��ü�� �������� ���ϰ� ��
		System.out.println("������ ����");
	}
	public static Test03 ��ü�����޼ҵ�() { //static�� Ŭ���� �̸����� ������ �� ����
		System.out.println("��ü���� �޼ҵ� ����");
		System.out.println("t : " + t);
		if (t == null) 
			t = new Test03(); //�����ڰ� �ѹ��� ����ǵ��� �ϴ� ��
		return t;
	}
//	public static void test() {	} 
}

public class Ex03 {
	public static void main(String[] args) {
		Test03.��ü�����޼ҵ�(); //���ʷδ� null ��
		Test03.��ü�����޼ҵ�(); //���� ���ʹ� ��ü�� ���� ���� //t : singleton.Test03@49e4cb85
		
		Test03 t01 = Test03.��ü�����޼ҵ�();
		Test03 t02 = Test03.��ü�����޼ҵ�();
		Test03 t03 = Test03.��ü�����޼ҵ�();
		t01.num = 1000;
		t02.num = 2000;
		t03.num = 3000;
		
		System.out.println(t01 + " : " + t01.num);
		System.out.println(t02 + " : " + t02.num);
		System.out.println(t03 + " : " + t03.num); //�Ѱ����� ������ ������
	}
}
