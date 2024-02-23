package file.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import file.dto.MemberDTO;

public class MemberDAO { //저장만 함 입출력 X
	//경로지정
	private String path = "E:\\핀테크_이소래\\핀테크 강의 내용\\2. Java\\members\\";
	private FileInputStream fis;
	private FileOutputStream fos;
	private BufferedInputStream bis;
	private BufferedOutputStream bos ;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public void register(MemberDTO dto) {
		//입력되는 파일은 사용자의 아이디를 붙여 만들것
//		String p = path + dto.getId() + ".txt";
		File p = new File(path + dto.getId() + ".txt");
		if(p.exists()) { //파일이 있으면  true
			System.out.println("존재하는 회원입니다.");
		}
		else {
			try {
				fos = new FileOutputStream(p);
				bos = new BufferedOutputStream(fos);
				oos = new ObjectOutputStream(bos);
				oos.writeObject(dto);
				
				oos.close(); bos.close(); fos.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("회원가입 성공!");
		}
		//throws Exception => 예외처리를 하면 예외전가 발생
		//try catch 사용
		//현재 저장된 파일이 있으면 저장되지 못하게 해야 함
	}
	
	public String[] getList() {
		File file = new File(path);
		return file.list(); //해당 위치에 있는 목록을 string 배열로 반환
	}
	public void delete(String id) { //저장된 파일을 삭제
		File file = new File(path + id + ".txt");
		if (file.exists()) {
			file.delete();
			System.out.println("삭제되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 회원입니다.");
		}
	}
	public MemberDTO search(String id) {
		File f = new File(path + id + ".txt");
		MemberDTO dto = null;
		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				bis = new BufferedInputStream(fis);
				ois = new ObjectInputStream(bis);
				dto = (MemberDTO)ois.readObject();
				ois.close();bis.close();fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("찾는 회원이 없습니다");
		}
		return dto;
	}
}
