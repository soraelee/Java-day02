package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 3 ; i++) {
			System.out.println(i + 1 + "���� �޴� ���");
			//String menu = input.next();
			arr.add(input.next());
		}
		
		System.out.println("====��ϵ� �޴�====");
		System.out.println(arr);
		
		System.out.println("========");
		System.out.println("������ �޴� �Է�");
		String search = input.next();
		
		System.out.println(arr.contains(search)); //�����ϴ°�?
		System.out.println(arr.indexOf(search));
		System.out.println("------------------");
		
		int index = arr.indexOf(search); // �ش� ���� �ε����� �˷���
		if (index != -1) { //�ش� �޴��� �����Ѵ�
			System.out.println("������ �̸� �Է�");
			String change = input.next();
			System.out.println(arr.get(index) + " => " + change);
			arr.set(index, change); //�ش� �ε����� ���� ����
			System.out.println("���� �� arr : " + arr);
		}
		else { //�������� �ʴ� �޴�
			System.out.println("�������� �ʴ� �޴� ���� �Ұ�");
		}
	}

}
