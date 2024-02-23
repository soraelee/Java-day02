package file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex09_01 {
	public static void main(String[] args) throws Exception{
		//읽어들이기
		
		String path = "E:\\핀테크_이소래\\핀테크 강의 내용\\2. Java\\test\\test.txt";
		
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Ex09DTO dto = (Ex09DTO)ois.readObject(); 
		//byte형식으로 저장된 내용을 object 형태로 읽어들이기
		//기존에 Ex09DTO 형태로 저장했기 때문에 형변환 진행
		
		System.out.println("name : " + dto.getName());
		System.out.println("addr : " + dto.getAddr());
	}

}
