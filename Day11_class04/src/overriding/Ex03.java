package overriding;

import java.util.ArrayList;

final class Test03 { 
	public void test() {
		System.out.println("test03�� tset���");
	}
}
class TestClass03{
	public void test() {
		System.out.println("class03 test���");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test();
	}

}
