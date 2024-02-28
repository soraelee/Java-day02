package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

class DB_con { //dao의 형태
	private Connection con; //연결과 관련되어잇는 객체 정보를 가짐 //연결만 시켜줌
	private PreparedStatement ps; //데이터베이스로 명령어를 전송하는 역할
	private ResultSet rs; //데이터를 저장하는 역할을 가진 객체
	public DB_con() { 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //1
			System.out.println("오라클 기능 사용가능(드라이브 로드)");
			//19버전 이상 : orcl, 18버전 이하 : xe
			String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
			String id = "c##sorae";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, id, pwd); //2. 오라클에 연동
			
			System.out.println("db연결 성공 : " + con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//sqldeveloper\jdbc\lib-> ojdbc.jar
	
	public ArrayList<MemberDTO> select() { //테이블을 java로 불러옴
		
		String sql = "select * from member_test";
		ArrayList<MemberDTO> arr = new ArrayList<>();
		
		try {
			ps = con.prepareStatement(sql); //sql명령어 전송받음 //3. 전송 객체 얻어옴
			rs = ps.executeQuery(); //sql 명령어 실행 -> rs라는 객체에 저장
			//iterate 값으로 저장 -> bof, ..., eof  => 레코드 받음
			// .next => eof까지 가면 false값 => 데이터가 존재하지 않음 
			
			
			while (rs.next()) {
				MemberDTO dto = new MemberDTO();
				
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("pwd"));
				dto.setPwd(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				
				arr.add(dto);
				/*
				System.out.println(rs.next()); //true => 데이터가 존재합니다
				System.out.println(rs.getString("id")); //현재 위치의 컬럼 값 가져오기
				System.out.println(rs.getString("pwd")); //true => 데이터가 존재합니다
				System.out.println(rs.getString("name")); //true => 데이터가 존재합니다
				System.out.println(rs.getInt("age")); //true => 데이터가 존재합니다
				System.out.println("----------");
				*/
			}
			
			/*
			System.out.println(rs.next()); //true => 데이터가 존재합니다
			System.out.println(rs.getString("id")); //현재 위치의 컬럼 값 가져오기
			System.out.println(rs.getString("pwd")); 
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("age")); 
			
			System.out.println(rs.next()); //true => 데이터가 존재합니다
			System.out.println(rs.getString("id")); //현재 위치의 컬럼 값 가져오기
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
		String sql = "select * from member_test where id = " + "'" + userId + "'"; //작은 따옴표가 없어서 에러 발생
//		System.out.println(sql);
		MemberDTO dto = null;
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
//			while (rs.next()) {
			if (rs.next()) { //현재 존재하는 id를 입력할 경우 실행
				dto = new MemberDTO(); //if문이 실행되는 경우 dto 객체 값을 가짐
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("pwd"));
				dto.setPwd(rs.getString("name"));
				dto.setAge(rs.getInt("age"));

//				System.out.println(rs.getString("id")); //현재 위치의 컬럼 값 가져오기
//				System.out.println(rs.getString("pwd")); //true => 데이터가 존재합니다
//				System.out.println(rs.getString("name")); //true => 데이터가 존재합니다
//				System.out.println(rs.getInt("age")); //true => 데이터가 존재합니다
//				System.out.println("----------");
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto; //if문이 실행되지 않는 경우 dto = null => 존재하지 않는 아이디입니다.
	}
	
	public int delete(String delId) {
		String sql = "delete from member_test where id = ?" ; //? : 나중에 값을 채워 넣겠습니다.
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, delId); //자리수, 해당 문자열
			
//			ps.executeQuery(); //정보를 얻어올 때 executeQuery 사용
			//select를 제외한 나머지 쿼리(return 값의 차이가 있음)
			result = ps.executeUpdate(); //몇개의 행의 삭제되었는 지 int 형식으로 출력 => 값이 없으면 0
			
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
			ps.setString(1, dto.getId()); //컬럼 순서대로 작성해야 함 //return = 0, 1
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getPwd());
			ps.setInt(4, dto.getAge());
			
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace(); //기본키 id가 중복될 경우 에러 메세지 발생
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
			System.out.println("1. 모든 목록보기");
			System.out.println("2. 특정 사용자 보기");
			System.out.println("3. 데이터 추가");
			System.out.println("4. 데이터 삭제");
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
				System.out.println("검색 id 입력");
				String userId = input.next();
				MemberDTO dto = db.selectOne(userId); //DB_con
				
				if (dto == null) {
					System.out.println("존재하지 않는 id입니다.");
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
					System.out.println("가입할 ID입력");
					d.setId(input.next());
					MemberDTO dd = db.selectOne(d.getId());
					if (dd == null)
						break;
					else
						System.out.println("존재하는 id, 다시 입력");
				}
				
				
				System.out.println("가입할 pw입력");
				d.setPwd(input.next());
				
				System.out.println("가입할 name입력");
				d.setName(input.next());
				
				System.out.println("가입할 age입력");
				d.setAge(input.nextInt());
				
				int res = db.insert(d);
				if(res == 1) {
					System.out.println("회원가입 성공");
				}
				else
					System.out.println("존재하는 id는 안됨!");
				
				break;
			case 4:
				System.out.println("삭제 id 입력");
				String delId = input.next();
				int result = db.delete(delId);
				
				if (result == 1) {
					System.out.println("삭제 성공!!");
					
				}
				else {
					System.out.println("존재하지 않는 아이디, 삭제 불가!");
				}
				break;

			default:
				break;
			}
		}
		
		
		
	}
}
