package file;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception { //예외처리하도록 함
		Scanner input = new Scanner(System.in);
		
		String path = "E:\\핀테크_이소래\\핀테크 강의 내용\\test\\test2.txt"; //파일 타입이 아닌 String으로 지정 (문자열로 지정해도 됨)
		
		FileOutputStream fos = new FileOutputStream(path);
		System.out.println("출력할 내용 입력");
		String name = input.next();
		
		fos.write(name.getBytes()); //사용자가 입력한 값을 write 
		System.out.println("저장 되었습니다!");
	}

}
