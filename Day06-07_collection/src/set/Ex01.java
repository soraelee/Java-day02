package set;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("���");
		set.add("���");
		set.add("����");
		set.add("���");
		ArrayList<String> arr = new ArrayList<>();
		arr.add("���");
		arr.add("���");
		arr.add("����");
		arr.add("���");
		
		System.out.println("set : " + set);
		System.out.println("arr : " + arr);
	}

}
