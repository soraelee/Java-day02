package string;

public class Ex01 {
	public static void main(String[] args) {
		String str;
		String str1 = new String();
		String str2 = "test";
		String str3 = new String("test init");
		
		System.out.println("str3 : " + str3);

		String s1 = str3.toUpperCase(); // �ش��ϴ� ���� ���� �빮��ȭ
		System.out.println("s1 : " + s1);
		
		String s2 = s1.toLowerCase(); // �ش��ϴ� ���� ���� �ҹ���ȭ
		System.out.println("s2 : " + s2);
		
		str3 = "JaVa"; //java, Java
		
		
		//�ڹٴ� ��ҹ��ڸ� ����
		if (str3.equals("java")) {
			System.out.println("���������� �ڹ��̱���");
		}
		else {
			System.out.println("�ٸ���!");
		}
		
		
		if (str3.toLowerCase().equals("java")) {
			System.out.println("���������� �ڹ��̱���");
		}
		else {
			System.out.println("�ٸ���!");
		}
				
	}

}
