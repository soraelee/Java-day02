package overriding;

class Test05 {
	
}

public class Ex05 {
	public static void main(String[] args) {
		Test05 t = new Test05();
		// Ŭ������ ����ϸ� �⺻������ Object�� ����� ����� �� ���� (overriding)
		
		System.out.println("aaa".getClass()); //�⺻���� �ڷ����� �˷��� : class java.lang.String
		
		System.out.println(t.getClass()); //class overriding.Test05
		
		System.out.println(t.toString()); //Ŭ������ ���� ��� : overriding.Test05@49e4cb85
		
		System.out.println(t); //���� ���� �� : overriding.Test05@49e4cb85

	}

}

