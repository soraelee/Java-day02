package while_;

public class Ex07_error {
	public static void main(String[] args) {
		String n1 = null, n2 = "test"; // 첫번째 글자가 대문자 => class
		int num = 1000;
		
//		num. // 첫번째 글자가 소문자 => 어떠한 기능도 없음
		
//		System.out.println(n1.equals(n2)); // n1 이 null이기 때문에 해당 기능 사용 불가
		
		System.out.println(n2.equals(n1)); // 해당 경우는 사용할 수 있음
		
		//null값비교
		if (n1 == null) {
			System.out.println("n1을 입력하세요");
			
		}
		else {
			if (n1.equals(n2)) {
				System.out.println("두 문자열은 같다");
				
			}
			else {
				System.out.println("다르다");
			}
		}
	}
}
