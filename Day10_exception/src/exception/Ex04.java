package exception;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		try {
			int n1 = 10, n2 = 0;
			System.out.println(n1 / n2);
			
			ArrayList<String> arr = new ArrayList<>();

			arr.add("111"); // 0
			arr.add("222"); // 1
			arr.add("333"); // 2

			for (int i = 0 ; i <= arr.size() ; i++) {
				System.out.println(arr.get(i));
			}
		}catch (Exception e ) {  //�ϳ��� method 
//			System.out.println("���� �߻� : " + e);
			e.printStackTrace(); //� �������� �������
		}
		System.out.println("���� ����� �̾ ����!!!");
	}
}

