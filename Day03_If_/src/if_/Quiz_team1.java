package if_;

import java.util.Scanner;

public class Quiz_team1 {
	public static void main(String[] args) {
		// 1.�Է¹��� ���� ������� �������� �Ǵ��ϴ� ���α׷��� �ۼ��ϼ���.
//		Scanner input = new Scanner(System.in);
//		int num ;
//		
//		System.out.print("������ �Է��ϼ��� : ");
//		num = input.nextInt();
//		
//		if (num > 0)
//			System.out.println(num + "�� ��� �Դϴ�.");
//		else if (num < 0)
//			System.out.println(num + "�� ���� �Դϴ�.");
		
		
		// 2. �� ���� �Է� �޾� �Ʒ� ����� �����ϴ� ���⸦ ����ÿ�.
//		Scanner input = new Scanner(System.in);
//		int num1 = 0, num2 = 0, num3 = 0;
//		int sum, sub, mul, left;
//		double div;
//		
//		System.out.println("���� �Դϴ�.");
//		System.out.print("�� �� �Է� : ");
//		num1 = input.nextInt();
//		num2 = input.nextInt();
//		System.out.println("������ ������ ������ �����ϴ�.");
//		System.out.println("1.����");
//		System.out.println("2.����");
//		System.out.println("3.����");
//		System.out.println("4.������");
//		System.out.println("5.������");
//		System.out.print("�����ϰ��� �ϴ� ������ ��ȣ�� ���ÿ� : ");
//		num3 = input.nextInt();
//		
//		sum = num1 + num2;
//		sub = num1 - num2;
//		mul = num1 * num2;
//		div = (double)num1 / num2;
//		left = num1 % num2;
//		
//		if (num3 == 1)
//			System.out.println("���� : " + sum);
//		else if (num3 == 2)
//			System.out.println("���� : " + sub);
//		else if (num3 == 3)
//			System.out.println("���� : " + mul);
//		else if(num3 == 4)
//			System.out.println("������ : " + div);
//		else if (num3 == 5)
//			System.out.println("������ : " + left);
		
		//3. ���ڿ��� �Է¹޾� , �Է¹��� ���ڿ��ȿ� a�� ���ԵǾ��ִ��� ���θ� ����ϴ� ������ ����ÿ� (str.contains(String) )
		Scanner input = new Scanner(System.in);
		String st = null;
		
		System.out.print("�ܾ� �Է� : ");
		st = input.next();
		
		if (st.contains("a"))
			System.out.println("a�� ���ԵǾ� �ֽ��ϴ�.");
		else 
			System.out.println(st);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
