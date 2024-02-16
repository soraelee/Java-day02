package set_get;


class Test01 {
	 private int num = 12345; //하지만 이런식으로 모든 값을 하나하나 return하는 것은 아주 불편
	 public void test(int n) {
		num = n;
		
	}
	 public int test2() {
		 return num;
	 }
}//public : 외부에서 접근이 가능
//private : 외부 접근 불가

public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		
		t.test(1000);
		System.out.println(t.test2());
	}
}
