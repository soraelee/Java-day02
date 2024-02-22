package member.dao;

import java.util.ArrayList;

import member.dto.MemberDTO;

public class MemberDAO {
	public static ArrayList<MemberDTO> arr;
	static {
		arr = new ArrayList<>();
	}
	
	public void register(MemberDTO dto) {
		arr.add(dto);
	}
	public MemberDTO search(String s) {
		for (MemberDTO d : arr) {
			if(d.getName().equals(s)) {
				return d;
			}
		}
		return null;
	}
	public MemberDTO delete(MemberDTO d) {
		return null;
	} 
	public ArrayList<MemberDTO> searchDay(int n) {
		ArrayList<MemberDTO> arr2 = new ArrayList<>();
		for (MemberDTO d : arr) {
			if(d.getDay() == n) {
				arr2.add(d);
			}
		}
		return arr2;
	}
	public ArrayList<MemberDTO> searchAge(int n) {
		ArrayList<MemberDTO> arr2 = new ArrayList<>();
		for (MemberDTO d : arr) {
			if(d.getAge() == n) {
				arr2.add(d);
			}
		}
		return arr2;
	}
	public ArrayList<MemberDTO> searchNo() {
		ArrayList<MemberDTO> arr2 = new ArrayList<>();
		for (MemberDTO d : arr) {
			if (d.getPay().equals("no"))
					arr2.add(d);
		}
		return arr2;
	}
	
}
