package Quiz_array_;

import java.util.Scanner;

public class Quiz_team1 {
	public static void main(String[] args) {
//		1.arr = {"a","b","c","d","e"}; �� �������� �ٽ� �迭�� �����ϰ� ����ϼ���
//		arrayName.clone() �޼ҵ� �̿�

		String arr[] = new String[] {"a", "b", "c", "d", "e"};
		
		String[] brr = (String[])arr.clone();
		
		for (int i = (arr.length - 1) ; i >= 0 ; i--) {
			brr[brr.length - i - 1] = arr[i];
		}
		for (String b : brr)
			System.out.println(b);
		
//		2.�� ���� 5���� �����Ѵ�.
//		ó��
//		1.�̸��Է�
//		2.�����Է�
//		3.�������
//		4.����
//		�������ּ��� >>>
//		�̷��� ��� �� 
//		1.���� ������
//
//		1.��� �Է��Ͻðڽ��ϱ�?
//		2.�̸��� �����Ͻðڽ��ϱ�?
//		�������ּ��� >>>
//
//		���� ���� ��� ��
//		1���� �����ϸ� 1-5������ ����� �̸��� �Է��Ѵ�.
//		2���� �����ϸ� ���� ������ �ִ� �̸� ����Ʈ�� ��� ��
//		������ ��ȣ�� �� �� �̸��� �����ϵ��� �Ѵ�.
//
//		(��, Ǯ�� �� String�� �ڷ����� int�� ������ ��
//		����ϴ� �Լ��� Integer.parseInt(���ڿ�) ���
		
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		String name[] = new String[5];
		int kor[] = new int[5];
		int eng[] = new int[5];
		int math[] = new int[5];
		boolean bool = true;
		
		while (bool) {
			System.out.println("1.�̸��Է�");
			System.out.println("2.�����Է�");
			System.out.println("3.�������");
			System.out.println("4.����");
			System.out.print("�������ּ��� >>>");
			num1 = input.nextInt();
			
			switch (num1) {
			case 1:
				System.out.println("1.��� �Է��Ͻðڽ��ϱ�?");
				System.out.println("2.�̸��� �����Ͻðڽ��ϱ�?");
				num2 = input.nextInt();
				switch (num2) {
				case 1:
					for (int i = 0 ; i < name.length ; i++) {
						System.out.print(i + 1 + "�� �л� ���� : ");
						name[i] = input.next();
					}
					break;
				case 2:
					System.out.println("-----�л� ����Ʈ-----");
					int i = 1;
					for (String a : name) {
						System.out.println(i + ". " + a);
						i++;
					}
					System.out.println("� �л��� �����Ͻðڽ��ϱ�? (��ȣ �Է�)");
					int n = input.nextInt();
					System.out.print("���� : ");
					name[n-1] = input.next();
					break;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break;
				}
				break;
				
			case 2:
				System.out.println("1.��� �л��� ������ �Է��Ͻðڽ��ϱ�?");
				System.out.println("2.1���� �л��� ������ �����Ͻðڽ��ϱ�?");
				num2 = input.nextInt();
				switch (num2) {
				case 1:
					for (int i = 0 ; i < name.length ; i++) {
						System.out.print(i + 1 + "��° �л� : " + name[i] + "\n");
						System.out.print("���� ������ �Է����ּ��� : ");
						kor[i] = input.nextInt();
						if (kor[i] > 100 || kor[i] < 0) {
							boolean bool2 = true;
							while (bool2) {
								System.out.print("�ٽ� �Է����ּ��� : ");
								kor[i] = input.nextInt();
								if (kor[i] >= 0 && kor[i] <= 100)
									bool2 = false;
							}
						}
						
						
						System.out.print("���� ������ �Է����ּ��� : ");
						eng[i] = input.nextInt();
						if (eng[i] > 100 || eng[i] < 0) {
							boolean bool2 = true;
							while (bool2) {
								System.out.print("�ٽ� �Է����ּ��� : ");
								eng[i] = input.nextInt();
								if (eng[i] >= 0 && eng[i] <= 100)
									bool2 = false;
							}
						}
						
						System.out.print("���� ������ �Է����ּ��� : ");
						math[i] = input.nextInt();
						if (math[i] > 100 || math[i] < 0) {
							boolean bool2 = true;
							while (bool2) {
								System.out.print("�ٽ� �Է����ּ��� : ");
								math[i] = input.nextInt();
								if (math[i] >= 0 && math[i] <= 100)
									bool2 = false;
							}
						}
					}
				
					break;
				case 2:
					System.out.println("-----�л� ����Ʈ-----");
					int i = 1;
					for (String a : name) {
						System.out.println(i + ". " + a);
						i++;
					}
					System.out.println("� �л��� �����Ͻðڽ��ϱ�? (��ȣ �Է�)");
					System.out.print("���� : ");
					int n = input.nextInt();
					System.out.println("-----���� ����Ʈ-----");
					System.out.println("1. ����");
					System.out.println("2. ����");
					System.out.println("3. ����");
					System.out.println("� ������ �����Ͻðڽ��ϱ�? (��ȣ �Է�)");
					System.out.print("���� : ");
					int sub = input.nextInt();
					switch (sub) {
					case 1:
						System.out.print("���� ���� : ");
						kor[n-1] = input.nextInt();
						break;
					case 2:
						System.out.print("���� ���� : ");
						eng[n-1] = input.nextInt();
						break;
					case 3:
						System.out.print("���� ���� : ");
						math[n-1] = input.nextInt();
						break;
					default :
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						break;
					}
				
					break;
				}
				case 3:
					System.out.println("-----���� ���-----");
					for (int j = 0 ; j < name.length ; j++) {
						System.out.println(j + 1 + ". �̸� : " + name[j]);
						System.out.println("���� : ����-" + kor[j] + "/����-" + eng[j] + "/����-" + math[j]);
					}
					break;
				case 4:
					System.out.println("����Ǿ����ϴ�.");
					bool = false;
					break;
				default:
					System.out.println("�߸� �Էµ� ��ȣ �Դϴ�.");
					break;
				
			}
		}
		
		
//		3.
//		����1)
//		���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ� �������� �迭 �ε����� ���� ��
//		�� ���� ����ϼ���
//		ex
//		10 9 8 7 6 5 4 3 2 1
		
		int crr[] = new int[10] ;
		
		for (int i = 0 ; i < crr.length ; i++) {
			crr[i] = crr.length - i;
		}
		for (int i = 0 ; i < crr.length ; i++) {
			System.out.println(i + "�� �ε��� �� : " + crr[i]);
		}
		
		
		
	}

}
