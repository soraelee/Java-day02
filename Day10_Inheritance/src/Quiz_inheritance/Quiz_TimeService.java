package Quiz_inheritance;

import java.text.SimpleDateFormat;

public class Quiz_TimeService {
	/*
	 * �ð� ���� �� �������� ���
	 * �ð��� ����ϴ� ������ return�� ����Ͽ� main���� ���
	 */
	Quiz_TimeDTO dto = new Quiz_TimeDTO();
	SimpleDateFormat si = 
			new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
	
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
