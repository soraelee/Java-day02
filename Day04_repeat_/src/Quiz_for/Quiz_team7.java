package Quiz_for;

public class Quiz_team7 {
	public static void main(String[] args) {
//		1�� ����
//
//		1���� 100������ ¦�� ���� ���Ͻÿ� [������ Psum]
//		1���� 100������ Ȧ�� ���� ���Ͻÿ� [������ Hsum]
		
//		int Psum = 0, Hsum = 0, j = 1;
//		
//		for (int i = 0 ; i < 100; i++) {
//			
//			if (j % 2 == 0)
//				Psum += j;
//			else 
//				Hsum += j;
//				
//			j++;
//		}
//		
//		System.out.println("1 ~ 100 Ȧ���� �� : " + Hsum);
//		System.out.println("1 ~ 100 ¦���� �� : " + Psum);


//		2�� ����
//
//		�������� �ۼ��ϼ���
		
//		for (int i = 1 ; i <= 9 ; i ++) {
//			for (int j = 1 ; j <= 9 ; j++)
//				System.out.println(i + "X" + j + "=" + i*j);
//		}
		
//		3�� ����
//		[������] �� Ʈ���� ���弼��
//
//			[����]	  *     ��ø for���� ����Ͽ� �ϼ��Ͻÿ�
//				     ***
//				    *****
//				   *******
//				  *********  
		
		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; 5 - i - 1 > j ; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i ; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < i ; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

		
	}

}
