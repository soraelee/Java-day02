package Quiz_class;

public class Quiz01_main {
	public static void main(String[] args) {
//		��� ������ ������ ��� ���� ����� ǥ���Ͻÿ�
//		(�Է�, ���, ���� ������ ��ɺ��� ���弼��)

//		������ �Ųٷ� ���� ��ȯ�ϴ� �޼ҵ带 ������ ��ɺ��� ����ÿ�
		
//		�� ���� �Է� �޾� ū ���� ����ϴ� �Լ��� ����ÿ�
		Quiz01_method q1 = new Quiz01_method();
		int num1, num2, max;
		num1 = q1.scanF();
		num2 = q1.scanF();
		
		max = q1.q1_calF(num1, num2);
		
		q1.int_printF(max);
		
//		�Է� ���� ���� ¦������ Ȧ������ �Ǻ��ϴ� �Լ� ����
		num1 = q1.scanF();
		q1.str_printF(q1.q2_calF(num1));
		
//		3�� ����� �Ǻ��ϴ� �Լ��� ����� �� �Լ��� �̿��Ͽ� main���� 3�� ����� ���
		num1 = q1.scanF();
		q1.q3_calF(num1);
		
//		���� �Է� �޾� �Ҽ��� �Ǻ��ϴ� �Լ� ����
		num1 = q1.scanF();
		q1.str_printF(q1.q4_calF(num1));
		
//		���밪�� ���ϴ� �Լ��� �����Ͻÿ�
		num1 = q1.scanF();
		q1.int_printF(q1.q5_calF(num1));
		
		
	}

}
