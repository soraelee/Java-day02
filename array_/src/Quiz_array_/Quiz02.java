package Quiz_array_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[] {10, 54, 13, 17, 25, 30};
		String odd_even = null;

		System.out.print("¦�� Ȧ�� �Է� : ");
		odd_even = input.next();

		switch (odd_even) {
		case "¦��" :
			for (int a : arr) {
				if (a % 2 == 0) {
					System.out.println("¦�� : " + a);
				}
			}
			break;

		case "Ȧ��" :
			for (int a : arr) {
				if (a % 2 == 1) {
					System.out.println("Ȧ�� : " + a);
				}
			}
			break;

		}



	}

}
