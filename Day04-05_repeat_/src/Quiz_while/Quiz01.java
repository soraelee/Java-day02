package Quiz_while;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;
		String id, pw, id_new = null, pw_new = null;
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.print(">>> ");
			num = input.nextInt();

			if (num == 1) {
				if (id_new == null) {
					System.out.println("회원가입 하세요");
				}

				else {
					for (int i = 5 ; i > 0 ; i--) {
						System.out.print("아이디 입력 : ");
						id = input.next();
						System.out.print("비밀번호 입력 : ");
						pw = input.next();

						if (id.equals(id_new) && pw.equals(pw_new)) {
							System.out.println("로그인 완료");
							break;
						}
						else if (pw.equals(pw_new) == false) {
							System.out.println("비밀번호를 다시 입력하세요");
							System.out.print("비밀번호 입력 : ");
							pw = input.next();

							if (id.equals(id_new) && pw.equals(pw_new)) {
								System.out.println("로그인 완료");
								break;
							}
							else {
								System.out.println(i + "번의 기회가 남았습니다.");
								continue;
							}
						}
						else if (id.equals(id_new) == false) {
							System.out.println("아이디를 다시 입력하세요");
							System.out.print("아이디 입력 : ");
							id = input.next();

							if (id.equals(id_new) && pw.equals(pw_new)) {
								System.out.println("로그인 완료");
								break;
							}
							else {
								System.out.println(i + "번의 기회가 남았습니다.");
								continue;
							}
						}
						else {
							System.out.println("인증 실패");
						}
					}
				}
			}
			else if (num == 2) {
				System.out.print("저장할 아이디 입력 : ");
				id_new = input.next();
				System.out.print("저장할 비밀번호 입력 : ");
				pw_new = input.next();

			}
			else 
				break;

		}
	}

}
