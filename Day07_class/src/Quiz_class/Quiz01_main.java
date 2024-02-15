package Quiz_class;

public class Quiz01_main {
	public static void main(String[] args) {
//		모든 문제는 각각의 기능 별로 만들어 표현하시오
//		(입력, 출력, 연산 각각의 기능별로 만드세요)

//		이전의 거꾸로 수를 반환하는 메소드를 각각의 기능별로 만드시오
		
//		두 수를 입력 받아 큰 수를 출력하는 함수를 만드시오
		Quiz01_method q1 = new Quiz01_method();
		int num1, num2, max;
		num1 = q1.scanF();
		num2 = q1.scanF();
		
		max = q1.q1_calF(num1, num2);
		
		q1.int_printF(max);
		
//		입력 받은 값이 짝수인지 홀수인지 판별하는 함수 제작
		num1 = q1.scanF();
		q1.str_printF(q1.q2_calF(num1));
		
//		3의 배수를 판별하는 함수를 만들고 이 함수를 이용하여 main에서 3의 배수만 출력
		num1 = q1.scanF();
		q1.q3_calF(num1);
		
//		수를 입력 받아 소수를 판별하는 함수 제작
		num1 = q1.scanF();
		q1.str_printF(q1.q4_calF(num1));
		
//		절대값을 구하는 함수를 정의하시오
		num1 = q1.scanF();
		q1.int_printF(q1.q5_calF(num1));
		
		
	}

}
