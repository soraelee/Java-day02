package while_;

public class Ex02_break {
	public static void main(String[] args) {
		int i = 0;
		
		while (true) {
			i++;
			System.out.println("i : " + i);
			if (i > 3)
				break;
			
		}
		System.out.println("���� ���� ���� !!");
		
		for (;;) {
			System.out.println("for i : " + i);
			i++;
			
			if (i == 6) {
				break;
			}
		}
		
		System.out.println("aa"); // ���� ���� �ۿ� ���� �ۼ� �� ���� �߻�
		
	}
}
