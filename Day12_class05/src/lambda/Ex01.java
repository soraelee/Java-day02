package lambda;

interface Test01 { //�������̽� ����
	public void test();
}

class TestClass01 implements Test01 {

	@Override
	public void test() {
		System.out.println("test ����");
	}
	
}
public class Ex01 {
	public static void main(String[] args) {
		Test01 t  = new TestClass01() ;
		t.test();
	}

}
