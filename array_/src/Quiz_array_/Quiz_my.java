package Quiz_array_;

import java.util.Scanner;

public class Quiz_my {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[6] ;
		int max = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print((i + 1) + "��° �� �Է� : ");
			arr[i] = input.nextInt();
			while(true) {
				if (arr[i] <= 0) {
					System.out.print("�ٽ� �Է��ϼ��� : ");
					arr[i] = input.nextInt();
				}	
				else
					break;
			}
		}
		System.out.println();
		for (int a : arr)
			System.out.print(a + " ");
		
		System.out.println("\n");
		
		
		int index = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
				index = i + 1;
			}
		}
		System.out.println("�ش� �迭�� �ִ��� " + index + "��° ���� " + max + " �Դϴ�. ");
	}

}
