package Quiz_time;

import java.text.SimpleDateFormat;
//import java.util.Scanner;

public class TimeService {
	/*
	 * �ð� ���� �� �������� ���
	 * �ð��� ����ϴ� ������ return�� ����Ͽ� main���� ���
	 */
//	Scanner input = new Scanner(System.in);
	TimeDTO dto = new TimeDTO();
	SimpleDateFormat si = 
			new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
	
//	public void TimeServe() {
//		System.out.println("1. ���� �ð� ����");
//		System.out.println("2. ���� �ð� Ȯ��");
//		System.out.println("3. ����ð� ����");
//		System.out.println("4. ���� �ð� Ȯ��");
//		System.out.println("5. ��� �ð� ��������");
//		System.out.print(">>> ");
//		int num = input.nextInt();
//			
//		switch (num) {
//		case 1:
//			startSet();
//			break;
//		case 2:
//			startcheck();
//			break;
//			
//		case 3:
//			endSet();
//			break;
//		case 4:
//			endcheck();
//			break;
//		case 5:
//			useTime();
//			break;
//		default:
//			System.out.println("�߸� �Էµ� ����");
//				break;	
//		}
//		
//	}
	public void startSet() { //1. ���۽ð� ����
		dto.setStart(System.currentTimeMillis());
	}
	public String startcheck() { //2. ���۽ð� Ȯ��
		String st = si.format(dto.getStart());
		return st;
	}
	public void endSet() { //3.����ð� ����
		dto.setEnd(System.currentTimeMillis());
		dto.setTotal((dto.getEnd() - dto.getStart()) / 1000);
	}
	public String endcheck() { //4. ����ð� Ȯ��
		
		String end = si.format(dto.getEnd());
		return end;
	}
	public String useTime() {
		long total = dto.getTotal();
		
		int m = (int)total / 60;
		int s = (int)total % 60;
		
//		System.out.println("��� �ð� : " 
//				+ m + "�� " + s + "��");
		
		return  m + "�� " + s + "��";
	}
	

}
