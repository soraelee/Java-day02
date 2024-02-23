package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex08 {
	public static void main(String[] args) throws Exception{
		String path = "E:\\핀테크_이소래\\핀테크 강의 내용\\test\\test.txt";
		FileOutputStream fos = new FileOutputStream(path); 
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
//		fos.write(null);//byte 형식이나 int만 받을 수 있음
		
		//더 많은 내용을 받을 수 있도록 하는 보조 스트림
		
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeUTF("안녕하세요");
		dos.writeInt(100);
		dos.writeDouble(1.111);
		dos.close();bos.close();fos.close();
		
		FileInputStream fis = new FileInputStream(path); 
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String msg = dis.readUTF();
		int num = dis.readInt();
		double dou = dis.readDouble();
		System.out.println(msg);
		System.out.println(num);
		System.out.println(dou);
	}

}
