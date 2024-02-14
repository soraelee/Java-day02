package ran;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(Math.random());
		}
		
		//범위 안의 난수 생성
		//원하는 값만큼 곱하고, 정수를 원할 경우 int형으로 변환
		System.out.println("-------------");
		for (int i = 0 ; i < 5 ; i++) {
			double dou = Math.random() * 10; 
			System.out.println((int)dou);
		}
		
		System.out.println("=============");
		Random r = new Random(); //위에 import 추가
		for (int i = 0 ; i < 5; i++) {
			int num = r.nextInt(10); //0~2
			System.out.println(num);
		}
	}
}
