package this_;

class Test01 {
	public int num = 12345;
	public void test() {
		int num = 33300;
		System.out.println("this : " + this ); //�޼ҵ带 ����� this��� ������ �ڵ� ����
		System.out.println("this : " + this.num ); //�ڱ��ڽ��� ����
		System.out.println("num : " + num);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		
		System.out.println("main : " + t);
		System.out.println("main num : " + t.num);
		
		t.test();
	}

}
