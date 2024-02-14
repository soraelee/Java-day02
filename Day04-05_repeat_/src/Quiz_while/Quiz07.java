package Quiz_while;

public class Quiz07 {
	public static void main(String[] args) {
		//다중 반복문
		//1)
//		for (int i = 1 ; i <= 5 ; i++) {
//			for (int j = 1 ; j <= 5 ; j++) {
//				System.out.print(i * j + "\t");
//			}
//			System.out.print("\n");
//		}
//		
		//2)
		for (int i = 0 ; i <= 21 ; i = i +5) {
			for (int j = 1 ; j <= 5 ; j++) {
				System.out.print(i + j + "\t");
//				System.out.println("a");
			}
			System.out.print("\n");
		}
	}

}
