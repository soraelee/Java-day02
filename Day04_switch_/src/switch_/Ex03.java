package switch_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		System.out.println("���ڿ� �Է�");
		str = input.next();
		
		switch(str ) {
		case "�ȳ�" : System.out.println("�ϼ���");break;
		case "�׷�": System.out.println("�ݰ���!");break;
		default : System.out.println("�� ���� ��");
		}
	}
}
