package exception;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		while (true) {
			System.out.println("�� �Է�");
			num = input.nextInt();
			try {
				System.out.println("��� : " + (100 / num));
			}
			catch (Exception e) {//�ڽ� Ŭ���� �� ��� �θ� Ŭ������ ���ļ� ��� ���� (��� ó��)
				System.out.println("0 �Է��Ͻø� �ȵǿ�!");
				System.out.println("���� : " + e);
			}
		}
	}

}
