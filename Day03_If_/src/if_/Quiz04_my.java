package if_;

import java.util.Scanner;

public class Quiz04_my {
	public static void main(String[] args) {
		// 600kg�� ���� �� �ִ� �����̳ʿ� ������ ��� �������� �Ѵ�. 
		// A�� �� ������ ���� ��, �� ������ ���Ը� �Է� �ް�
		// �� ������ ���� ���հ� ���� ����, "���� ���ſ� ������ ~kg�Դϴ�"�� ����Ͻÿ�
		// 600kg �ʰ��� ��� "���԰� 600kg�� �ʰ��Ͽ����ϴ�. ~kg�� �����Ͻÿ�" �޼����� ����Ͻÿ�
		
		
		Scanner input = new Scanner(System.in);
		int w1 = 0, w2 = 0, w3 = 0;
		int sum = 0, remain = 0;
		
		System.out.println("���Ը� �Է��Ͻÿ� : ");
		w1 = input.nextInt();
		w2 = input.nextInt();
		w3 = input.nextInt();
		
		sum = w1 + w2 + w3 ;
		remain = 600 - sum;
		
		
		if (sum > 600) {
			remain = sum - 600;
			System.out.println("���԰� 600kg�� �ʰ��Ͽ����ϴ�.");
			System.out.println(remain + "kg�� �����Ͻÿ�");
		}
		else if (w1 > w2 && w1 > w3) {
			System.out.println("�� ������ ���� ������ " + sum + "kg �Դϴ�.");
			System.out.println("���� ���Դ� " + remain + "kg �Դϴ�.");
			System.out.println("���� ���ſ� ���Դ� " + w1 + "�Դϴ�");
		}
		else if (w2 > w1 && w2 > w3) {
			System.out.println("�� ������ ���� ������ " + sum + "kg �Դϴ�.");
			System.out.println("���� ���Դ� " + remain + "kg �Դϴ�.");
			System.out.println("���� ���ſ� ���Դ� " + w2 + "�Դϴ�");
		}
		else {
			System.out.println("�� ������ ���� ������ " + sum + "kg �Դϴ�.");
			System.out.println("���� ���Դ� " + remain + "kg �Դϴ�.");
			System.out.println("���� ���ſ� ���Դ� " + w3 + "�Դϴ�");
		}
			
	}

}
