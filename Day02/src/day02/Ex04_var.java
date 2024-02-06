package day02;

public class Ex04_var {
	public static void main(String[] args) {
		//형 변환
		char ch = 'A';
		System.out.println(ch);
		
		int num = ch; //char을 int 형태의 num에 대입 => 자동 형변환
		System.out.println(num);
		
		char ch02 = (char)num;
		
		
		//double과 float 비교
		double d = 1.111;
		float f = (float)1.111; 
		float f1 = 1.111f;
	}
}
