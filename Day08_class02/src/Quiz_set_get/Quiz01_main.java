package Quiz_set_get;

import java.util.Scanner;

public class Quiz01_main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz01_method q = new Quiz01_method();
		
		String name ;
		int age;
		
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("나이 입력 : ");
		age = input.nextInt();
		
		q.setName(name);
		q.setAge(age);
		q.ageCal();
		name = q.getName();
		age = q.getAge();
		
		System.out.println(name + "님의 나이는 " + age+ "살 입니다.");
		
	}
	

}
