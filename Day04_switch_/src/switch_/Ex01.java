package switch_;

public class Ex01 {
	public static void main(String[] args) {
		int select = 1;
		
		switch(select) {
		case 1 : System.out.println("1 �Է�");//break;
		case 2 : System.out.println("2 �Է�");//break;
		default : System.out.println("1, 2 ������ ��");//break;
		
		}
		System.out.println("���� ���� ����");
		
		
		
		if (select == 1) {
			System.out.println(1111);
		}
		else if (select == 2) {
			System.out.println(2222);
		}
		else
			System.out.println("�� ���� ��");
	}
}
