package exception;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, result = 0;
		System.out.println("�� �Է�");
		x = input.nextInt();
		y = input.nextInt();
		try {
			System.out.println("try ����");
			result = x / y; //���� �߻� �ÿ��� ��������� ���� ��
			System.out.println("������");
			System.out.println("������");
			System.out.println("������");
			//���ϴ� ���� => ���� �߻�
			//������ �߻����� ���� ��� try ���� �� catch �ǳʶ�
		} 
		catch (ArithmeticException e) { //�������
			//���� �߻� �� ������ ����
			System.out.println("���� �߻�");
			System.out.println("0���� ���� �� ����");
		}
		
		System.out.println("��� : " + result);
	}

}
