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
			case 1: // 로그인
				login();
				break;
				
			case 2: //회원가입
				register();
				break;
			case 3:
				memberExit();
				break;
			}
		}
	}
	public void inputData() {
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 탈퇴");
		System.out.print(">>> ");
		num = input.nextInt();
		
	}
	public void memberExit() {
		if (d.getId() == null && d.getPwd() == null) {
			System.out.println("가입된 정보가 없습니다.");
		}
		else {
			d.setId(null);
			d.setPwd(null);
			System.out.println("탈퇴가 정상적으로 처리되었습니다.");
		}
	}
	public void register() {
		if (d.getId() == null && d.getPwd() == null) {
			System.out.print("등록할 ID 입력 : ");
			scid = input.next();
			d.setId(scid);
			
			System.out.print("등록할 PW 입력 : ");
			scpwd = input.next();
			d.setPwd(scpwd);
		}
		else {
			System.out.println("사용자가 존재합니다. 탈퇴 후 진행하세요");
		}
	}
	public void login() {
		System.out.print("ID : ");
		scid = input.next();
		System.out.print("PW : ");
		scpwd = input.next();
		
		if (d.getId() == null && d.getPwd() == null) {
			System.out.println("회원가입을 진행하세요");
		}
		else if (!scid.equals(d.getId()) && scpwd.equals(d.getPwd())) {
			System.out.println("존재하지 않는 id입니다.");
		}
		else if (!scpwd.equals(d.getPwd()))
			System.out.println("비밀번호가 틀렸습니다.");
		else 
			System.out.println("인증 통과");
	}

}
