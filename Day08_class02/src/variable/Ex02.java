package variable;

class Test02{
	public int num ; 
	
	public void test1() {
		num = 100;
		System.out.println("test1 : "+ num);
	}
	public void test2() {
		System.out.println("test2 : "+ num);
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02(); 
		
		t.test1();
		t.test2();
	}
}

//1) ��ü ������ t�ȿ� ��� method�� �Բ� ���� �¾
//num ������ test1, test2��� �̸��� �˰� ����
//method ȣ�� �� �ش� test1 ���� ���������� ����, ����� �����
//�ν��Ͻ� ������ ��ü�� main���� ��� �Ǵ� ���� ��� ���� ��
// ���ʿ��� ������ ��� ������
//Ư�� �������� ����ϰ��� �� �� ���� ���� ����ϱ�
