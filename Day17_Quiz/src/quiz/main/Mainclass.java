package quiz.main;

import java.util.Scanner;

import quiz.service.MemberService;
import quiz.service.MemberServicrImpl;

public class Mainclass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberService ms = new MemberServicrImpl();
		int num;
		
		while(true) {
			System.out.println("------ȸ������------");
			System.out.println("1. ȸ�� ���");
			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ����");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				ms.memberList();
				break;
			case 2:
				ms.memberSearch();
				break;
			case 3:
				ms.memberRegist();
				break;
			case 4:
				ms.memberDel();
				break;
			case 5:
				System.out.println("�ý����� �����մϴ�.");
				return;
			}
		}
	}

}
