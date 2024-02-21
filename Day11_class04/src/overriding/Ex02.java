package overriding;

import java.util.ArrayList;

class Test02 extends ArrayList<String> {
	public String get(int i) {
		System.out.println(super.get(i));
		return "";
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.add("111");
		t.get(0);
	}

}
