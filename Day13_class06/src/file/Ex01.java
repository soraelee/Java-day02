package file;

import java.io.File;
import java.io.FileOutputStream;
//import java.io.Exception;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		File path = new File("E:\\핀테크_이소래\\핀테크 강의 내용\\test\\test.txt");
		//파일 출력 : output stream
		FileOutputStream fos = new FileOutputStream(path); 
		fos.write(97);
		fos.write('a'); //배열 형식으로 받을 수 있음
		fos.write("test".getBytes());
	}
}
