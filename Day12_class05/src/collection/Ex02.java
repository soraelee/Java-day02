package collection;

import java.util.ArrayList;
import java.util.Scanner;

class Dto02 {
	private String name, id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Dto02> arr = new ArrayList<>();
		
		String id, name;
		
		while(true) {
			System.out.println("1. ����");
			System.out.println("2. ��� ���� Ȯ��");
			int num = input.nextInt();
			switch (num) {
			case 1 :
				Dto02 d = new Dto02();
				
				System.out.println("���̵� �Է�");
				id = input.next();
				d.setId(id); //�ٷ� �Է��ؼ� ����
				
				System.out.println("�̸� �Է�");
				name = input.next();
				d.setName(name);
				
				arr.add(d);
				
				break;
			case 2 :
				System.out.println("-----��� ���� ���------");
				for (Dto02 dd : arr) {
					System.out.println("���̵� : " + dd.getId());
					System.out.println("�̸� : " + dd.getName());
					System.out.println("----------------------");
				}
				
			}
		}
	}
}
