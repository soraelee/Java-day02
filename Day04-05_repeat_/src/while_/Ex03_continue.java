package while_;

public class Ex03_continue {
	public static void main(String[] args) {
		int i = 0;
		
		while (i < 5) {
			i++;
			if ( i == 3) {
				System.out.println("33333");
//				break;
				continue;
				
			}
			System.out.println("i : " + i);
			
		}
		System.out.println("다음 문장을 실행!!!");
	}

}
