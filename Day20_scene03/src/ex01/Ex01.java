package ex01;

import ex01.AAA.Data;

class AAA{
	public void test() { System.out.println("AAAtest");}
	
	//inner class
	//Ŭ���� �ȿ� �Ǵٸ� Ŭ���� ����
	static class Data {
		public Data	(String str, int num) {
			System.out.println("������ ����");
		}
		public void test() {
			System.out.println("Data test ȣ��");
		}
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.test();
		
		//��ü ���� ��
		Data d = new AAA.Data("ssss", 10);
		d.test();
	}
	

}
