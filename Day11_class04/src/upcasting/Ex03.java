package upcasting;

public class Ex03 {
	public static void main(String[] args) {
		//object : �ְ� ���� ���� �θ�
		Object num = 100;
		Object name = "ȫ�浿" ; //int�� String �ڷ��� ���� Object�� ���� �� ����
		System.out.println(num);
		System.out.println(name);
		
		System.out.println(num.getClass());
		System.out.println(name.getClass());
		
		int a = 100 + (int)num ; //objectŸ�԰� ���� Ÿ���� ������ �Ұ�
	}

}
