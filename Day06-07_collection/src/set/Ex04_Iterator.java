package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex04_Iterator {
	public static void main(String[] args) {
		//Iterator( 반복자)
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("일");
		arr.add("이");
		arr.add("삼");
		System.out.println("arr : " +arr);
		
		
		/*
		 Iterator : 반복자(배열 형식의 데이터로 만든다)
		 - HashNext :다음 위치에 값이 있으면 true, 없으면 false
		 - next : 다음 위치로 이동 후 값을 얻어옴
		 bof : 데이터의 시작을 의미
		 eof : 데이터의 끝 의미
		 it  => [ bof , 일, 이 삼, eof]
		 * */
		Iterator<String> it = arr.iterator();//it은 처음 시작에 위치, it.next를 사용하면 다음 값을 꺼냄
		System.out.println(it.hasNext()); //다음에 값이 있는가?
		System.out.println(it.next()); //다음 위치로 넘어감
		System.out.println(it.next()); //다음 위치로 넘어감
		System.out.println(it.hasNext()); //다음에 값이 있는가?
		System.out.println(it.next()); //다음 위치로 넘어감
		System.out.println(it.hasNext()); //다음에 값이 있는가? 
		
		System.out.println("-----set-----");
		HashSet<String> set = new HashSet<>();
		set.add("111");
		set.add("222");
		set.add("333");
		
		
		System.out.println("set : " + set); // set에서는 get을 사용할 수 없음 
											// => 각각의 값을 꺼내기 위해 Iterator 사용
		it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("종료!!");
		
		
		
	}

}
