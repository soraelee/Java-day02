package Quiz_while;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, coin ;

		while (true) {
			System.out.println("==============커피 자판기=============");
			System.out.println();
			System.out.println("1. 커피(200)\t2.코코아(250)\t3. 반환\t4. 종료");
			System.out.print("요금을 투입하세요 >>> ");
			coin = input.nextInt();
			System.out.print("메뉴를 선택하세요 >>> ");
			num = input.nextInt();

			if (coin < 200) {
				System.out.println("요금이 부족합니다.");
				//						break;
			}
			else if (num < 3) {
				do {

					if (num == 1) {
						System.out.println("맛있게 드세요.");
						coin = coin - 200;

						System.out.println("==============커피 자판기=============");
						System.out.println();
						System.out.println("1. 커피(200)\t2.코코아(250)\t3. 반환\t4. 종료");
						System.out.print("메뉴를 선택하세요 >>> ");
						num = input.nextInt();
					}
					else if (num == 2) {
						if (coin < 250) {
							System.out.println("요금이 부족합니다.");
							break;
						}
						else {
							System.out.println("맛있게 드세요.");
							coin = coin - 250;

							System.out.println("==============커피 자판기=============");
							System.out.println();
							System.out.println("1. 커피(200)\t2.코코아\t3. 반환\t4. 종료");
							System.out.print("메뉴를 선택하세요 >>> ");
							num = input.nextInt();
						}
					}
					else
						break;

				} while (true) ;
			}
			if (num == 3) {
				System.out.println("거스름돈 : " + coin);
				coin = 0;
				break;
			}
			else {
				System.out.println("거스름돈 : " + coin);
				coin = 0;	
				break;

			}
		}


	}
}



