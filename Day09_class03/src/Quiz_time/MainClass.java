package Quiz_time;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		TimeService ts = new TimeService();
		/*
		 1. ���� �ð� ����
		 2. ���� �ð� Ȯ��(����Ͻú���)
		 3. ����ð� ����
		 4. ���� �ð� Ȯ��(����Ͻú���)
		 5. ���ð� ��������
		 	- ?�ð� ?�� ?�� �����
		 */
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. ���� �ð� ����");
			System.out.println("2. ���� �ð� Ȯ��");
			System.out.println("3. ����ð� ����");
			System.out.println("4. ���� �ð� Ȯ��");
			System.out.println("5. ��� �ð� ��������");
			System.out.print(">>> ");
			int num = input.nextInt();
				
			switch (num) {
			case 1:
				ts.startSet();
				break;
			case 2:
				System.out.println(ts.startcheck());
				
				break;
				
			case 3:
				ts.endSet();
				break;
			case 4:
				System.out.println(ts.endcheck());
				
				break;
			case 5:
				System.out.println(ts.useTime());
				break;
			default:
				System.out.println("�߸� �Էµ� ����");
					break;	
			}
		}
	}

}
