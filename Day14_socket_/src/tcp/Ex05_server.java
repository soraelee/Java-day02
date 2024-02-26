package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

class Ex05_Thread extends Thread {
	public static int num = 1;
	private Socket sock;
	
	public Ex05_Thread(Socket sock) {
		this.sock = sock;
		start();
	}//생성자 
	
	@Override
	public void run() {
		/*
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		num ++;
		InputStream in;
		String readData = null;
		System.out.println(num + "번째 클라이언트 접속");
		while(true) {
		try {
			in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			readData = dis.readUTF();
			System.out.println("수신 데이터 : " + readData);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		}
		
	}
}


public class Ex05_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		//스레드를 사용하기
		//여기 있는 내용은 블록
		while (true) {
			Socket sock = server.accept();
			new Ex05_Thread(sock); //스레드 객체 각자 생성
		}
		//여러개의 소켓을 만드는 경우 모든 소켓이 운영되기 전까지는 사용 불가
		
	}
}
