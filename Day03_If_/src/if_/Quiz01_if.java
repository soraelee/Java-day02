package if_;

import java.util.Scanner;

public class Quiz01_if {
	public static void main(String[] args) {
		// 1) �� ���� �Է¹޾� ū ���� ����Ͻÿ�
		Scanner input = new Scanner(System.in);
		
		int n1 = 0, n2 = 0;
		
		System.out.print("ù ��° ���� : ");
		n1 = input.nextInt();
		System.out.print("�� ��° ���� : ");
		n2 = input.nextInt();
		
		if (n1 > n2)
			System.out.println(n1);
		if (n2 > n1)
			System.out.println(n2);
		
		// 2) �� ���� �Է¹޾� ū ���� ����Ͻÿ�
//		Scanner input = new Scanner(System.in);
//		
//		int n1 = 0, n2 = 0, n3 = 0;
//		
//		System.out.print("ù ��° ���� : ");
//		n1 = input.nextInt();
//		System.out.print("�� ��° ���� : ");
//		n2 = input.nextInt();
//		System.out.print("�� ��° ���� : ");
//		n3 = input.nextInt();
//		
//		System.out.print("���� ū ����?  ");
//		
//		if (n1 > n2 && n1 > n3)
//			System.out.println(n1);
//		if (n2 > n1 && n2 > n3)
//			System.out.println(n2);
//		if (n3 > n1 && n3 > n2)
//			System.out.println(n3);
	}
}
