package class_;

import java.util.Scanner;

public class TestClass05 {
	public void sumFunc(int num) {
//		Scanner input = new Scanner(System.in);
				
		int sum = 0;
				
		// �Է�
//		System.out.println("�� �Է�");
//		num = input.nextInt(); 
				
		for (int i = 1 ; i <= num ; i++) {
					sum += i;
		} //���� => ������� �Է��� �־�� ���� ����
				
		//���
		System.out.println("1 ~ "+ num + "������ �� : " + sum);
			}
}
