package Quiz_if;

import java.util.Scanner;

public class Quiz_team6 {
	public static void main(String[] args) {
//		����1.  
//
//		1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�.
//
//		1. ���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�.
//		2. ���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�.
//		3. ��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.
//
//		���� ���, 3���� �� 3, 3, 6�� �־����� ����� 1,000+3��100���� ���Ǿ� 1,300���� �ް� �ȴ�. 
//		�� 3���� ���� 2, 2, 2�� �־����� 10,000+2��1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�. 
//		3���� ���� 6, 2, 5�� �־����� ���� ���� ū ���� 6�̹Ƿ� 6��100���� ���Ǿ� 600���� ������� �ް� �ȴ�.
//
//		3�� �ֻ����� ���� ���� �־��� ��, ����� ����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
//
//		�Է�: ù° �ٿ� 3���� ���� ��ĭ�� ���̿� �ΰ� ���� �־�����.
//		���: ù° �ٿ� ������ ����� ��� �Ѵ�.
//
//		���� �Է�1:  3 3 6	 ���� ���1: 1300
//		���� �Է�2:  2 2 2  ���� ���2: 12000  
//		���� �Է�3:  6 2 5  ���� ���2:   600
		
//		Scanner input = new Scanner(System.in);
//		int n1 = 0, n2 = 0, n3 = 0, result = 0;
//		
//		System.out.println("�ֻ����� �� 3�� �Է�");
//		n1 = input.nextInt();
//		n2 = input.nextInt();
//		n3 = input.nextInt();
//		
//		if (n1 == n2) {
//			if (n2 == n3) {
//				result = 10000 + n1 * 1000;
//				System.out.println("��� : " + result);
//			}
//			else {
//				result = 1000 + n1 * 100;
//				System.out.println("��� : " + result);
//			}
//		}
//		else if (n2 == n3) {
//			result = 1000 + n2 * 100;
//			System.out.println("��� : " + result);
//			
//		}
//		else if (n1 == n3) {
//				result = 1000 + n1 * 100;
//				System.out.println("��� : " + result);
//		}
//		else {
//			if (n1 > n2 && n1 > n3) {
//				result = n1 * 100;
//				System.out.println("��� : " + result);
//			}
//			else if (n2 > n3 && n2 > n1) {
//				result = n2 * 100;
//				System.out.println("��� : " + result);
//			}
//			else {
//				result = n3 * 100;
//				System.out.println("��� : " + result);
//			}
//				
//		}
//		
		
		
//		�޴����� ��� �� �ݾ��� �Է� ���� �� �޴��� �����ϸ� �Ž������� �ֹ��� �޴��� ��µȴ�.
//		 ------- �޴��� -------
//		 1. �ܹ���(9,000��)
//		 2. ����(11,000��)
//		 3. ġŲ(32,000��)
//		 4. �ݾ� ��ȯ
//		 -----------------------
//		 �� ���� �ݾ��� �Է����� �� ���� ������ �ݾ��� �޴����� ���� �ݾ��� �ԷµǾ��ٸ�, "�ֹ��� �� �ִ� �޴� ���� xxxx�� ��ȯ" �� ���
//		 �� ���� �ݾ׺��� ��� ������ �����ϴ� ��� "���� �ݾ��� �����մϴ�. xxxx�� ��ȯ" �� ���
//		 �� �޴��ǿ� ���� �޴� ���� �� "�ùٸ� �ֹ��� �ƴմϴ�. xxxx�� ��ȯ" �� ���
//		 �� �޴��� �����Ҷ� 4���� ���� �� "���� �ݾ� xxxx�� ��ȯ" �� ���
//
//		 �� �ֹ� �� ( 1. ����, 2. ����Ļ� ) �������� ����Ͽ� �����ϰ��� �� ���� �޼����� �Ʒ��� ���� ����Ѵ�
//		 ( 1, 2 �ܿ� �ٸ� ���� ���� �� "���� ���� xxxx�� ��ȯ" �� ��� )
//		 -----------------------
//		 �ֹ� �޴� : xxxx
//		 ���� or ����Ļ�
//		 �Ž����� : xxxx��
//		 -----------------------
		
//		Scanner input = new Scanner(System.in);
//		int coin = 0, num = 0, menu = 0, inout = 0, remain = 0;
//		
//		System.out.println("------- �޴��� -------");
//		System.out.println("1. �ܹ���(9,000��)");
//		System.out.println("2. ����(11,000��)");
//		System.out.println("3. ġŲ(32,000��)");
//		System.out.println("4. �ݾ� ��ȯ");
//		System.out.println("-----------------------");
//		
//		System.out.print("�޴� ���� : ");
//		num = input.nextInt();
//		
//		
//		if (num > 4 || num < 1)
//			System.out.println("�ùٸ� �ֹ��� �ƴմϴ�. " + coin + "�� ��ȯ");
//		
//		else {
//			System.out.print("�ݾ� : ");
//			coin = input.nextInt();
//			
//			if (coin < 9000)
//				System.out.println("�ֹ��� �� ���� �޴� ���� " + coin + "�� ��ȯ");
//			
//			else if (num == 1) {
//				menu = 9000;
//				if (coin < menu)
//					System.out.println("�ֹ��� �� ���� �޴� ���� " + coin + "�� ��ȯ");
//				else {
//					remain = coin - menu ;
//					
//					System.out.println("1. ���� 2. ����Ļ�");
//					inout = input.nextInt();
//					
//					if (inout == 1) {
//						System.out.println("-----------------------");
//						System.out.println("�ֹ� �޴� : �ܹ���");
//						System.out.println("����");
//						System.out.println("�Ž����� : " + remain + "��");
//						System.out.println("-----------------------");
//					}
//					else if (inout == 2) {
//						System.out.println("-----------------------");
//						System.out.println("�ֹ� �޴� : �ܹ���");
//						System.out.println("����Ļ�");
//						System.out.println("�Ž����� : " + remain + "��");
//						System.out.println("-----------------------");
//					}
//					else {
//						System.out.println("���� ���� " + coin + "�� ��ȯ");
//					}
//				}
//			}
//			else if (num == 2) {
//				menu = 11000;
//				if (coin < menu)
//					System.out.println("���� �ݾ��� �����մϴ�. " + coin + "�� ��ȯ");
//				else {
//					remain = coin - menu ; 
//					
//					System.out.println("1. ���� 2. ����Ļ�");
//					inout = input.nextInt();
//					
//					if (inout == 1) {
//						System.out.println("-----------------------");
//						System.out.println("�ֹ� �޴� : ����");
//						System.out.println("����");
//						System.out.println("�Ž����� : " + remain + "��");
//						System.out.println("-----------------------");
//					}
//					else if (inout == 2) {
//						System.out.println("-----------------------");
//						System.out.println("�ֹ� �޴� : ����");
//						System.out.println("����Ļ�");
//						System.out.println("�Ž����� : " + remain + "��");
//						System.out.println("-----------------------");
//					}
//					else {
//						System.out.println("���� ���� " + coin + "�� ��ȯ");
//					}
//			}
//			}
//			else if (num == 3) {
//				menu = 32000;
//				if (coin < menu)
//					System.out.println("���� �ݾ��� �����մϴ�. " + coin + "�� ��ȯ");
//				else {
//					remain = coin - menu;
//					
//					System.out.println("1. ���� 2. ����Ļ�");
//					inout = input.nextInt();
//					
//					if (inout == 1) {
//						System.out.println("-----------------------");
//						System.out.println("�ֹ� �޴� : ġŲ");
//						System.out.println("����");
//						System.out.println("�Ž����� : " + remain + "��");
//						System.out.println("-----------------------");
//					}
//					else if (inout == 2) {
//						System.out.println("-----------------------");
//						System.out.println("�ֹ� �޴� : ġŲ");
//						System.out.println("����Ļ�");
//						System.out.println("�Ž����� : " + remain + "��");
//						System.out.println("-----------------------");
//					}
//					else {
//						System.out.println("���� ���� " + coin + "�� ��ȯ");
//					}
//			}
//			}
//			else 
//				System.out.println("���Աݾ� " + coin + "�� ��ȯ");
//				
//				
//		}
		
		
//		���� 3.
		
//		¯���� ��� �ð��� �ǳ� �ʴ´�.
//		�׷��� ��� �ð� ���� 25�� ���� �˶��� ���� ���̴�.
//		* ��� �ð��� �Է��ϸ�, ��� �ð� 25�� ���� �ð��� ������ִ� ���α׷��� ���弼��
//
//		[����]
//		1. 00�� 00���� �������� �ð��� �Է��Ѵ�.
//		2. �ð�(hour) �� 00��~23�� ���̿��� �����ϸ�,
//		    ��(minute) �� 00��~59�� ���̿��� �����Ѵ�.
//		 (�̿��� �ð��� �ԷµǸ� "�ð�[00��-23��] ��[0��-59��]�̳��� ������ �ٽ� �����ּ���"��� ����Ѵ�)
//		3. �˶� ��� ���´� "XX�� XX�п� �˶��� ���߰ڽ��ϴ�"�̴�.
//		 (��, 00�� 00��~00�� 24�� ������ �ð��� �Է��ϸ�
//		   "���� 23�� XX�п� �˶��� ���߰ڽ��ϴ�" ��� ����Ѵ�)
		
		Scanner input = new Scanner(System.in);
		int hour = 0, min = 0, sub;
		
		System.out.println("�ð��� �Է��ϼ���");
		
		System.out.print("�� : ");
		hour = input.nextInt();
		
		System.out.print("�� : ");
		min = input.nextInt();
		
		System.out.println("��ӽð� : " + hour + "�� " + min + "��");
		
		if (hour > 23 || hour < 0 && min > 59 || min < 0) {
			System.out.println("�ð�[00��-23��] ��[0��-59��]�̳��� ������ �ٽ� �����ּ���");
		}
		else {
			sub = min - 25;
			if (hour == 0 && sub < 0) {				
				hour = 23;
				min = 60 + sub ;
				System.out.println("���� " + hour + "�� " + min + "�п� �˶��� ���߰ڽ��ϴ�.");
			}
			
			else if (sub < 0) {
				hour -= 1;
				min = 60 + sub ;
				System.out.println(hour + "�� " + min + "�п� �˶��� ���߰ڽ��ϴ�.");
			}
			else {
				System.out.println(hour + "�� " + sub + "�п� �˶��� ���߰ڽ��ϴ�.");				
			}
				
				
		}
			
			
		
		
		
		
		
		
		
				


			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
