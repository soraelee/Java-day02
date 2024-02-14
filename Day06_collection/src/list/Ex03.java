package list;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
		//contains
		System.out.println(arr.contains("222"));
		System.out.println(arr.contains("없는 값"));
		
		//bool 값 저장
		boolean bool = arr.contains("1234");
		if (bool) {
			System.out.println("입력한 값 존재합니다. ");
		}
		else {
			System.out.println("존재하지 않는 값, 다시 입력");
		}
		
		//remove
		System.out.println("삭제 전 arr : " + arr );
		System.out.println("삭제 전 size : "+ arr.size());
		
		arr.remove(1) ; //index 기준으로 삭제
		System.out.println("삭제 후 arr : " + arr);
		System.out.println("삭제 후 size : " + arr.size());
		
		arr.remove("111") ; //데이터 기준으로 삭제
		System.out.println("삭제 후 arr : " + arr);
		System.out.println("삭제 후 size : " + arr.size());
		
		System.out.println("arr 0번 인덱스 : " + arr.get(0));
		
	}
}
