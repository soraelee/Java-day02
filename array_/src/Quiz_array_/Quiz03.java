package Quiz_array_;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
//		¦�� �Է� �� index�� ¦�� ��° �� �� ���
//		Ȧ�� �Է� �� index�� Ȧ�� ��°�� �� ���
		
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[] {10, 54, 13, 17, 25, 30};
		String odd_even = null;
		
		System.out.print("¦�� Ȧ�� �Է� : ");
		odd_even = input.next();
		
		for (int i = 0 ; i < arr.length ; i++) {
			switch (odd_even) {
			case "¦��" :
				if (i % 2 == 0) {
					System.out.println("¦�� " + i + "��° �迭");
					System.out.println("�� : " + arr[i]);
				}
				break;
			case "Ȧ��" :
				if (i % 2 == 1) {
					System.out.println("Ȧ�� " + i + "��° �迭");
					System.out.println("�� : " + arr[i]);
				}
				break;
			}
		}
		//�ε����� �̸� �����Ͽ� ¦�� Ȧ�� �з�
		int k = 0;
		if( odd_even.equals("¦��")) {
			k = 0;
		}else {
			k = 1;
		}
		for( ;k < arr.length ; k = k + 2 ) {
			System.out.println(k + "."+arr[k]);
		}

		//���� �������� Ȱ��
		
		for(int j = (odd_even.equals("¦��")?0:1) ; j < arr.length ; j+=2  ) {
			System.out.println(j + "."+arr[j]);
	      }


	}

}
