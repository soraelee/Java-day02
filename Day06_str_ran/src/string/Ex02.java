package string;

public class Ex02 {
	public static void main(String[] args) {
		String str = "test";
		
		System.out.println("length : " + str.length());
		System.out.println("charAt(1) " + str.charAt(1)); //���� �ϳ��� ǥ��
														  //ù��° ����
		
		System.out.println(str.charAt(0) == 't'); //true
		System.out.println(str.charAt(0) != 't'); //false
		
		String jumin = "900214";
		
		
		if (jumin.length() == 6) {
			int i = 0;
			for ( ; i < jumin.length(); i++) {
				if(jumin.charAt(i) < '0' || jumin.charAt(i) > '9') {
					System.out.println("���ڸ� �Է��ϼ���");
					break;
				}
			}
			if (i == jumin.length()) {
				System.out.println("���ڸ� �ֹ� ��ȣ�� �Է��ϼ���");
			}
		}
		else {
			System.out.println("���̰� �߸� ����!");
		}
		
		
		
		System.out.println("-------------------");
		
		int i = 0;
		
		for (; i < 5 ; i++) {
			if (i==4) break;
		}
		System.out.println("i : " +i);
	}

}
