package exception;

// ���� ����

class Test06 { 
	public void test1( ) {
		System.out.println(1111111);
		test2(); //���� ó���϶�� ���� �߻� //2) ���⼭�� ���� ���� ����
	}
	public void test2() {//���� ���� ���� ��
		System.out.println(2222222);
		 try { //try catch�� �ٸ� �޼ҵ忡 ������ ���� ����
			 Thread.sleep(1000); 
		 } catch (InterruptedException e ) {
			 e.printStackTrace();
		 }
	}
}


public class Ex06 {
	public static void main(String[] args){
		
//		Thread.sleep(1000); //������ �߻��� ������ �ִ� �͵��� �̸� ����ó�� �϶�� ��
		
		Test06 t = new Test06();
		t.test1(); // 3) ���⼭�� �߻�
		
	}

}
