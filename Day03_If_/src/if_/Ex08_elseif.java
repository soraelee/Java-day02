package if_;

import java.util.Scanner;

public class Ex08_elseif {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num ;
		System.out.println("�� �Է�");
		num = input.nextInt();
		
		if (num > 100) {
			System.out.println("100���� ū ��");
		}
		else if (num > 50) {
			System.out.println("50���� ū ��");
		}
		else if (num > 0) {
			System.out.println("0���� ū ��");
		}
		else {
			System.out.println("�� ���� ��");
		}
		//�Է°��� ¦��,50���� ũ�ٸ�
		if (num % 2 == 0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
	}

}
