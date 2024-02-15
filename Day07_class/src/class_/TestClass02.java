package class_;

import java.util.Scanner;

public class TestClass02 {
	//중복되는 코드를 method로 뺌
	public int inputTest() {
		Scanner input= new Scanner(System.in);
		
		System.out.println("수 입력"); 
		return input.nextInt();
		
	}

}
