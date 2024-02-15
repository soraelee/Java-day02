package set;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("¶ó¸é");
		set.add("±è¹ä");
		set.add("¼ø´ë");
		set.add("¶ó¸é");
		ArrayList<String> arr = new ArrayList<>();
		arr.add("¶ó¸é");
		arr.add("±è¹ä");
		arr.add("¼ø´ë");
		arr.add("¶ó¸é");
		
		System.out.println("set : " + set);
		System.out.println("arr : " + arr);
	}

}
