package file.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import file.dto.MemberDTO;

public class MemberDAO { //���常 �� ����� X
	//�������
	private String path = "E:\\����ũ_�̼ҷ�\\����ũ ���� ����\\2. Java\\members\\";
	private FileInputStream fis;
	private FileOutputStream fos;
	private BufferedInputStream bis;
	private BufferedOutputStream bos ;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public void register(MemberDTO dto) {
		//�ԷµǴ� ������ ������� ���̵� �ٿ� �����
//		String p = path + dto.getId() + ".txt";
		File p = new File(path + dto.getId() + ".txt");
		if(p.exists()) { //������ ������  true
			System.out.println("�����ϴ� ȸ���Դϴ�.");
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
			System.out.println("ȸ������ ����!");
		}
		//throws Exception => ����ó���� �ϸ� �������� �߻�
		//try catch ���
		//���� ����� ������ ������ ������� ���ϰ� �ؾ� ��
	}
	
	public String[] getList() {
		File file = new File(path);
		return file.list(); //�ش� ��ġ�� �ִ� ����� string �迭�� ��ȯ
	}
	public void delete(String id) { //����� ������ ����
		File file = new File(path + id + ".txt");
		if (file.exists()) {
			file.delete();
			System.out.println("�����Ǿ����ϴ�.");
		}
		else {
			System.out.println("�������� �ʴ� ȸ���Դϴ�.");
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
			System.out.println("ã�� ȸ���� �����ϴ�");
		}
		return dto;
	}
}
