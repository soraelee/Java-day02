package for_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ݺ� Ƚ�� �Է�");
		int repat = input.nextInt();
		
		for (int i = 0 ; i < repat ; i++) {
			System.out.println(i + "�� �ݺ�");
		}
		
		for (int i = 10 ; i > repat ; i--) {
			System.out.println(i + "�� �ݺ�");
		}
		
		System.out.println("���� ������ ���� !!");
	}
}
