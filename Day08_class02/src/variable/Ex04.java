package variable;

class Test04	{
	public int num;
	public static String msg = "����"; //���α׷��� ����� ������ ������
}

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("���� �� : " + Test04.msg);
		Test04.msg = "1111";
		System.out.println("���� �� : " + Test04.msg);
		
		
		
		
		Test04 t = new Test04();
		t.num = 100;
	}
}
