package switch_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//�ݺ���
		Scanner input = new Scanner(System.in);
		
		String name;
		
		while (true) { // ������ �������� - ���� ��� �ݺ� ����
			System.out.print("�̸� �Է� : ");
			name = input.next();
			
			System.out.println("�Է��� �̸� : "+ name);
		}
	}

}
