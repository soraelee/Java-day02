package while_;

public class Ex07_error {
	public static void main(String[] args) {
		String n1 = null, n2 = "test"; // ù��° ���ڰ� �빮�� => class
		int num = 1000;
		
//		num. // ù��° ���ڰ� �ҹ��� => ��� ��ɵ� ����
		
//		System.out.println(n1.equals(n2)); // n1 �� null�̱� ������ �ش� ��� ��� �Ұ�
		
		System.out.println(n2.equals(n1)); // �ش� ���� ����� �� ����
		
		//null����
		if (n1 == null) {
			System.out.println("n1�� �Է��ϼ���");
			
		}
		else {
			if (n1.equals(n2)) {
				System.out.println("�� ���ڿ��� ����");
				
			}
			else {
				System.out.println("�ٸ���");
			}
		}
	}
}
