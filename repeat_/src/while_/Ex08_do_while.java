package while_;

public class Ex08_do_while {
	public static void main(String[] args) {
		int i = 5, su = 2;
		
		do {
//			su++;
			System.out.println("do while : " + su);
			su++;
			
		} while (su < i);
		
		System.out.println("다음 문장 실행");
	}

}
