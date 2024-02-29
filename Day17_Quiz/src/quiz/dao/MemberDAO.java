package quiz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import quiz.dto.MemberDTO;

public class MemberDAO {
	private Connection con;
	private PreparedStatement ps ;
	private ResultSet rs;
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "c##sorae", pw = "1234";
			
			con = DriverManager.getConnection(url, id, pw);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<MemberDTO> totalMember() {
		ArrayList<MemberDTO> arr = new ArrayList<>();
		String sql = "select * from member_table";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setDay(rs.getInt("day"));
				dto.setPay(rs.getString("pay"));
				
				arr.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return arr;
	}
	public ArrayList<MemberDTO> payMember(int day) {
		ArrayList<MemberDTO> arr = new ArrayList<>();
		String sql = "select * from member_table where day = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, day);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				if (rs.getString("pay").equals("no")) {
					MemberDTO dto = new MemberDTO();
					dto.setId(rs.getString("id"));
					dto.setName(rs.getString("name"));
					dto.setAge(rs.getInt("age"));
					dto.setDay(rs.getInt("day"));
					dto.setPay(rs.getString("pay"));
					
					arr.add(dto);
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
	public ArrayList<MemberDTO> ageMember(int age) {
		ArrayList<MemberDTO> arr = new ArrayList<>();
		String sql = "select * from member_table where age = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, age);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setDay(rs.getInt("day"));
				dto.setPay(rs.getString("pay"));

				arr.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
	public boolean memberChk(String id) {
		String sql = "select * from member_table where id = ?";
		boolean bool = false;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			int result = ps.executeUpdate();
			if (result == 1) 
				bool = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bool;
	}
	
	public MemberDTO memberSearch(String id) {
		MemberDTO dto = new MemberDTO();
		String sql = "select * from member_table where id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			rs.next();
			dto.setId(id);
			dto.setName(rs.getString("name"));
			dto.setAge(rs.getInt("age"));
			dto.setDay(rs.getInt("day"));
			dto.setPay(rs.getString("pay"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	public int memberRegist(MemberDTO dto) {
		String sql = "insert into member_table values(?, ?, ?, ?, ?)";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getAge());
			ps.setInt(4, dto.getDay());
			ps.setString(5, dto.getPay());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public void memberDel(String id) {
		String sql = "delete from member_table where id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
