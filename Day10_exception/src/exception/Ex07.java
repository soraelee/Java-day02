package exception;

import java.util.Scanner;

//���� ����
//�ڵ�� ���������δ� ������ �߻����� ������, �������� �ǵ��� �ٸ� ��� 

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.print("���� �Է� : ");
		try {
			age = input.nextInt();
			if (age < 0) {
				throw new Exception("������ �ȵſ�!");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("����� ���̴� : " + age);
	}

}
