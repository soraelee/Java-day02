package exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //stream(��Ʈ��) : �Է��� ���� ������ �����ϴ� ���� ��� 
												//�������� �ݾƾ� ��
		int x ;
		System.out.println("�� �Է�" );
		x = input.nextInt();

		try {
			int result = 10 / x;
			System.out.println("��� : result " + result );
			return; //������ �߻����� ������ �Լ� ����

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			input.close(); //stream ���� //finally���� ������ ���� ������ ����
			System.out.println("finally ���� " );
		}
		System.out.println("���� ���� ����");
	}

}
