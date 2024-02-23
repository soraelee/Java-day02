package quiz.main;

import java.util.Scanner;

import quiz.service.MemberService;
import quiz.service.MemberServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		//ȸ�� ���� �ý���
		//1. ȸ�� ���
		//2. ȸ�� ���� ���
		//1) �Ϻ� ȸ��
		//2) ���̺� ȸ��
		//3) ���� ���� �� ȸ��
		//3. ȸ�� �˻�
		//4. ȸ�� ����
		
		Scanner input = new Scanner(System.in);
		MemberService member = new MemberServiceImpl();
		
		while (true) {
			System.out.println("1. ȸ�� ���");
			System.out.println("2. ȸ�� ���� ���");
			System.out.println("3. ���� ���� �� ȸ��");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ������");
			System.out.print(">>> ");
			int num = input.nextInt();
			
			switch (num) {
			case 1:
				member.register();
				break;
			case 2:
				member.list();
				break;
			case 3:
				member.paylist();
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				break;
			}
			
			
			
		}
	}

}
