package Quiz_while;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, coin ;

		while (true) {
			System.out.println("==============Ŀ�� ���Ǳ�=============");
			System.out.println();
			System.out.println("1. Ŀ��(200)\t2.���ھ�(250)\t3. ��ȯ\t4. ����");
			System.out.print("����� �����ϼ��� >>> ");
			coin = input.nextInt();
			System.out.print("�޴��� �����ϼ��� >>> ");
			num = input.nextInt();

			if (coin < 200) {
				System.out.println("����� �����մϴ�.");
				//						break;
			}
			else if (num < 3) {
				do {

					if (num == 1) {
						System.out.println("���ְ� �弼��.");
						coin = coin - 200;

						System.out.println("==============Ŀ�� ���Ǳ�=============");
						System.out.println();
						System.out.println("1. Ŀ��(200)\t2.���ھ�(250)\t3. ��ȯ\t4. ����");
						System.out.print("�޴��� �����ϼ��� >>> ");
						num = input.nextInt();
					}
					else if (num == 2) {
						if (coin < 250) {
							System.out.println("����� �����մϴ�.");
							break;
						}
						else {
							System.out.println("���ְ� �弼��.");
							coin = coin - 250;

							System.out.println("==============Ŀ�� ���Ǳ�=============");
							System.out.println();
							System.out.println("1. Ŀ��(200)\t2.���ھ�\t3. ��ȯ\t4. ����");
							System.out.print("�޴��� �����ϼ��� >>> ");
							num = input.nextInt();
						}
					}
					else
						break;

				} while (true) ;
			}
			if (num == 3) {
				System.out.println("�Ž����� : " + coin);
				coin = 0;
				break;
			}
			else {
				System.out.println("�Ž����� : " + coin);
				coin = 0;	
				break;

			}
		}


	}
}



