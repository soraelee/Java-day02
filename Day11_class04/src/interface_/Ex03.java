package interface_;
class A���� { 
	public void ����() {
		System.out.println("������ �����մϴ�");
	}
	public void ���() {
		System.out.println("������ ����մϴ�");
	}
}
class B���� {
	public void attack() {
		System.out.println("����Ⱑ �����մϴ�");
	}
	public void defense() {
		System.out.println("����Ⱑ ����մϴ�");
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		A���� a = new A����();
		B���� b = new B����();
		
		a.����();
		b.defense();
		//���ݰ� ��� �߻�
	}

}
