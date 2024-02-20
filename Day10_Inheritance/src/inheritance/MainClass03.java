package inheritance;

import java.util.ArrayList;

class TestClass03 extends ArrayList<String> {

	@Override
	public String get(int index) {
		System.out.println("데이터를 가져오는 기능");
		return super.get(index);
	}

	@Override
	public void add(int index, String element) {
		System.out.println("데이터를 추가했습니다");
		super.add(index, element);
	}//부모가 가진 기능 쉽게 사용
	
}

public class MainClass03 {
	public static void main(String[] args) {
		//오버라이딩
		//부모 클래스의 메소드를 변경하여 사용 가능
		TestClass03 tc = new TestClass03();
		tc.add("aaa");
		System.out.println(tc.get(0));
	}

}
