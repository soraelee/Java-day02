package list;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
		//contains
		System.out.println(arr.contains("222"));
		System.out.println(arr.contains("���� ��"));
		
		//bool �� ����
		boolean bool = arr.contains("1234");
		if (bool) {
			System.out.println("�Է��� �� �����մϴ�. ");
		}
		else {
			System.out.println("�������� �ʴ� ��, �ٽ� �Է�");
		}
		
		//remove
		System.out.println("���� �� arr : " + arr );
		System.out.println("���� �� size : "+ arr.size());
		
		arr.remove(1) ; //index �������� ����
		System.out.println("���� �� arr : " + arr);
		System.out.println("���� �� size : " + arr.size());
		
		arr.remove("111") ; //������ �������� ����
		System.out.println("���� �� arr : " + arr);
		System.out.println("���� �� size : " + arr.size());
		
		System.out.println("arr 0�� �ε��� : " + arr.get(0));
		
	}
}
