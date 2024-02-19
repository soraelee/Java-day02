package etc;

import java.util.Date;

public class SleepClass01 {

	public static void main(String[] args) {
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(i + " : " + new Date());
			try { //����ó�� => sleap ���� �� �ݵ�� �ʿ�
				Thread.sleep(500); //0.5�� ��ٸ�����
			} catch (InterruptedException e) {
				e.printStackTrace(); 
			}
		}
		
		System.out.println("����");
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(3000);
			
		} catch (Exception e) {}
		long end = System.currentTimeMillis();
		System.out.println("����");
		System.out.println("��� �ð� : " + (end - start) / 1000);
	}
}
