package interface_;

interface A01 {
	public void test1(); //�������� �ڵ带 ������ ���� {}����ϴ� ���� ���� �߻�
	
}

interface B01 {
	public void test1();
}

class Class01 {}
class Class02 {}
public class Ex01 extends Class01 implements A01, B01{//Ŭ������ �ϳ��� ��� ����
													  //�������̽��� ���� ��� ����

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	} 

}
