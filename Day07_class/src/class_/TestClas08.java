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
		
	}//���� Ŭ���� �ȿ� �ִ� �޼ҵ�� �̸������� ���� ����
	public void printN(int n) {
		System.out.println("n : " + n);
	}
}
