package inheritance;

import java.util.ArrayList;

class TestClass02 extends ArrayList<String> {//�θ� Ŭ���� (�θ��� ����� �ޱ�)
	public void test() {
		System.out.println("test �޼ҵ� ����");
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 tc = new TestClass02();
		tc.test();
		tc.add("aaa");
		System.out.println(tc.get(0));
	}
}
