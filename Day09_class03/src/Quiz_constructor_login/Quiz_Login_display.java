package Quiz_constructor_login;

import java.util.Scanner;

import Quiz_time.TimeService;

public class Quiz_Login_display{
	Scanner input = new Scanner(System.in);
	
	private String scid, scpwd;
	private int num ;
	Quiz_Login_DTO d = new Quiz_Login_DTO() ;
	//Quiz_Login_DTO dt = new Quiz_Login_DTO(scid, scpwd) ;
	
	public void display() {
		
		while(true) {
			inputData();
			
			switch (num) {
			case 1: // �α���
				login();
				break;
				
			case 2: //ȸ������
				register();
				break;
			case 3:
				memberExit();
				break;
			}
		}
	}
	public void inputData() {
		System.out.println("1. �α���");
		System.out.println("2. ȸ������");
		System.out.println("3. Ż��");
		System.out.print(">>> ");
		num = input.nextInt();
		
	}
	public void memberExit() {
		if (d.getId() == null && d.getPwd() == null) {
			System.out.println("���Ե� ������ �����ϴ�.");
		}
		else {
			d.setId(null);
			d.setPwd(null);
			System.out.println("Ż�� ���������� ó���Ǿ����ϴ�.");
		}
	}
	public void register() {
		if (d.getId() == null && d.getPwd() == null) {
			System.out.print("����� ID �Է� : ");
			scid = input.next();
			d.setId(scid);
			
			System.out.print("����� PW �Է� : ");
			scpwd = input.next();
			d.setPwd(scpwd);
		}
		else {
			System.out.println("����ڰ� �����մϴ�. Ż�� �� �����ϼ���");
		}
	}
	public void login() {
		System.out.print("ID : ");
		scid = input.next();
		System.out.print("PW : ");
		scpwd = input.next();
		
		if (d.getId() == null && d.getPwd() == null) {
			System.out.println("ȸ�������� �����ϼ���");
		}
		else if (!scid.equals(d.getId()) && scpwd.equals(d.getPwd())) {
			System.out.println("�������� �ʴ� id�Դϴ�.");
		}
		else if (!scpwd.equals(d.getPwd()))
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		else 
			System.out.println("���� ���");
	}

}
