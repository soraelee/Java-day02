package if_;

import java.util.Scanner;

public class Quiz_team2 {
	public static void main(String[] args) {
//		���� 1. 
//		1����, 2����, 3����, 4����, 5���� ���� �ִ� ������ ġ����.
//		�� �����̶� 60�� �̸��� ��� "���հ��Դϴ�."�� ����ϰ�
//		������ 400�� �̻��̸� "�հ��Դϴ�!"�� ����Ͻÿ�.
		
//		Scanner input = new Scanner(System.in);
//		
//		int s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;
//		
//		System.out.print("���� �Է� : ");
//		s1 = input.nextInt();
//		s2 = input.nextInt();
//		s3 = input.nextInt();
//		s4 = input.nextInt();
//		s5 = input.nextInt();
//		
//		if (s1 < 60 || s2 < 60 || s3 < 60 || s4 < 60 || s5 < 60)
//			System.out.println("���հ� �Դϴ�.");
//		else if ((s1 + s2 + s3 + s4 + s5) >= 400)
//			System.out.println("�հ� �Դϴ�!");
//		
		
//		���� 2.
//		������ �г��� �Է������� �հ� ���հ� ����
//
//		���� -1) ������ 60�� �̻�� �հ� �׷��� ������ ���հ� ���
//		        2)  ��, 4�г��� �Է��������� 70�� �̻��̿��� �հ��̴�
		
		
//		Scanner input = new Scanner(System.in);
//		
//		int grade = 0, score = 0;
//		
//		System.out.print("�г� : ");
//		grade = input.nextInt();
//		System.out.print("���� : ");
//		score = input.nextInt();
//		
//		
//		if (grade == 4) {
//			if (score >= 70)
//				System.out.println("�հ�");
//			else 
//				System.out.println("���հ�");
//		}
//		else {
//			if (score >= 60)
//				System.out.println("�հ�");
//			else
//				System.out.println("���հ�");
//		}
		
		
//		���� 3.
//		������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
//
//		���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�.
//		1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. 
//		������, 2000���� 400�� ����̱� ������ �����̴�.
//
//		�Է�)
//		ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.
//
//		���)
//		ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�
		
		
//		Scanner input = new Scanner(System.in);
//		int year = 0;
//		
//		System.out.print("���� : ");
//		year = input.nextInt();
//		
//		if (year < 1 || year > 4000)
//			System.out.println("1~4000 ���̸� �Է��ϼ���");
//		else {
//			
//			if (year % 4 == 0) {
//				if (year % 400 == 0)
//					System.out.println(1);
//				else if (year % 100 != 0)
//					System.out.println(1);
//				else 
//					System.out.println(0);
//			}
//			else 
//				System.out.println(0);
//		}
//		
		
		
//		���� 4.
//		���� �⵵�� �Է��մϴ�.
//		���̸� �Է��մϴ�.
//		�¾ ��븦 ���մϴ�.
		
		Scanner input = new Scanner(System.in);
		int year = 0, age = 0, born = 0;
		
		System.out.print("���� �⵵ : " );
		year = input.nextInt();
		System.out.print("���� : " );
		age = input.nextInt();
		
		born = year - age + 1;
		
		if (born / 10 == 201)
			System.out.println("2010��뿡 �¾���ϴ�.");
		else if (born / 10 == 200)
			System.out.println("2000��뿡 �¾���ϴ�.");
		else if (born / 10 == 199)
			System.out.println("1990��뿡 �¾���ϴ�.");
		else if (born / 10 == 198)
			System.out.println("1980��뿡 �¾���ϴ�.");
		else if (born / 10 == 197)
			System.out.println("1970��뿡 �¾���ϴ�.");
		else if (born / 10 == 196)
			System.out.println("1960��뿡 �¾���ϴ�.");
		else if (born / 10 == 195)
			System.out.println("1950��뿡 �¾���ϴ�.");
		else if (born / 10 == 194)
			System.out.println("1940��뿡 �¾���ϴ�.");
		else if (born / 10 == 193)
			System.out.println("1930��뿡 �¾���ϴ�.");
			
		
	}
}
