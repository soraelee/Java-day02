package while_;

public class Ex10_double_while_2 {
	public static void main(String[] args) {
		for (int k = 0 ; k < 3; k++) {
			System.out.println("===���� �ݺ��� ����");
			for (int i = 0 ; i < 3 ; i++) {
				System.out.println(i + ".for");
//				break;
			}
			System.out.println("���� �ݺ��� �� ===");
			break;
		}
		System.out.println("���� ������ ����");
	}

}
