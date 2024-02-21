package interface_;

public class Ex07 {
	public static void main(String[] args) {
		/*TestClass07 t01 = new TestClass07();
		TestClass07 t02 = new TestClass07();
		TestClass07 t03 = new TestClass07();
		TestClass07 t04 = new TestClass07();
		TestClass07 t05 = new TestClass07();
		TestClass07 t06 = new TestClass07();*/ //위와 같이 만들면 비효율적
		
		TestInt07 t01 = Singleton07.getInstance(); //인스턴스를 만듦(메모리 효율을 올려서)
		TestInt07 t02 = Singleton07.getInstance();
		TestInt07 t03 = Singleton07.getInstance();
		TestInt07 t04 = Singleton07.getInstance();
		
		t01.test();
		
	}

}
