package variable;

class Test07 {
	public static final String KOREA = "���ѹα�"; //�ش��ϴ� ���� ������ �� ����, 
												// Ŭ���� ������ �����Ͽ� ����� �� ����
	public static int num;
	static { //static�� ���� �ʱ�ȭ�ϰڽ��ϴ�. 
		num = 12345;
	}
}


public class Ex07 {
	public static void main(String[] args) {
//		final String KOREA = "���ѹα�"; //final�� ���� �� �ش� ������ ������ �� ����
		
		System.out.println(Test07.KOREA); //static�� Ŭ���������� ����
		System.out.println(Test07.num);
		
		Test07 t = new Test07();
		System.out.println(t.KOREA); // ��ü�μ� ���ٵ� ����
	}

}
