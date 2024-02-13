package array_;

public class Ex02_w_repeat {
	public static void main(String[] args) {
		double dos[] = new double[] {1.111, 2.222, 3.333}; //초기화를 0이 아닌 값들로 진행
		System.out.println(dos[0]);
		
		System.out.println(dos.length); // 베열의 길이를 세는 함수
		
		for (int i = 0 ; i < 3 ; i++) {
			System.out.println(i + ". " + dos[i]);
		}
		
	}

}
