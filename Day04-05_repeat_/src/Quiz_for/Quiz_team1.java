package Quiz_for;

import java.util.Scanner;

public class Quiz_team1 {
	public static void main(String[] args) {
		
		//1.����ڷκ��� ������ �Է¹ް�, 1���� �Է¹��� �� ������ ���� ����ϴ� ���α׷��� ����ÿ�
		
		Scanner input = new Scanner(System.in);
		int num1 = 0, sum = 0;
		
		System.out.print("�� �Է� : ");
		num1 = input.nextInt();
		
		for (int i = 1 ; i <= num1 ; i ++) {
			sum += i;
		}
		System.out.println("�� �� : " + sum);
		
		
//		2.���� ���߱� ����
//
//		`��� "���� ���߱� ������ �����մϴ�."`
//
//		`int computerNum ������ 1~100 ������ ������ ���� ����`
//
//		`��Ʈ ��� "¦���Դϴ� / Ȧ���Դϴ�"`
//
//		`��� "1~100 ������ ���� �Է��ϼ���: "`
//
//		`int userNum ������ ����� �Է°� ����`
//
//		`�� if userNum computerNum`
//
//		`userNum�� ComputerNum���� ũ��`
//
//		`��� "�� ���� ���Դϴ�."`
//
//		`userNum�� ComputerNum���� ������`
//
//		`��� "�� ū ���Դϴ�."`
//
//		`userNum�� ComputerNum�� ������`
//
//		`��� "������ϴ�." ��������`
		
//		Scanner input = new Scanner(System.in);
		int computerNum, userNum;
		
		System.out.println("���� ���߱� ������ �����մϴ�.");
		computerNum = input.nextInt();
		
		if (computerNum % 2 == 0)
			System.out.println("��Ʈ : ¦���Դϴ�.");
		else
			System.out.println("��Ʈ : Ȧ���Դϴ�.");

		
		for (;;) {
			
			System.out.println("1 ~ 100 ������ ���� �Է��ϼ���.");
			userNum = input.nextInt();
			
			if (userNum < computerNum)
				System.out.println("�� ū �� �Դϴ�.");
			else if (userNum > computerNum)
				System.out.println("�� ���� �� �Դϴ�.");
			else {
				System.out.println("������ϴ�.");
				break;
			}
		}
		
		
//		3.���� ������
//		����ڰ� ���ϴ� ������ �޾Ƽ� �� ���� ������ ����ڰ� ���ϴ� ��ŭ�� ������ �߻���Ű�� 
//		��� ���Ḧ ���ϸ� ����ǵ��� ����ÿ�.
//		(���� ������ Math.random()�Լ��� ����ϸ� �ȴ�)
//		�ʿ��ϴٸ� continue;�� ���
//
//		ex)
//		1.���� ������ ���
//		2.��� ����
//		���Ͻô� ����� ���ڸ� �Է����ּ���:1
//		���� Ƚ���� �Է����ּ���.20
//		������ �ּҸ� �Է����ּ���.0
//		������ �ִ븦 �Է����ּ���.10
		
//		Scanner input = new Scanner(System.in);
		int use, times, min, max, yes;
		
		System.out.println("1. ���� ������ ���");
		System.out.println("2. ��� ����");
		use = input.nextInt();
		
		while (true) {
			switch (use) {
			case 1:
				System.out.print("���� Ƚ���� �Է��ϼ��� : "); 
				times = input.nextInt();
				
				System.out.print("������ �ּҸ� �Է����ּ��� : ");
				min = input.nextInt();
				
				System.out.print("������ �ִ븦 �Է����ּ��� : ");
				max = input.nextInt();
				
				for (int i = 0 ; i < times ; i++) {
					int nn = (int) ((Math.random()*(max-min))+min);
					System.out.println(i+",range("+min+"~"+max+"):"+ nn);
				}
				break;
				
			case 2:
				break;
			}
			
			System.out.println("��� �����Ͻðڽ��ϱ�?");
			System.out.println("1. �� 2. �ƴϿ�");
			yes = input.nextInt();
				
			if (yes == 1) 
				continue;
			else
				break;	
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
