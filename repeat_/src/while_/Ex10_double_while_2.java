package while_;

public class Ex10_double_while_2 {
	public static void main(String[] args) {
		for (int k = 0 ; k < 3; k++) {
			System.out.println("===상위 반복문 시작");
			for (int i = 0 ; i < 3 ; i++) {
				System.out.println(i + ".for");
//				break;
			}
			System.out.println("상위 반복문 끝 ===");
			break;
		}
		System.out.println("다음 문장을 실행");
	}

}
