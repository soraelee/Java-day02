package constructor;

class TestClass02 {
	private String officeName;
//	public TestClass02(String officeName) {
//		this.officeName = officeName;
//		System.out.println("������ ����");
//	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		String name = "���� ȸ��" ;
		TestClass02 t = new TestClass02();
		
		t.setOfficeName(name); //�����ڵ� �ϳ��� ��ü  -> ���� �޾Ƽ� ó��
		System.out.println(t.getOfficeName());
		
	}
}
