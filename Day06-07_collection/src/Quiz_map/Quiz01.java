package Quiz_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, num2, pr;
		String me;
		boolean bool = true;
		
		
		HashMap<String, Integer> menu = new HashMap<>();
			
		while (bool) {
			System.out.println("1. �޴� ���");
			System.out.println("2. �޴��� ���� ����");
			System.out.println("3. ����");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				System.out.print("�޴� ��� : ");
				me = input.next();
				if (menu.containsKey(me)) {
					System.out.println("�����ϴ� �޴��Դϴ�.");
				}
				else {
					System.out.print("���� ��� : ");
					pr = input.nextInt();
					menu.put(me, pr);
					System.out.println("��ϵǾ����ϴ�.");
				}
				break;
				
			case 2:
				Set<String> menu_n = menu.keySet();
				Iterator<String> menu_it = menu_n.iterator();
				int i = 1;
				while (menu_it.hasNext()) { 
					String key = menu_it.next();
					System.out.println(i + ". " + key + " : " +  menu.get(key));
					i++;
				}
				
				System.out.println("1. ���� 2. ���� 3. ������");
				num2 = input.nextInt();
				switch (num2) {
				case 1:
					if (menu_n.size() == 0) {
						System.out.println("������ �޴��� �����ϴ�.");
					}
					else {
						System.out.println("� �޴��� �����Ͻðڽ��ϱ�?");
						me = input.next();
						if (menu.containsKey(me)) {
							System.out.println("���� ���Է����ּ���");
							System.out.print(">>> ");
							pr = input.nextInt();
							
							menu.put(me, pr);
						}
						else {
							System.out.println("���� �޴��Դϴ�.");
						}
					}
					break;
				case 2:
					if (menu_n.size() == 0) {
						System.out.println("������ �޴��� �����ϴ�.");
					}
					else {
						System.out.println("� �޴��� �����Ͻðڽ��ϱ�?");
						me = input.next();
						if (menu.containsKey(me)) {
							menu.remove(me);
							System.out.println("�����Ǿ����ϴ�.");
						}
						else {
							System.out.println("���� �޴��Դϴ�.");
						}
					}
					
					break;
				case 3:
					break;
					
				default :
					System.out.println("�ٽ� �Է��ϼ���.");
					break;
				}
				break;
				
			case 3:
				bool = false;
				break;
				
			default :
				System.out.println("�ٽ� �Է��ϼ���.");
				break;
				
				
			}
		}
		

	}

}
