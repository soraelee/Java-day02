package while_;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//�����ϴ� ���
		Scanner input = new Scanner(System.in);
		int i, temp;
		
		System.out.println("�� �Է�");
		i = input.nextInt();
		
		boolean bool = true;
		
		while (bool) {
			System.out.println("while");
//			temp = i % 10;
//			i = i / 10;
//			System.out.print(temp + ", ");
			if ( bool ) {
				System.out.println("bool : " + bool);
				bool = false ; 
				break;
			}
			System.out.println("while ���ӹ���");
			
		}
		System.out.println("���� ������ ����");
	}
}
