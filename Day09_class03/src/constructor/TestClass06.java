package constructor;

public class TestClass06 {
	private TestDTO t; //�ν��Ͻ� ������ ����Ͽ� ��� �޼ҵ忡�� ����� �� �ֵ��� ��
	public void display() { //���ο����� ������ �ʿ��� ��� -> private�� ����
		System.out.println("1. �����մϴ�");
		//�����ϴ� ��������DTO�� ���� ����
		saveData();
		System.out.println("2. ����մϴ�");
		printData();
	}
	public void saveData() {
		String name = "ȫ�浿";
		String addr = "���¥��";
		
		t = new TestDTO(name, addr);//�����ڸ� ���� ����
		//t.setName(name);t.setAddr(addr);//setter�� ���� ����
		
		System.out.println("����Ϸ�");
	}
	public void printData() {
		System.out.println("�̸� : " + t.getName());
		System.out.println("�ּ� : " + t.getAddr());
	}
}
