package Quiz_if;

import java.util.Scanner;

public class Quiz02_if {
	public static void main(String[] args) {
		// ��ø�� if��
		Scanner input = new Scanner(System.in);
		int n1 = 0, n2 = 0, n3 = 0;
		
		System.out.print("n1�� �Է��ϼ��� : ");
		n1 = input.nextInt();
		System.out.print("n2�� �Է��ϼ��� : ");
		n2 = input.nextInt();
		System.out.print("n3�� �Է��ϼ��� : ");
		n3 = input.nextInt();
		
		System.out.println();
		
		//���� ū ��, �ι�° ū ��, ������ ū �� 
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("n1�� ���� ŭ");
				if (n2 > n3) {
					System.out.println("n2�� �ι�°�� ŭ");
					System.out.println("n�� ������ ū ��");
				}
				else {
					System.out.println("n3�� �ι�°�� ŭ");
					System.out.println("n2�� ������ ū ��");
				}
			}
			else {
				System.out.println("n3�� ���� ŭ");
				System.out.println("n1�� �ι�°�� ŭ");
				System.out.println("n2�� ������ ū ��");
				}
		}
			
		else {
			if (n2 > n3) {
				System.out.println("n2�� ���� ŭ");
				if (n1 > n3) {
					System.out.println("n1�� �ι�°�� ŭ");
					System.out.println("n3�� ������ ū ��");
				}
				else {
					System.out.println("n3�� �ι�°�� ŭ");
					System.out.println("n1�� ������ ū ��");
				}
			}
			else {
				System.out.println("n3�� ���� ŭ");
				System.out.println("n2�� �ι�°�� ŭ");
				System.out.println("n3�� ������ ū ��");
			}
		}
	}
}
