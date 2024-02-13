package while_;

public class Ex02_break {
	public static void main(String[] args) {
		int i = 0;
		
		while (true) {
			i++;
			System.out.println("i : " + i);
			if (i > 3)
				break;
			
		}
		System.out.println("다음 문장 실행 !!");
		
		for (;;) {
			System.out.println("for i : " + i);
			i++;
			
			if (i == 6) {
				break;
			}
		}
		
		System.out.println("aa"); // 무한 루프 밖에 문장 작성 시 에러 발생
		
	}
}
