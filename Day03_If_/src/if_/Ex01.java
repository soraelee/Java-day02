package if_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("1. ���� ����");
		System.out.println("2. ����� ����");
		System.out.println("3. ����");
		System.out.print(">>>> : ");
		num = sc.nextInt();
		if (num == 1)
			System.out.println("���� ������ �����մϴ� !!");
		if (num == 2)
			System.out.println("����� ������ �����մϴ� !!");
		if (num == 3)
			System.out.println("���� ����");
		
	}

}
