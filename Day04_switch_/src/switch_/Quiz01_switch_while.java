package switch_;

import java.util.Scanner;

public class Quiz01_switch_while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num ;
		String str1 = null, str2 = null ;
		
		while (true) {
			System.out.println("1. �츮�� ���");
			System.out.println("2. ȸ�� ���");
			System.out.println("3. ��� ����");
			num = input.nextInt();
			System.out.println();
			
			switch (num) {
			case 1 :
				System.out.print("�츮�� ������ �Է� : ");
				str1 = input.next();
				System.out.println("��� ����\n");
				break;
			case 2:
				System.out.print("ȸ�� ������ �Է� : ");
				str2 = input.next();
				System.out.println("��� ����\n");
				break;
			case 3:
				if (str1 == null) {
					System.out.println("�� �ּҸ� ����ϼ���");
				}
				else {
				System.out.println("�츮�� : " + str1);
				break;
				}
				if (str2 == null) {
					System.out.println("ȸ�� �ּҸ� ����ϼ���\n");
				}
				else {
				System.out.println("ȸ�� : " + str2 + "\n");
				break;
				}
			}
		}
		
	}
}
