package Quiz_if;

import java.util.Scanner;

public class Quiz_team4 {
	public static void main(String[] args) {
//		����1.
//		1�������� 6������ ���� ���� �ֻ����� �θ��̼� ������ ���ڸ� ���ϴ� ����
//		�θ��� ������ [�̸�]�� [�ֻ��� ��]�� �Է� 
//		��� ex) [�̸�]�� �¸�
//		    	 [�̸�]�� �¸�
//		    	 ���º� 
//		    	 1~6 ������ ���ڸ� �Է����ּ���
		
		Scanner input = new Scanner(System.in);
		String a = null, b = null;
		int num1 = 0, num2;
		
		System.out.print("A �̸� : ");
		a = input.next();
		System.out.print("A �ֻ��� �� : ");
		num1 = input.nextInt();
		
		System.out.print("B �̸� : ");
		b = input.next();
		System.out.print("B �ֻ��� �� : ");
		num2 = input.nextInt();
		
		if (num1 < 1 || num1 > 6)
			System.out.println("1~6������ ���ڸ� �Է����ּ���");
		else if (num2 < 1 || num2 >6)
			System.out.println("1~6������ ���ڸ� �Է����ּ���");
		else {
			if (num1 > num2)
				System.out.println(a + "�� �¸�");
			else if (num1 < num2)
				System.out.println(b + "�� �¸�");
			else
				System.out.println("���º�");
		}
		
		
//		����2. 
//		����, ����, ���� ������ �Է��Ͽ� ��� ������ ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		��,  ����� 100�� �ʰ��̰ų�, 0�� �̸��� ��� "�߸��Է��ϼ̽��ϴ�."�� ����ϵ��� �ۼ��Ͻÿ�.
//		(A:90�� �̻�, B:90�� �̸� 80�� �̻�, C:80�� �̸� 70�� �̻�, D:70�� �̸� 60�� �̻�, F:60�� �̸�)
//		��� ex ) 
//		����, ����, ���� ������ �Է��ϼ��� > 
//		95 90 85
//		��� ������ 90���̸�, ����� A�Դϴ�.
		
//		Scanner input = new Scanner(System.in);
		int kor = 0, math = 0 , eng = 0 ;
		double avg = 0;
		
		System.out.println("����, ����, ���� ������ �Է��ϼ���");
		kor = input.nextInt();
		math = input.nextInt();
		eng = input.nextInt();
		
		avg = (kor + math + eng) / 3.0;
		
		if (avg > 100 || avg < 0)
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		else {
		
			if (avg % 10 >= 9)
				System.out.println("A");
			else if (avg % 10 >= 8)
				System.out.println("B");
			else if (avg % 10 >= 7)
				System.out.println("C");
			else if (avg % 10 >= 6)
				System.out.println("D");
			else
				System.out.println("F");
		}
		
//		����3.
//		�� ���� ����, ����, ���� �Է��Ͽ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		��, ����, ����, ���� �ƴ� ���� �Է��ϸ� "�߸��Է��ϼ̽��ϴ�." ���
//		��� ex )
//		ù��° ��� ���� ���� �� �Է� :
//		����
//		�ι�° ��� ���� ���� �� �Է� :
//		����
//		�ι�° ��� ��
		
//		Scanner input = new Scanner(System.in);
		String rsp1 = null, rsp2 = null;
		
		System.out.print("ù��° ��� ���� ���� �� �Է� : ");
		rsp1 = input.next();
		
		System.out.print("�ι�° ��� ���� ���� �� �Է� : ");
		rsp2 = input.next();
		
		if (("����".equals(rsp1) || "����".equals(rsp1) || "��".equals(rsp1)) && ("����".equals(rsp2) || "����".equals(rsp2) || "��".equals(rsp2)))
		{
			if ("����".equals(rsp1)) {
				if ("��".equals(rsp2))
					System.out.println("ù��° ��� ��");
				else if ("����".equals(rsp2))
					System.out.println("�ι�° ��� ��");
				else
					System.out.println("���º�");
				
			}
			else if ("����".equals(rsp1)) {
				if ("��".equals(rsp2))
					System.out.println("�ι�° ��� ��");
				else if ("����".equals(rsp2))
					System.out.println("���º�");
				else
					System.out.println("ù��° ��� ��");
			}
			else {
				if ("��".equals(rsp2))
					System.out.println("���º�");
				else if ("����".equals(rsp2))
					System.out.println("ù��° ��� ��");
				else
					System.out.println("�ι�° ��� ��");
			}
				
		}
			
		else 
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		
			
	}
}
