package Quiz_class;

import java.util.Scanner;

public class Quiz01_method {
	public int scanF() { //���� ��ĵ�ϴ� �Լ�
		Scanner input = new Scanner(System.in);
		
		int n;
		System.out.print("�� �Է� : ");
		n = input.nextInt();
		
		return n;
	}
	public int q1_calF(int n1, int n2) { //ū ���� ã�� �����Լ� 
		if (n1 > n2)
			return n1;
		else
			return n2;
	}
	public void int_printF(int n) { //��� �Լ�
		System.out.println(n);
	}
	public String q2_calF(int n) {
		if (n % 2 == 0)	{
			return "¦��";
		}
		else
			return "Ȧ��";
	}
	public void str_printF(String s) { //��� �Լ�
		System.out.println(s);
	}
	public void q3_calF(int n) {
		if (n % 3 == 0)
			System.out.println(n);
	}
	public String q4_calF(int n) {
		int j = 0;
		for (int i = 1 ; i <= n ; i++) {

			if (n % i == 0) {
				j += 1;
			}
		}
		if (j == 2)
			return "�Ҽ� �Դϴ�.";
		else
			return "�Ҽ��� �ƴմϴ�.";
		
	}
	public int q5_calF(int n) {
		if (n < 0) {
			return -n;
		}
		else
			return n;
	}
	public int q6_calF(int n) { //���� �ʿ�
		int num1, num2 ;
		boolean bool = true;
		num2 = n % 10;
		 do {
			if (n >= 10) {
				n = n / 10;
				num1 = n % 10;
				num2 = num1 * 10 + num2; 
			}
			else
				bool = true;
		} while (bool);
		 return num2;
		
		
	}
}












































