package file.main;

import java.util.Scanner;

import file.service.ServiceMember;
import file.service.ServiceMemberImp1;

public class MainClass {
	public static void main(String[] args) {
		//�⺻Ʋ �ۼ�
		Scanner input = new Scanner(System.in);
		
		int num;
		ServiceMember member = new ServiceMemberImp1();
		
		while (true) {
			System.out.println("1. ȸ������");
			System.out.println("2. �˻�");
			System.out.println("3. ȸ�� ��� ����");
			System.out.println("4. Ż��");
			System.out.println("5. ����");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				member.register();
				break;
			case 2:
				member.search();
				break;
			case 3:
				member.list();
				break;
			case 4:
				member.delete();
				break;
			case 5:
				System.out.println("���α׷� ����");
				return;

			default:
				break;
			}
		}
	}
	

}
