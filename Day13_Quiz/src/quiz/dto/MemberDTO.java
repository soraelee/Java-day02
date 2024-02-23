package quiz.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class MemberDTO implements Serializable{
	private String id, name;
	private int age, day;
	private boolean pay;
	
	

}
