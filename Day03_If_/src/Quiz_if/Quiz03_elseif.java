package Quiz_if;

import java.util.Scanner;

public class Quiz03_elseif {
	public static void main(String[] args) {
		//3�� ����̸鼭 4�� ������� �ش�
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.print("�� �Է� : ");
		num = input.nextInt();
		
		
		if (num == 0) {
			System.out.println("0�� �߸� �Է��߽��ϴ�.");
		}
		else {
			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println("3�� ����̸鼭, 4�� ������� �ش��մϴ�. ");
			}
			else if (num % 3 == 0) {
				System.out.println("3�� ������� �ش��մϴ�. ");
			}
			else if (num % 4 == 0) {
				System.out.println("4�� ������� �ش��մϴ�.");
			}
			else {
					System.out.println("3�� �����, 4�� ����� �ش� �ȵ˴ϴ�.");
			}
		}
		
	}

}
