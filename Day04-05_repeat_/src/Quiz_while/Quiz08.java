package Quiz_while;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		// ���� �ݺ��� ����
		//		1) 2�������� �Էµ� � ������ ���� �̾��� �Ҽ��� ã�� ���α׷��� �ϼ��ϱ�
		Scanner input = new Scanner(System.in);

		System.out.print("�� �Է� : ");
		int num = input.nextInt();


		System.out.print("�Ҽ� : " );
		for (int k = 2 ; k <= num ; k++) {
			int j = 0 ;
			for (int i = 1 ; i <= k ; i ++) {
				if (k % i == 0) {
					j++;
				}
			}
			if (j == 2) {
				System.out.print(k + ", ");
			}
		}
	}

}
