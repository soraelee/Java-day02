package class_;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass10 {
	public static void main(String[] args) {
		TestClass10 t = new TestClass10();
		
		int[] a = t.test1();
		System.out.println((a[0]));
		System.out.println((a[1]));
		
		//����Ʈ
		ArrayList<String> arr = new ArrayList<>();
		arr.add("111");
		arr.add("222");
		
		HashMap<String, String> m = t.test2(arr, 100, "���ڿ�");
		System.out.println("main���");
		System.out.println(m.get("Ű1"));
		System.out.println(m.get("Ű2"));
	}

}
