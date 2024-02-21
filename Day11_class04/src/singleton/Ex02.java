package singleton;

class Test02{
	int num;
	static int cnt;
	public Test02() {
		cnt++;
		System.out.println(cnt + " : 按眉 积己");
	} //积己磊 龋免 => 按眉 积己 => 割俺鳖瘤 积己瞪鳖?
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t01 = new Test02(); //
		Test02 t02 = t01;
		Test02 t03 = t02;
		
		t01.num = 100;
		t02.num = 200;
		t03.num = 300;
		
		System.out.println(t01 + " : " + t01.num);
		System.out.println(t02 + " : " + t02.num);
		System.out.println(t03 + " : " + t03.num);
	}

}