package if_;

import java.util.Scanner;

public class Quiz04_my {
	public static void main(String[] args) {
		// 600kg을 담을 수 있는 컨테이너에 물건을 모두 실으려고 한다. 
		// A가 세 물건을 실을 때, 세 물건의 무게를 입력 받고
		// 세 물건의 무게 총합과 남은 무게, "가장 무거운 물건은 ~kg입니다"를 출력하시오
		// 600kg 초과될 경우 "무게가 600kg를 초과하였습니다. ~kg을 제외하시오" 메세지를 출력하시오
		
		
		Scanner input = new Scanner(System.in);
		int w1 = 0, w2 = 0, w3 = 0;
		int sum = 0, remain = 0;
		
		System.out.println("무게를 입력하시오 : ");
		w1 = input.nextInt();
		w2 = input.nextInt();
		w3 = input.nextInt();
		
		sum = w1 + w2 + w3 ;
		remain = 600 - sum;
		
		
		if (sum > 600) {
			remain = sum - 600;
			System.out.println("무게가 600kg를 초과하였습니다.");
			System.out.println(remain + "kg을 제외하시오");
		}
		else if (w1 > w2 && w1 > w3) {
			System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
			System.out.println("남은 무게는 " + remain + "kg 입니다.");
			System.out.println("가장 무거운 무게는 " + w1 + "입니다");
		}
		else if (w2 > w1 && w2 > w3) {
			System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
			System.out.println("남은 무게는 " + remain + "kg 입니다.");
			System.out.println("가장 무거운 무게는 " + w2 + "입니다");
		}
		else {
			System.out.println("세 물건의 무게 총합은 " + sum + "kg 입니다.");
			System.out.println("남은 무게는 " + remain + "kg 입니다.");
			System.out.println("가장 무거운 무게는 " + w3 + "입니다");
		}
			
	}

}
