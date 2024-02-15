package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex02_wrapper_class {
	public static void main(String[] args) {
//		-- Wrapper Class
//		
//		primitive Type: (�ҹ���) �ڷ����� �ο��� �� ����
//		Wrapper Class : primitive Type�� �ڷ������μ� ����ϰԲ� ��ȯ����
		
		// �迭 Ȱ��
		ArrayList<Integer> arr = new ArrayList<>();
		
		Random r = new Random();
		
		for (int i = 0 ; i < 6 ; i++) {
			int num = r.nextInt(45) + 2; //1-45
			if (arr.contains(num) == false) { //�����ϸ� true
				arr.add(num);
			}
			System.out.println(arr.size());
		}
		System.out.println("�迭 Ȱ�� : " + arr);
		
		// set Ȱ��
		HashSet<Integer> set = new HashSet<>();
		
		for ( ; set.size() < 6 ; ) {
			int num = r.nextInt(45) + 2; //1-45
			set.add(num);
		}
		System.out.println("set Ȱ�� : " + set);
	}

}
