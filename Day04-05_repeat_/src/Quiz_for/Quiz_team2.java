package Quiz_for;

import java.util.Scanner;

public class Quiz_team2 {
	public static void main(String[] args) {
//		����1��) 
//		������ �Է¹޾� 80�� �̻��̸� �հݸ޼����� �׷��� ������ 
//		���հ� �޼����� ����ϴ� �۾��� �ݺ��ϴٰ�
//		0���� 100�� �̿��� ������ �ԷµǸ� �����ϴ� ���α׷�

//		Scanner input = new Scanner(System.in);
//		
//		int num ;
//		
//		
//		for (;;) {
//			System.out.print("���� ��� : ");
//			num = input.nextInt();
//			
//			if (num <= 100 && num >= 80)
//				System.out.println("�հ� �Դϴ�.");
//			else if (num < 80 && num >= 0)
//				System.out.println("���հ� �Դϴ�.");
//			else {
//				System.out.println("�߸� �Էµ� �����Դϴ�.");
//				break;
//			}
//		}
		
		
//		���� 2��)
//		���ڸ� �Է¹޾Ƽ� �� ���� ¦���� ������, Ȧ���� ������ �����ϴ� ���α׷��� ����ϴ�.
//	
//		�Է¹޴� ���ڴ� 1~20������ ���̰� 100�̵Ǹ� ����˴ϴ�.
//		�������ų� �� ���� 0�̸�, 100�ʰ��� �� �� �����ϴ�.
//	
//		��� ���� :
//		----------------------------
//		���� ���ڴ� 0 �Դϴ�.
//		���ڸ� �Է��ϼ��� : 20
//	
//		���ڸ� ���մϴ�.
//	
//		���� ���ڴ� 20 �Դϴ�.
//		���ڸ� �Է��ϼ��� : 19
//	
//		���ڸ� ���ϴ�.
//	
//		���� ���ڴ� 1 �Դϴ�.
//		���ڸ� �Է��ϼ��� : 3
//	
//		�հ�� 0���Ϸ� ������ �� �����ϴ�. �ٽ� �Է����ּ���
//	
//		���� ���ڴ� 1 �Դϴ�.
//		���ڸ� �Է��ϼ��� : 
//		---------------------------
		
//		Scanner input = new Scanner(System.in);
//		int num1 = 0, num2, sum = 0;
//		
//		for (;;) {
//			System.out.println("���� ���ڴ� " + num1 + "�Դϴ�.");
//			System.out.print("���ڸ� �Է��ϼ��� : ");
//			num2 = input.nextInt();
//			
//			switch (num2 % 2) {
//			case 0:
//				sum = num1 + num2;
//				if (sum < 0) {
//					System.out.println("\n�հ�� 0���Ϸ� ������ �� �����ϴ�. �ٽ� �Է����ּ���\n");
//					continue;
//				}
//				else {
//					System.out.println("\n���ڸ� ���մϴ�.\n");
//					num1 = sum;
//				}
//				break;
//			case 1:
//				sum = num1 - num2 ;
//				if (sum < 0) {
//					System.out.println("\n�հ�� 0���Ϸ� ������ �� �����ϴ�. �ٽ� �Է����ּ���\n");
//					continue;
//				}
//				else {
//					System.out.println("\n���ڸ� ���ϴ�.\n");
//					num1 = sum;
//				}
//				break;
//					
//			}
//
//		}
		
		
//		����3��)
//		�Ʒ��� ���� ����� ���弼��
//	
//		*****
//		****
//		***
//		**
//		*
//		========
		
//		for (int i = 0 ; i < 5 ; i++) {
//			for (int j = 5 ; j - i > 0 ; j--) {
//				System.out.print("*");
//			}
//		System.out.println();
//		
//		}


//		����4��
//		
//		
//		int�� ��� ���� ���ڸ� �Է��Ͽ��� ��� �� �ڸ����� ���� ���ϼ���.
//		
//		�ݺ��ؼ� �����ϴ� �Է°��� 0�� ���� ���α׷��� ����˴ϴ�.
//		
//		�Է�           ���
//		
//		11               2 
//		111              3
//		1111            4
//		11111           5
//		895              22
//		222222222     18
		
		Scanner input = new Scanner(System.in);
		
		int num3, sum = 0, result = 0, val = 0;
		
		for (;;) {
			
			System.out.print("�� �Է� : ");
			num3 = input.nextInt();
			
			if (num3 == 0)
				break;
			else {
				sum = 0; result = 0; val = 0;
				while(true) {
					
					if (num3 / 10 == 0) {
						val = num3 % 10;
						result += val ;
						break;
					}
					else if (num3 > 10) {
						val = num3 % 10;
						sum += val ;
						result = sum;
						num3 = num3 / 10;
					}
					else {
						result += num3 ;
						break;
					}
						
				}
				
				System.out.println("�� �� : " + result);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
