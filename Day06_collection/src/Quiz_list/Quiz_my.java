package Quiz_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_my {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> name = new ArrayList<>();
		
		ArrayList<String> num = new ArrayList<>();
		
		String na, nu;
		boolean bool = true;
		
		while (bool) {
			System.out.println("1. ����ó ���");
			System.out.println("2. ����ó ����");
			System.out.println("3. ����ó ����");
			System.out.println("4. ��� ����ó ����");
			System.out.println("5. ����");
			
			int n = input.nextInt();
			
			switch (n) {
			case 1:
				System.out.print("����� �̸��� �Է��ϼ��� : ");
				na = input.next();
				// �̸��� �ߺ����� ���� ��� ����
				if (name.indexOf(na) == -1) {
					name.add(na) ; 
					System.out.print("����� ��ȣ�� �Է��ϼ��� : ");
					nu = input.next();
					num.add(nu);
					System.out.println("�̸� : " + na);
					System.out.println("��ȣ : " + nu);
				}
				else {
					System.out.println("�ߺ��� �̸��� �ֽ��ϴ�. ");
				}
				break;

			case 2:
				System.out.println("������ ����ó�� Ȯ���Ͻðڽ��ϱ�?");
				System.out.println("-------�̸� ���--------");
				for (int i = 0 ; i < name.size() ; i++) {
					System.out.println(name.get(i));
				}
				na = input.next();
				
				if (name.indexOf(na) == -1) {
					System.out.println("��Ͽ� �����ϴ�.");
					
				}
				else {
					System.out.println(na + "�� ����ó�� " + num.get(name.indexOf(na)) + "�Դϴ�.");
				}
				break;
				
			case 3:
				System.out.println("-----�̸� ���-----");
				for (int i = 0 ; i < name.size() ; i++) {
					System.out.println(name.get(i));
				}
				System.out.println("������ ����ó�� �̸��� �ۼ��ϼ���.");
				na = input.next();
				
				if (name.indexOf(na) == -1) {
					System.out.println("���� ����ó �Դϴ�.");
				}
				else {
					num.remove(name.indexOf(na));
					name.remove(na);
					System.out.println("-----����ó ���-----");
					for (int i = 0 ; i < name.size() ; i++) {
						System.out.println(name.get(i) + " : \t" + num.get(i));
						}
					}
				break;
				
			case 4:
				System.out.println("-----����ó ���-----");
				for (int i = 0 ; i < name.size() ; i++) {
					System.out.println(name.get(i) + " : \t" + num.get(i));
					}
				
				break;
			case 5:
				bool = false;
				break;
				
			default:
				System.out.println("�ٸ� ��ȣ�� �Է����ּ���");
				break;

			
			}
			
		}
		
	
	
	}
}
