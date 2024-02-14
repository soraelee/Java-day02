package string;

public class Ex03 {
	public static void main(String[] args) {
		//공백 때문에 비교 시 오류 발생
		String str = "test     ";
		
		System.out.println("str : "+ str);
		System.out.println(str.equals("test"));
		
		//선처리 후 비교
		String result = str.trim(); //양쪽의 공백을 모두 삭제
		
		System.out.println("result : " + result);
		System.out.println(result.equals("test"));
		
		
		String addr = "05214 노원구 동일로4567"; //split : 특정 문자를 기준으로 자름
		System.out.println(addr);
		
		String[] split = addr.split(" "); //하나의 배열로 나타남 //자를 문자를 안에 넣음
		for (int i = 0; i < split.length ; i++) {
			System.out.println(i + ". " + split[i]);
		}
		
		//replace
		String phone = "010-1234-5678";
		System.out.println("phone : " + phone);
		String rep = phone.replace("-", "a");
		System.out.println("rep : " + rep);
		
		
		phone = "1234";
		//web에서 입력되는 형식은 모두 문자열 => 연산?
		System.out.println(phone + 100);
		
		int num = Integer.parseInt(phone);
		System.out.println(num + 100);
		
		String s = num + "";
		System.out.println(s + 100);
	}
}
