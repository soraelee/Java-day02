package file;

import java.io.File;

public class Ex03 {
	public static void main(String[] args) {
		String sPath = "E:\\핀테크_이소래\\핀테크 강의 내용\\test\\test.txt";
		File fPath = new File("E:\\핀테크_이소래\\핀테크 강의 내용\\abcd\\"); //파일명은 작성 안함
		fPath.mkdir(); //폴더를 생성하겠습니다
		fPath.delete(); //폴더를 삭제하겠습니다.
		
		fPath = new File("E:\\핀테크_이소래\\핀테크 강의 내용\\");
		String[] s = fPath.list(); //이 폴더 내에 있는 목록을 불러옴 //Str 형식의 배열로 저장
		
		System.out.println(s.length);
		for (String ss : s) {
			System.out.println(ss);
		}
		System.out.println(fPath.exists()); //폴더의 마지막 부분의 해당 값 존재여부 확인
	}

}
