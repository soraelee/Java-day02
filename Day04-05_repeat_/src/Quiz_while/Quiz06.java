package Quiz_while;

public class Quiz06 {
	public static void main(String[] args) {
		//1���� 1000������ �ڿ��� �߿��� 4�� ����� 6���� ����� �������� 1�� ���� ��
		
		int sum = 0;
		
		for (int i = 1; i <= 1000 ; i++) {
			if (i % 4 == 1 && i % 6 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}

}
