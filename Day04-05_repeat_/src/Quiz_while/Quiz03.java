package Quiz_while;

public class Quiz03 {
	public static void main(String[] args) {
		int rice = 1000, m = 20, n = 2;

		for (int i = 1 ; ; i++) {
			rice = 1000 - (n * m);
			n = n * 2;
			if (rice < 0) {
				System.out.println("창고의 쌀은 " + i + "일 만에 모두 사라짐" );
				break;
			}
		}

		System.out.println("쥐는 모두 " + n + "마리" );
	}

}
