package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		String path = "E:\\핀테크_이소래\\핀테크 강의 내용\\test\\";
		
		System.out.println("파일명 입력");
		String fileName = input.next();
		
		File filePath = new File(path + fileName + ".txt");
		
		if(filePath.exists()) {
			System.out.println("이미 존재하는 파일입니다"); //조건식으로 덮어쓰는 것을 방지
		}
		else { 
			FileOutputStream fos = new FileOutputStream(filePath); 
			//같은 파일명으로 재실행할 경우 이전에 작성되 기존의 내용이 사라지고 덮어써짐
			String msg ;
			System.out.println("내용을 입력하세요");
			input.nextLine(); //그냥 next는 공백을 기준으로 값이 입력됨을 확인하기 때문에 위에서 저장 후 엔터를 치면 해당 값이 밑에 엔터적용에 적용되어서 얘가 빼줌
			msg = input.nextLine(); //엔터를 적용해줌
			fos.write(msg.getBytes());
			System.out.println("저장 되었습니다");
		}
	}

}
