package interface_;

public class Singleton07 {
	private static TestInt07 t ; //2) �������̽��� static���� �ҷ�����
	private Singleton07() {} //1) �����ڸ� �����
											//3) �̱��� ���� => �������̽��� ��ü�����޼ҵ�� �ҷ����� ���� getinstanceȭ ��
	public static TestInt07 getInstance() { //getInstance(): new�� ���� ��ü�� ��� �������� ���ϰ� ����
											//				 �̱��濡�� �����ϰ� �ܺο��� ��ü�� ��� ���
											//				 ���ʿ� �Ҵ�� �ϳ��� �޸𸮸� ��� ���� ���
		if(t == null) {
			t = new TestClass07_1(); //��ü => ��� �� ������
		}
		return t; //�������̽��� ���� �� ū ���� ���� �̱��濡�� �ش� ��ü�� �ҷ����� Ŭ������ �����ϸ� ��ü������ ��ü �� 
	}


}
