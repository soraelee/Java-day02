package member.main;

import java.util.Scanner;

import member.service.Service;
import member.service.ServiceImp1;
import member.service.ServiceImp2;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Service sv1 = new ServiceImp1();
		Service sv2 = new ServiceImp2();
		
		// ȸ������ ���α׷�
		// 1. �� ���� Ȯ��
		// 1) ���� ���
		// 2) �� �˻�
		// 3) ��ü ���
		// 4) ���ɴ� �� ���
		// 5) ������

		// 2. �� ���
		// 1) ���
		// 2) ����
		// 3) ����
		// 4) ������

		while (true) {
			System.out.println("ȸ������ ���α׷�");
			System.out.println("1. �� ���� Ȯ��");
			System.out.println("2. �� ���");
			System.out.print(">>> ");
			int num = input.nextInt();
			
			switch (num) {
			case 1:
				sv2.checkService();
				break;
			case 2:
				sv1.registerService();
				break;

			default:
				break;
			}
		}
		
		
		
		
	}

}
