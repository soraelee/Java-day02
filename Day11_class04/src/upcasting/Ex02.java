package upcasting;

class Parents {
	public void familyName() {
		System.out.print("��");
	}
	public void name() {
		familyName();
		System.out.println("����");
	}
}

class Daughter extends Parents {
	public void name() { //�������̵�
		familyName();
		System.out.println("����");
	}
}
class Son extends Parents {
	public void name() { //�������̵�
		familyName();
		System.out.println("�Ɽ");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		//		Parents par = new Parents();
		//		par.name();
		//		
		//		Daughter da = new Daughter();
		//		da.name();
		//		
		//		Son s = new Son();
		//		s.name();
		//		
		/*
		//�Ϲ� ���
		//1�� �ƺ� �̸�, 2�� ��, 3�� �Ƶ�

		Parents par = new Parents();
		Daughter da = new Daughter();
		Son s = new Son(); //�޸� ���� �߻� ����

		int num = 1;
		if (num == 1) {
			par.name();
		}else if(num ==2) {
			da.name();
		}else {
			s.name();
		}
		 */

		//upcasting ���
		//1�� �ƺ� �̸�, 2�� ��, 3�� �Ƶ�

		Parents par;
		//Daughter da;
		//Son s; 

		int num = 3;
		if (num == 1) {
			par = new Parents();
			par.name();
		}else if(num ==2) {
			par = new Daughter();
			par.name();
		}else {
			par = new Son();
			par.name();
		}

	}

}
