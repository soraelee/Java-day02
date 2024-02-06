package day02;

public class Ex03_var {
	public static void main(String[] args) {
		//char
		//char 하나는 ‘’(작은 따옴표)로 묶음
		char ch = 'A';
		int num = 5;
		int ret ; // 대입연산자 X -> 쓰레기값이 저장됨(값이 존재하지 않음)
				  // 존재하지 않는 값은 출력되지 않음
		ret = ch +num;
		System.out.println("A + 5 = " + ret); //유니코드
		System.out.println("ch : " + ch);
		System.out.println("num : " + num);
		
		//String
		//string은 “”(큰 따옴표)로 묶어서 표현
		String str ="hello";
		System.out.println("변경 전 str : " + str);
		str = "test";
		System.out.println("변경 후 str : " + str) ;
	}

}
