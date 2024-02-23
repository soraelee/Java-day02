package file.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class MemberDTO implements Serializable{ //직렬화 상속
	//회원들의 정보 저장
	private String id, name;
}
