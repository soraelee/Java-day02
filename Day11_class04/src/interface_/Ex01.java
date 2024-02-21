package interface_;

interface A01 {
	public void test1(); //실질적인 코드를 만들지 않음 {}사용하는 순간 에러 발생
	
}

interface B01 {
	public void test1();
}

class Class01 {}
class Class02 {}
public class Ex01 extends Class01 implements A01, B01{//클래스는 하나만 상속 가능
													  //인터페이스는 다중 상속 가능

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	} 

}
