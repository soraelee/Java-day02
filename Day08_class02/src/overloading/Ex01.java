package overloading;

import java.util.ArrayList;

class TestClass01 { // ���������δ� ������ ���� // default : �ٸ� ���Ͽ��� �ش� �޼ҵ� ��� �Ұ�
	public void sumFunc() {
		System.out.println("�Ű����� ���� sumFunc");
	}
	public void sumFunc(int n) { //�޼ҵ��� �̸��� ������ �Ű������� ������ �ٸ��Ƿ� �ٸ� �Լ��� �ν�
		System.out.println("n�� ������ �����մϴ�");
	}
	public void sumFunc(int n, int num) {
		System.out.println(n + num + " �Դϴ�");
	}
	public void sumFunc(String n, String num) {
		System.out.println(n + num + " �Դϴ�");
	}
}

public class Ex01 {
	public static void main(String[] args) {
	TestClass01 t = new TestClass01();
	t.sumFunc();
	t.sumFunc(10);
	t.sumFunc(10, 20);
	t.sumFunc("�ȳ�", "�ϼ���");
	
	
	}
}
