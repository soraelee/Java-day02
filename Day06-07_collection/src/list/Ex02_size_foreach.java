package list;

import java.util.ArrayList;

public class Ex02_size_foreach {
	public static void main(String[] args) {
		//����Ʈ�� ������
		ArrayList<String> arr = new ArrayList<>();
		
		System.out.println("���� �� size : " + arr.size());
		arr.add("111");
		arr.add("222");
		arr.add("333");
		System.out.println("���� �� size : " + arr.size());
		
		//�ݺ��� Ȱ��
		for (int i = 0 ; i < arr.size() ; i++ ) {
			String s = arr.get(i) ;
			System.out.println(i + ". " + s);
		}
		
		//��for each�� ���
		System.out.println("---for each---");
		//["111", "222", "333"]���·� ����
		for (String a : arr) {
			System.out.println(a);
			
		}
		
		
	}

}
