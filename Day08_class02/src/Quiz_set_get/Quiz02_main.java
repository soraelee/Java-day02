package Quiz_set_get;

public class Quiz02_main {
	public static void main(String[] args) {
		int k = 100, e = 90, m = 80;
		//��ü ���� �� ������ ��(kor, eng, math, sum, avg)����
		//����ϼ��� >> ����������
		
		Quiz02_method q = new Quiz02_method();
		
		q.setKor(k);
		q.setEng(e);
		q.setMath(m);
		q.setSum(k + e + m) ;
		q.setAvg(q.getSum() / 3.0);
		
		System.out.println("���� : " + q.getKor());
		System.out.println("���� : " + q.getEng());
		System.out.println("���� : " + q.getMath());
		System.out.println("�հ� : " + q.getSum());
		System.out.println("��� : " + q.getAvg());
		
		
		
	}

}
