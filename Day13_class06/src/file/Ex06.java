package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		String path = "E:\\핀테크_이소래\\핀테크 강의 내용\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path, true); //덮어씌워지지 않음
		
		fos.write('c');
		fos.close(); //메모리를 효율적으로 사용할 수 있음
		fos = new FileOutputStream(path, true);  //새로 생성해주어야 함
		fos.write('d'); //스트림 연결 통로를 끊었기 때문에 사용 불가
		
		
		//파일 내용 가져오기
		FileInputStream fis = new FileInputStream(path);
		//모든 내용의 끝에는 EOF로 -1이 저장됨 => 해당 파일의 끝을 알 수 잇음
		while (true) {
			int re = fis.read();
			if (re < 0) {
				System.out.println("내용이 없습니다 : " + re);
				break;
			}
			System.out.println((char)re); 
		}

	}
}
