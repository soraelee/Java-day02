package file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex09 {
	public static void main(String[] args) throws Exception{
		Ex09DTO dto = new Ex09DTO();
		dto.setName("홍길동");
		dto.setAddr("산골짜기");
		
		String path = "E:\\핀테크_이소래\\핀테크 강의 내용\\2. Java\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path); 
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//객체를 저장하는 스트림 => 자료형이 필요> DTO에서 직렬화를 상속 받음
		ObjectOutputStream oos  = new ObjectOutputStream(bos);
		oos.writeObject(dto);
		
		oos.close();bos.close();fos.close(); //에러 => file not found
		
	}
}
