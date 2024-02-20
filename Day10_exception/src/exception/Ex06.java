package exception;

// 예외 전가

class Test06 { 
	public void test1( ) {
		System.out.println(1111111);
		test2(); //예외 처리하라는 오류 발생 //2) 여기서도 에외 전가 진행
	}
	public void test2() {//예외 전가 진행 시
		System.out.println(2222222);
		 try { //try catch는 다른 메소드에 영향을 주지 않음
			 Thread.sleep(1000); 
		 } catch (InterruptedException e ) {
			 e.printStackTrace();
		 }
	}
}


public class Ex06 {
	public static void main(String[] args){
		
//		Thread.sleep(1000); //문제가 발생될 소지가 있는 것들은 미리 예외처리 하라고 뜸
		
		Test06 t = new Test06();
		t.test1(); // 3) 여기서도 발생
		
	}

}
