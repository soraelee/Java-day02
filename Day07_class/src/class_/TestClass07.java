package class_;

import java.util.Scanner;

public class TestClass07 {
	public int inputData() {
		System.out.println("�Է� �޴� ����Դϴ�. ");
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.println("�� �Է�");
		num = input.nextInt();
		return num;
		
	}
	public int opData(int a) {
		int sum = 0;
		for (int i = 1 ; i <= a ; i++) {
			sum += i ;
		}
		return sum;
	}
	public void printData(int n, int s) {
		System.out.println("1 ~ " + n + "������ �� : " + s);
	}
}
