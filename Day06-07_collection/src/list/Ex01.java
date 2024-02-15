package list;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>(); // 첫번째 <> 안에는 자료형
		arr.add("안녕"); //데이터를 추가하겠습니다. 
		arr.add("하세요"); //데이터를 추가하겠습니다. 
		arr.add("하세요"); //데이터를 추가하겠습니다. 
		arr.add("하세요"); //데이터를 추가하겠습니다. 
		arr.add("하세요"); //데이터를 추가하겠습니다. 
		arr.add("하세요"); //데이터를 추가하겠습니다. 
		arr.add("하세요"); //데이터를 추가하겠습니다. 
		System.out.println("arr : " + arr);
		
		// 데이터 꺼내기 :get
		String s = arr.get(0); // 인덱스 값을 넣음
		System.out.println("0 : " + s);
		
		
		
	}

}
