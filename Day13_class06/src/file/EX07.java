package file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class EX07 {
	public static void main(String[] args) throws Exception{
		String path = "E:\\핀테크_이소래\\핀테크 강의 내용\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path); //덮어씌워지지 않음
		
		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		//이러한 비효율을 줄이기 위해 사용 => 보조 스트림
		
		for (char ch = '0' ; ch <= '9' ; ch++) {
			Thread.sleep(1);
			bos.write(ch);// write : 파일에 한번 접근할 때마다 한번 작성
						  //보조 스트림을 활용하여 비효율을 줄임
						  //하나의 저장공간을 만들어놓고 작성된 ㄴ내용을 가지고 있음
						  
		}
		bos.flush(); //저장공간에 넣어둔 내용을 한번에 파일로 전송
					 //전송 후 연결통로를 유지 시킴
		bos.write('a'); //따라서 한번 더 작성할 수 있음
		
		bos.close(); //저장공간에 넣어둔 내용을 전송함과 동시에 연결통로도 끊음
		fos.close();
	}

}
