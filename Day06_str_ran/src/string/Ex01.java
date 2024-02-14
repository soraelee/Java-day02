package string;

public class Ex01 {
	public static void main(String[] args) {
		String str;
		String str1 = new String();
		String str2 = "test";
		String str3 = new String("test init");
		
		System.out.println("str3 : " + str3);

		String s1 = str3.toUpperCase(); // 해당하는 값을 전부 대문자화
		System.out.println("s1 : " + s1);
		
		String s2 = s1.toLowerCase(); // 해당하는 값을 전부 소문자화
		System.out.println("s2 : " + s2);
		
		str3 = "JaVa"; //java, Java
		
		
		//자바는 대소문자를 구분
		if (str3.equals("java")) {
			System.out.println("수강과목은 자바이군요");
		}
		else {
			System.out.println("다르다!");
		}
		
		
		if (str3.toLowerCase().equals("java")) {
			System.out.println("수강과목은 자바이군요");
		}
		else {
			System.out.println("다르다!");
		}
				
	}

}
