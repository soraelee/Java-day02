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
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				System.out.print("메뉴 등록 : ");
				me = input.next();
				if (menu.containsKey(me)) {
					System.out.println("존재하는 메뉴입니다.");
				}
				else {
					System.out.print("가격 등록 : ");
					pr = input.nextInt();
					menu.put(me, pr);
					System.out.println("등록되었습니다.");
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
				
				System.out.println("1. 수정 2. 삭제 3. 나가기");
				num2 = input.nextInt();
				switch (num2) {
				case 1:
					if (menu_n.size() == 0) {
						System.out.println("수정할 메뉴가 없습니다.");
					}
					else {
						System.out.println("어떤 메뉴를 수정하시겠습니까?");
						me = input.next();
						if (menu.containsKey(me)) {
							System.out.println("가격 재입력해주세요");
							System.out.print(">>> ");
							pr = input.nextInt();
							
							menu.put(me, pr);
						}
						else {
							System.out.println("없는 메뉴입니다.");
						}
					}
					break;
				case 2:
					if (menu_n.size() == 0) {
						System.out.println("수정할 메뉴가 없습니다.");
					}
					else {
						System.out.println("어떤 메뉴를 삭제하시겠습니까?");
						me = input.next();
						if (menu.containsKey(me)) {
							menu.remove(me);
							System.out.println("삭제되었습니다.");
						}
						else {
							System.out.println("없는 메뉴입니다.");
						}
					}
					
					break;
				case 3:
					break;
					
				default :
					System.out.println("다시 입력하세요.");
					break;
				}
				break;
				
			case 3:
				bool = false;
				break;
				
			default :
				System.out.println("다시 입력하세요.");
				break;
				
				
			}
		}
		

	}

}
