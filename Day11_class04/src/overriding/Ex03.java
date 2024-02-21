package overriding;

import java.util.ArrayList;

final class Test03 { 
	public void test() {
		System.out.println("test03의 tset기능");
	}
}
class TestClass03{
	public void test() {
		System.out.println("class03 test기능");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test();
	}

}
