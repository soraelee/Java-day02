package day02;

public class Ex08_calcul {
	public static void main(String[] args) {
		//산술 연산자
		int n1 = 9, n2 = 2;
		System.out.println(n1 / n2);
		System.out.println(n1 / (double)n2); //하나라도 실수의 값을 가지면 실수 값이 출력 된다. 
		System.out.println(n1 % n2);
		
		// 복합 대입 연산자
		System.out.println("=====복합 대입 연산자=====");
		n1 = n2 = 5;
		n1 += 1; //6
		System.out.println(n1);
		n1 -= 1; //5
		System.out.println(n1);
		n1 *= n2; //25
		System.out.println(n1);
		n1 /= n2; //5
		System.out.println(n1);
		n1 %= n2; //0
		System.out.println(n1);
		
		//관계 연산자
		System.out.println("=====관계 연산자=====");
		n1 = 5;
		n2 = 2;
		System.out.println(n1 > n2); //True
		System.out.println(n1 <= n2); //False
		System.out.println(n1 == n2); //False
		System.out.println(n1 != n2); //True
		
		System.out.println("=====bool=====");
		boolean bool;
		bool = n1 > n2;
		System.out.println(bool);
		bool = n1 < n2;
		System.out.println(bool);
		
		System.out.println("=====논리 연산자=====");
		int n3 = 10;
		n1 = 5; n2 = 7;
		// && 모두가 참이면 참 (하나라도 거짓이면 거짓)
		System.out.println(n1 > n2 && n1 > n3);
		System.out.println(n2 > n1 && n2 > n3);
		System.out.println(n3 > n2 && n3 > n1);
		
		System.out.println("----or----");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("----and----");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("----not----");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(10 > 5));
		
		System.out.println("----응용----");
		n1 = 10; n2 = 5;
		bool = n1 > n2 && n1 % 2 == 0;
		System.out.println(bool);
		
		System.out.println("=====증감 연산자=====");
		n1 = 5;
		++n1 ;
		System.out.println(n1);
		
		n2 = 5;
		n2++;
		System.out.println(n2);
		
		System.out.println("------------");
		n1 = 10;
		n2 = ++n1;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		System.out.println("------------");
		n1 = 10;
		n2 = n1++;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		System.out.println("------------");
		int a = 5, b = 6, c = 10, d;
		d = ++a * b--; // d = 36
		System.out.println(a+","+b+","+d); // 6, 5, 36
		
		d = a++ + ++c - b--; //d = 12
		System.out.println(a+","+b+","+c+","+d); //7, 4, 11, 12
		
		
		System.out.println("=====삼항 연산자(조건 연산자)=====");
		n1 = 20;
		n2 = 10;
		String result;
		result = (n1 > n2) ? "n1이 n2 보다 크다" : "n2가 n1 보다 크다";
		System.out.println(result);
		
		
	}

}
