package list;

import java.util.ArrayList;

public class Ex02_size_foreach {
	public static void main(String[] args) {
		//리스트의 사이즈
		ArrayList<String> arr = new ArrayList<>();
		
		System.out.println("저장 전 size : " + arr.size());
		arr.add("111");
		arr.add("222");
		arr.add("333");
		System.out.println("저장 후 size : " + arr.size());
		
		//반복문 활용
		for (int i = 0 ; i < arr.size() ; i++ ) {
			String s = arr.get(i) ;
			System.out.println(i + ". " + s);
		}
		
		//ㅂfor each문 사용
		System.out.println("---for each---");
		//["111", "222", "333"]형태로 저장
		for (String a : arr) {
			System.out.println(a);
			
		}
		
		
	}

}
