package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

class DB_con { //dao�� ����
	private Connection con; //����� ���õǾ��մ� ��ü ������ ���� //���Ḹ ������
	private PreparedStatement ps; //�����ͺ��̽��� ��ɾ �����ϴ� ����
	private ResultSet rs; //�����͸� �����ϴ� ������ ���� ��ü
	public DB_con() { 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //1
			System.out.println("����Ŭ ��� ��밡��(����̺� �ε�)");
			//19���� �̻� : orcl, 18���� ���� : xe
			String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
			String id = "c##sorae";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, id, pwd); //2. ����Ŭ�� ����
			
			System.out.println("db���� ���� : " + con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//sqldeveloper\jdbc\lib-> ojdbc.jar
	
	public ArrayList<MemberDTO> select() { //���̺��� java�� �ҷ���
		
		String sql = "select * from member_test";
		ArrayList<MemberDTO> arr = new ArrayList<>();
		
		try {
			ps = con.prepareStatement(sql); //sql��ɾ� ���۹��� //3. ���� ��ü ����
			rs = ps.executeQuery(); //sql ��ɾ� ���� -> rs��� ��ü�� ����
			//iterate ������ ���� -> bof, ..., eof  => ���ڵ� ����
			// .next => eof���� ���� false�� => �����Ͱ� �������� ���� 
			
			
			while (rs.next()) {
				MemberDTO dto = new MemberDTO();
				
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("pwd"));
				dto.setPwd(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				
				arr.add(dto);
				/*
				System.out.println(rs.next()); //true => �����Ͱ� �����մϴ�
				System.out.println(rs.getString("id")); //���� ��ġ�� �÷� �� ��������
				System.out.println(rs.getString("pwd")); //true => �����Ͱ� �����մϴ�
				System.out.println(rs.getString("name")); //true => �����Ͱ� �����մϴ�
				System.out.println(rs.getInt("age")); //true => �����Ͱ� �����մϴ�
				System.out.println("----------");
				*/
			}
			
			/*
			System.out.println(rs.next()); //true => �����Ͱ� �����մϴ�
			System.out.println(rs.getString("id")); //���� ��ġ�� �÷� �� ��������
			System.out.println(rs.getString("pwd")); 
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("age")); 
			
			System.out.println(rs.next()); //true => �����Ͱ� �����մϴ�
			System.out.println(rs.getString("id")); //���� ��ġ�� �÷� �� ��������
			System.out.println(rs.getString("pwd"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("age")); 
			*/
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return arr;
	}
	
	public MemberDTO selectOne(String userId) {
		String sql = "select * from member_test where id = " + "'" + userId + "'"; //���� ����ǥ�� ��� ���� �߻�
//		System.out.println(sql);
		MemberDTO dto = null;
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
//			while (rs.next()) {
			if (rs.next()) { //���� �����ϴ� id�� �Է��� ��� ����
				dto = new MemberDTO(); //if���� ����Ǵ� ��� dto ��ü ���� ����
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("pwd"));
				dto.setPwd(rs.getString("name"));
				dto.setAge(rs.getInt("age"));

//				System.out.println(rs.getString("id")); //���� ��ġ�� �÷� �� ��������
//				System.out.println(rs.getString("pwd")); //true => �����Ͱ� �����մϴ�
//				System.out.println(rs.getString("name")); //true => �����Ͱ� �����մϴ�
//				System.out.println(rs.getInt("age")); //true => �����Ͱ� �����մϴ�
//				System.out.println("----------");
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto; //if���� ������� �ʴ� ��� dto = null => �������� �ʴ� ���̵��Դϴ�.
	}
	
	public int delete(String delId) {
		String sql = "delete from member_test where id = ?" ; //? : ���߿� ���� ä�� �ְڽ��ϴ�.
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, delId); //�ڸ���, �ش� ���ڿ�
			
//			ps.executeQuery(); //������ ���� �� executeQuery ���
			//select�� ������ ������ ����(return ���� ���̰� ����)
			result = ps.executeUpdate(); //��� ���� �����Ǿ��� �� int �������� ��� => ���� ������ 0
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int insert(MemberDTO dto) {
		String sql = "insert into member_test(id, pwd, name, age) values(?, ?, ?, ?)";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId()); //�÷� ������� �ۼ��ؾ� �� //return = 0, 1
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getPwd());
			ps.setInt(4, dto.getAge());
			
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace(); //�⺻Ű id�� �ߺ��� ��� ���� �޼��� �߻�
		}
		return result;
	}
	
}

public class MainClass {
	public static void main(String[] args) {
		DB_con db = new DB_con();
		
		Scanner input = new Scanner(System.in);
		int num;
		while (true) {
			ArrayList<MemberDTO> arr = db.select(); 
			System.out.println("1. ��� ��Ϻ���");
			System.out.println("2. Ư�� ����� ����");
			System.out.println("3. ������ �߰�");
			System.out.println("4. ������ ����");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("----main----");
				
				for (MemberDTO dto : arr) {
					System.out.println("id : " + dto.getId());
					System.out.println("name : " + dto.getName());
					System.out.println("pwd : " + dto.getPwd());
					System.out.println("age : " + dto.getAge());
					System.out.println("------------");
				}
				break;
			case 2:
				System.out.println("�˻� id �Է�");
				String userId = input.next();
				MemberDTO dto = db.selectOne(userId); //DB_con
				
				if (dto == null) {
					System.out.println("�������� �ʴ� id�Դϴ�.");
				}
				else {
//				System.out.println("dto : " + dto);
					System.out.println("----main----");
					System.out.println("id : " + dto.getId());
					System.out.println("name : " + dto.getName());
					System.out.println("pwd : " + dto.getPwd());
					System.out.println("age : " + dto.getAge());
					System.out.println("------------");
					
				}
			
				break;
			case 3:
				MemberDTO d = new MemberDTO();
				
				while (true) {
					System.out.println("������ ID�Է�");
					d.setId(input.next());
					MemberDTO dd = db.selectOne(d.getId());
					if (dd == null)
						break;
					else
						System.out.println("�����ϴ� id, �ٽ� �Է�");
				}
				
				
				System.out.println("������ pw�Է�");
				d.setPwd(input.next());
				
				System.out.println("������ name�Է�");
				d.setName(input.next());
				
				System.out.println("������ age�Է�");
				d.setAge(input.nextInt());
				
				int res = db.insert(d);
				if(res == 1) {
					System.out.println("ȸ������ ����");
				}
				else
					System.out.println("�����ϴ� id�� �ȵ�!");
				
				break;
			case 4:
				System.out.println("���� id �Է�");
				String delId = input.next();
				int result = db.delete(delId);
				
				if (result == 1) {
					System.out.println("���� ����!!");
					
				}
				else {
					System.out.println("�������� �ʴ� ���̵�, ���� �Ұ�!");
				}
				break;

			default:
				break;
			}
		}
		
		
		
	}
}
