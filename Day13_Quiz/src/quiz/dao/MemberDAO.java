package quiz.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

import quiz.dto.MemberDTO;

public class MemberDAO {
	FileInputStream fis;
	FileOutputStream fos;
	BufferedInputStream bis;
	BufferedOutputStream bos;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	
	private String path = "E:/핀테크_이소래/핀테크 강의 내용/2. Java/members/";
	
	public Boolean Exist(String id) {
		File p = new File(path + id + ".txt");
		if (p.exists()) {
			return false;
		}else {
			return true;
		}
	}
	public void register(MemberDTO dto) {
		Boolean ex = Exist(dto.getId());
		File p = new File(path + dto.getId() + ".txt");
		if (ex == true) {
			try {
				fos = new FileOutputStream(p);
				bos = new BufferedOutputStream(fos);
				oos = new ObjectOutputStream(bos);
				oos.writeObject(dto);
				oos.close(); bos.close(); fos.close();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public String[] list() {
		File file = new File(path);
		return file.list();
	}
	public ArrayList<MemberDTO> allList() {
		File file = new File(path);
		String[] arr = file.list();
		MemberDTO dto = new MemberDTO();
		ArrayList<MemberDTO> dls = new ArrayList<>();
		for (String ls : arr) {
			File p = new File(path + ls);
			try {
				fis = new FileInputStream(p);
				bis = new BufferedInputStream(fis);
				ois = new ObjectInputStream(bis);
				dto = (MemberDTO)ois.readObject();
				dls.add(dto);
				ois.close();bis.close();fis.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return dls;
	}
	
	public ArrayList<MemberDTO> paylist(ArrayList<MemberDTO> dls) {
		ArrayList<MemberDTO> dto = new ArrayList<>();
		for (MemberDTO d : dls ) {
			if (d.isPay() == false) {
				dto.add(d);
			}
		}
		return dto;
	}
		

}
