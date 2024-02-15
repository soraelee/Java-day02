package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex02_wrapper_class {
	public static void main(String[] args) {
//		-- Wrapper Class
//		
//		primitive Type: (소문자) 자료형을 부여할 수 없음
//		Wrapper Class : primitive Type을 자료형으로서 사용하게끔 변환해줌
		
		// 배열 활용
		ArrayList<Integer> arr = new ArrayList<>();
		
		Random r = new Random();
		
		for (int i = 0 ; i < 6 ; i++) {
			int num = r.nextInt(45) + 2; //1-45
			if (arr.contains(num) == false) { //존재하면 true
				arr.add(num);
			}
			System.out.println(arr.size());
		}
		System.out.println("배열 활용 : " + arr);
		
		// set 활용
		HashSet<Integer> set = new HashSet<>();
		
		for ( ; set.size() < 6 ; ) {
			int num = r.nextInt(45) + 2; //1-45
			set.add(num);
		}
		System.out.println("set 활용 : " + set);
	}

}
