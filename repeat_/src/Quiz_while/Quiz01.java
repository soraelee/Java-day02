package Quiz_while;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;
		String id, pw, id_new = null, pw_new = null;
		while(true) {
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ������");
			System.out.print(">>> ");
			num = input.nextInt();

			if (num == 1) {
				if (id_new == null) {
					System.out.println("ȸ������ �ϼ���");
				}

				else {
					for (int i = 5 ; i > 0 ; i--) {
						System.out.print("���̵� �Է� : ");
						id = input.next();
						System.out.print("��й�ȣ �Է� : ");
						pw = input.next();

						if (id.equals(id_new) && pw.equals(pw_new)) {
							System.out.println("�α��� �Ϸ�");
							break;
						}
						else if (pw.equals(pw_new) == false) {
							System.out.println("��й�ȣ�� �ٽ� �Է��ϼ���");
							System.out.print("��й�ȣ �Է� : ");
							pw = input.next();

							if (id.equals(id_new) && pw.equals(pw_new)) {
								System.out.println("�α��� �Ϸ�");
								break;
							}
							else {
								System.out.println(i + "���� ��ȸ�� ���ҽ��ϴ�.");
								continue;
							}
						}
						else if (id.equals(id_new) == false) {
							System.out.println("���̵� �ٽ� �Է��ϼ���");
							System.out.print("���̵� �Է� : ");
							id = input.next();

							if (id.equals(id_new) && pw.equals(pw_new)) {
								System.out.println("�α��� �Ϸ�");
								break;
							}
							else {
								System.out.println(i + "���� ��ȸ�� ���ҽ��ϴ�.");
								continue;
							}
						}
						else {
							System.out.println("���� ����");
						}
					}
				}
			}
			else if (num == 2) {
				System.out.print("������ ���̵� �Է� : ");
				id_new = input.next();
				System.out.print("������ ��й�ȣ �Է� : ");
				pw_new = input.next();

			}
			else 
				break;

		}
	}

}
