package for_;

public class Ex04 {
	public static void main(String[] args) {
		int i = 1;
		for (; i < 10 ; i += 2) {
			System.out.println(i);
			
		}
		System.out.println("------------- i : " + i);
		
		for(i = 1; i <= 10 ; i ++) {
			System.out.print("i : " + i + " => ");
			if (i % 2 == 0)
				System.out.println("Â¦¼ö");
			else 
				System.out.println("È¦¼ö");
			System.out.println("+++++");
		}
	}

}
