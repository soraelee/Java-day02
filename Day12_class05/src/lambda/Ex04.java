package lambda;

import java.util.Scanner;

interface Test04 {
	public void test(); //�������̽����� �����ϰ� �ѹ��� ����ϱ� ���� ���ٽ� Ȱ��
}

class TestClass04 {
	public void testClass(Test04 t) { //�������̽� �ڷ����� �޾Ƽ� ����ϰڽ��ϴ�
		System.out.println("��� �����մϴ�");
		t.test();
	}
}
public class Ex04 {
	public static void main(String[] args) {
		TestClass04 t01 = new TestClass04();
		
		Test04 t04 = new Test04() {

			@Override
			public void test() {
				System.out.println("test ����˴ϴ�.");
			}
			
		};
		
		t01.testClass(t04); // <- Test04��� Ŭ������ �޾���� ��
		
		t01.testClass(new Test04() {//�����ϱ����� �������� �ѹ��� ����ϰ��� �� => ������ ���� �ʿ䰡 ����
									// ��ü�� ����� �ش� �޼ҵ带 ã�ư�

			@Override
			public void test() {
				System.out.println("test11 ����˴ϴ�.");
			}
			
		});
		
		
		//Scanner�� ����
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("scanner : " + input.next()); //���� �ڷ��� ���� �ʿ� ���� �ѹ��� ����Ѵٸ� �̷��Ե� �����
//		
		
		System.out.println("------------------------");
		
		Test04 t1 = () -> {
			System.out.println("t1 ����");
		};
		t01.testClass(t1);
	}

}
