package Quiz_while;

public class Quiz03 {
	public static void main(String[] args) {
		int rice = 1000, m = 20, n = 2;

		for (int i = 1 ; ; i++) {
			rice = 1000 - (n * m);
			n = n * 2;
			if (rice < 0) {
				System.out.println("â���� ���� " + i + "�� ���� ��� �����" );
				break;
			}
		}

		System.out.println("��� ��� " + n + "����" );
	}

}
