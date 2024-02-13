package Quiz_array_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[] {10, 54, 13, 17, 25, 30};
		String odd_even = null;

		System.out.print("Â¦¼ö È¦¼ö ÀÔ·Â : ");
		odd_even = input.next();

		switch (odd_even) {
		case "Â¦¼ö" :
			for (int a : arr) {
				if (a % 2 == 0) {
					System.out.println("Â¦¼ö : " + a);
				}
			}
			break;

		case "È¦¼ö" :
			for (int a : arr) {
				if (a % 2 == 1) {
					System.out.println("È¦¼ö : " + a);
				}
			}
			break;

		}



	}

}
