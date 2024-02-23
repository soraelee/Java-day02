package collection.dao;

import java.util.ArrayList;

import collection.dto.MemberDTO;

public class MemberDAO { // Data Access Object : 저장소에 접근(연락)
	public static ArrayList<MemberDTO> arr; // DTO를 ArrayList로 만들어줌
	static {
		arr = new ArrayList<>();
		// static -> 없어지지 않고 계속 유지할 수 있어야 함
		// static으로 만들었기 때문에 static으로 초기화
		// static{} 으로 사용하는 경우 => 코드를 여러줄 추가할 수 있음(초기 코드를 넣을 수 있음)
	}

	public void register(MemberDTO dto) { // 들어온 값을
		arr.add(dto); // 특정 저장소에 값을 저장하도록 연동
	}

	public ArrayList<MemberDTO> getData() { // 저장한 목록을 꺼낼 수 있도록 함
		return arr;

	}

	public MemberDTO search(String name) {
		for (MemberDTO d : arr) {
			if (name.equals(d.getName())) {
				return d;
			}
		}
		return null;
	}

}
