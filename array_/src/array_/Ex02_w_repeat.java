package array_;

public class Ex02_w_repeat {
	public static void main(String[] args) {
		double dos[] = new double[] {1.111, 2.222, 3.333}; //�ʱ�ȭ�� 0�� �ƴ� ����� ����
		System.out.println(dos[0]);
		
		System.out.println(dos.length); // ������ ���̸� ���� �Լ�
		
		for (int i = 0 ; i < 3 ; i++) {
			System.out.println(i + ". " + dos[i]);
		}
		
	}

}
