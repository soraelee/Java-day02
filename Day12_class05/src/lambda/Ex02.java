package lambda;
interface Test02 {
	//�������̽��� �߻�ȭ�� �޼ҵ尡 �������� ���
	public void test() ;
//	public void test12() ; 
	
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02() {
			
			@Override
			public void test() { //���������� �޼ҵ带 ����
				System.out.println("test ����");
			} // ���� => �ش� �ڵ带 ����
		};
		t.test();
		
		System.out.println("-----------------");
		Test02 t02 = () -> System.out.println("test ���� 222");
		t02.test();
	}

}
