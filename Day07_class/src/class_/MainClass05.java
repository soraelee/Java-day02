package class_;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = 0;
				
		// �Է�
		System.out.println("�� �Է�");
		num = input.nextInt(); 
		
		TestClass05 t = new TestClass05();
		
		t.sumFunc(num);
	}

}
