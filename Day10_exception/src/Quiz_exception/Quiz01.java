package Quiz_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("���� ���α׷� �Դϴ�.");
		
		System.out.println("�ֹι�ȣ �Է�(�� 6�ڸ�)");
		
		try {
			num = input.nextInt();
			if (num / 100000 == 0 || num / 100000 > 9)
				throw new Exception("���̰� Ʋ�Ƚ��ϴ�");
			else if (num / 100000 == 9 )
				throw new Exception("���� �Ұ�");
			
			System.out.println("���԰���");
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
