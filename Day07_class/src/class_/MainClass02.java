package class_;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 tc = new TestClass02();
		
		int num;
		num = tc.inputTest();
		
		if (num % 2 == 0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
		
		num = tc.inputTest();
		
		if (num % 3 == 0) {
			System.out.println("3�� ���");
		}
		else {
			System.out.println("3�� ��� �ƴ�");
		}
		
		//��� ���
		/*
		Scanner input= new Scanner(System.in);
		int num ;
		System.out.println("�� �Է�"); //�ߺ��Ǿ� ȣ�� : �ϳ��� ������� ��
		num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
		
		System.out.println("�� �Է�");
		num = input.nextInt();
		
		if (num % 3 == 0) {
			System.out.println("3�� ���");
		}
		else {
			System.out.println("3�� ��� �ƴ�");
		}*/
		
		
		
	}

}
