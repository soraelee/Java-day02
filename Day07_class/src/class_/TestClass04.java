package class_;

import java.util.Scanner;

public class TestClass04 {
	public void sumFunc() {
Scanner input = new Scanner(System.in);
		
		int num = 0, sum = 0;
		
		// �Է�
		System.out.println("�� �Է�");
		num = input.nextInt(); 
		
		for (int i = 1 ; i <= num ; i++) {
			sum += i;
		} //����
		
		//���
		System.out.println("1 ~ "+ num + "������ �� : " + sum);
	}

}
