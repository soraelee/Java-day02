package ran;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(Math.random());
		}
		
		//���� ���� ���� ����
		//���ϴ� ����ŭ ���ϰ�, ������ ���� ��� int������ ��ȯ
		System.out.println("-------------");
		for (int i = 0 ; i < 5 ; i++) {
			double dou = Math.random() * 10; 
			System.out.println((int)dou);
		}
		
		System.out.println("=============");
		Random r = new Random(); //���� import �߰�
		for (int i = 0 ; i < 5; i++) {
			int num = r.nextInt(10); //0~2
			System.out.println(num);
		}
	}
}
