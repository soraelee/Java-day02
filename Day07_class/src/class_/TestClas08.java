package class_;

public class TestClas08 {
	public void inputData() { 
		int num = 100;
//		return num ;
		op(num);
	}
	public void op(int num) {
		num += 1000;
		printN(num);
		
	}//같은 클래스 안에 있는 메소드는 이름만으로 접근 가능
	public void printN(int n) {
		System.out.println("n : " + n);
	}
}
