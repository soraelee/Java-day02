package for_;

/*
 * F11 : ����� ���۸��
 * F6 : ���� �� ����(�޼ҵ� �ǳ� ��)
 * F7 : ���� �� ����(�޼ҵ�� �̵�)
 * F8 : ���� �극��ũ �����ͷ� �̵�
 * ctrl + F2 : ����� ��� ����
 */

public class Ex02 {
	public static void main(String[] args) {
		int sum = 0;
		//sum = sum + i ; i++ ;
		
		for(int i = 1 ; i <= 100000 ; i ++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("-----");
		System.out.println(sum);
		
	}
}
