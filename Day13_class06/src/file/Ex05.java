package file;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//next�� nextLine
		Scanner input = new Scanner(System.in);
		
		String s1, s2;
		
		//next : ����� ���͸� �����ڷ� �Է�
		/*
		System.out.println("1. ���ڿ� �Է�");
		s1 = input.next();
		System.out.println("2. ���ڿ� �Է�");
		s2 = input.next();
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		*/
		
		//nextLine : ����� ���͸� �����ڷ� �Է�
		/*
		System.out.println("1. ���ڿ� �Է�");
		s1 = input.next();
		System.out.println("2. ���ڿ� �Է�");
		input.nextLine();
		s2 = input.nextLine();
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		*/
		
		int num;
		while (true) {
			try {
				System.out.println("�� �Է�");
				num = input.nextInt();
				System.out.println("�Է� �� : " + num);
			} catch (Exception e) {
				s1 = input.nextLine();
				System.out.println(s1 + "�� �Է��ϼ���");
			}
		}
	}

}
