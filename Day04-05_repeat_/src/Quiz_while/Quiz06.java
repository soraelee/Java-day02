package Quiz_while;

public class Quiz06 {
	public static void main(String[] args) {
		//1에서 1000까지의 자연수 중에서 4로 나누어도 6으로 나누어도 나머지가 1인 수의 합
		
		int sum = 0;
		
		for (int i = 1; i <= 1000 ; i++) {
			if (i % 4 == 1 && i % 6 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}

}
