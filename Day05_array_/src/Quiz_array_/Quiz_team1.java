package Quiz_array_;

import java.util.Scanner;

public class Quiz_team1 {
	public static void main(String[] args) {
//		1.arr = {"a","b","c","d","e"}; 를 역순으로 다시 배열에 저장하고 출력하세요
//		arrayName.clone() 메소드 이용

		String arr[] = new String[] {"a", "b", "c", "d", "e"};
		
		String[] brr = (String[])arr.clone();
		
		for (int i = (arr.length - 1) ; i >= 0 ; i--) {
			brr[brr.length - i - 1] = arr[i];
		}
		for (String b : brr)
			System.out.println(b);
		
//		2.한 반은 5명이 존재한다.
//		처음
//		1.이름입력
//		2.성적입력
//		3.성적출력
//		4.종료
//		선택해주세요 >>>
//		이렇게 출력 후 
//		1.번을 누르면
//
//		1.모두 입력하시겠습니까?
//		2.이름을 수정하시겠습니까?
//		선택해주세요 >>>
//
//		위와 같이 출력 후
//		1번을 선택하면 1-5번까지 모두의 이름을 입력한다.
//		2번을 선택하면 현재 가지고 있는 이름 리스트를 출력 후
//		수정할 번호를 고른 후 이름을 변경하도록 한다.
//
//		(단, 풀이 시 String의 자료형을 int로 변경할 때
//		사용하는 함수인 Integer.parseInt(문자열) 사용
		
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		String name[] = new String[5];
		int kor[] = new int[5];
		int eng[] = new int[5];
		int math[] = new int[5];
		boolean bool = true;
		
		while (bool) {
			System.out.println("1.이름입력");
			System.out.println("2.성적입력");
			System.out.println("3.성적출력");
			System.out.println("4.종료");
			System.out.print("선택해주세요 >>>");
			num1 = input.nextInt();
			
			switch (num1) {
			case 1:
				System.out.println("1.모두 입력하시겠습니까?");
				System.out.println("2.이름을 수정하시겠습니까?");
				num2 = input.nextInt();
				switch (num2) {
				case 1:
					for (int i = 0 ; i < name.length ; i++) {
						System.out.print(i + 1 + "번 학생 성함 : ");
						name[i] = input.next();
					}
					break;
				case 2:
					System.out.println("-----학생 리스트-----");
					int i = 1;
					for (String a : name) {
						System.out.println(i + ". " + a);
						i++;
					}
					System.out.println("어떤 학생을 수정하시겠습니까? (번호 입력)");
					int n = input.nextInt();
					System.out.print("변경 : ");
					name[n-1] = input.next();
					break;
				default :
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				break;
				
			case 2:
				System.out.println("1.모든 학생의 성적을 입력하시겠습니까?");
				System.out.println("2.1명의 학생의 성적을 수정하시겠습니까?");
				num2 = input.nextInt();
				switch (num2) {
				case 1:
					for (int i = 0 ; i < name.length ; i++) {
						System.out.print(i + 1 + "번째 학생 : " + name[i] + "\n");
						System.out.print("국어 점수를 입력해주세요 : ");
						kor[i] = input.nextInt();
						if (kor[i] > 100 || kor[i] < 0) {
							boolean bool2 = true;
							while (bool2) {
								System.out.print("다시 입력해주세요 : ");
								kor[i] = input.nextInt();
								if (kor[i] >= 0 && kor[i] <= 100)
									bool2 = false;
							}
						}
						
						
						System.out.print("영어 점수를 입력해주세요 : ");
						eng[i] = input.nextInt();
						if (eng[i] > 100 || eng[i] < 0) {
							boolean bool2 = true;
							while (bool2) {
								System.out.print("다시 입력해주세요 : ");
								eng[i] = input.nextInt();
								if (eng[i] >= 0 && eng[i] <= 100)
									bool2 = false;
							}
						}
						
						System.out.print("수학 점수를 입력해주세요 : ");
						math[i] = input.nextInt();
						if (math[i] > 100 || math[i] < 0) {
							boolean bool2 = true;
							while (bool2) {
								System.out.print("다시 입력해주세요 : ");
								math[i] = input.nextInt();
								if (math[i] >= 0 && math[i] <= 100)
									bool2 = false;
							}
						}
					}
				
					break;
				case 2:
					System.out.println("-----학생 리스트-----");
					int i = 1;
					for (String a : name) {
						System.out.println(i + ". " + a);
						i++;
					}
					System.out.println("어떤 학생을 수정하시겠습니까? (번호 입력)");
					System.out.print("변경 : ");
					int n = input.nextInt();
					System.out.println("-----과목 리스트-----");
					System.out.println("1. 국어");
					System.out.println("2. 영어");
					System.out.println("3. 수학");
					System.out.println("어떤 과목을 수정하시겠습니까? (번호 입력)");
					System.out.print("변경 : ");
					int sub = input.nextInt();
					switch (sub) {
					case 1:
						System.out.print("국어 성적 : ");
						kor[n-1] = input.nextInt();
						break;
					case 2:
						System.out.print("영어 성적 : ");
						eng[n-1] = input.nextInt();
						break;
					case 3:
						System.out.print("수학 성적 : ");
						math[n-1] = input.nextInt();
						break;
					default :
						System.out.println("잘못 입력하셨습니다.");
						break;
					}
				
					break;
				}
				case 3:
					System.out.println("-----성적 출력-----");
					for (int j = 0 ; j < name.length ; j++) {
						System.out.println(j + 1 + ". 이름 : " + name[j]);
						System.out.println("성적 : 국어-" + kor[j] + "/영어-" + eng[j] + "/수학-" + math[j]);
					}
					break;
				case 4:
					System.out.println("종료되었습니다.");
					bool = false;
					break;
				default:
					System.out.println("잘못 입력된 번호 입니다.");
					break;
				
			}
		}
		
		
//		3.
//		문제1)
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후
//		그 값을 출력하세요
//		ex
//		10 9 8 7 6 5 4 3 2 1
		
		int crr[] = new int[10] ;
		
		for (int i = 0 ; i < crr.length ; i++) {
			crr[i] = crr.length - i;
		}
		for (int i = 0 ; i < crr.length ; i++) {
			System.out.println(i + "번 인덱스 값 : " + crr[i]);
		}
		
		
		
	}

}
