package file;

import java.io.Serializable; //직렬화 상속 받기 //자바에서 자동으로 직렬화 해줌

import lombok.Data;

@lombok.Data
public class Ex09DTO implements Serializable{
	private String name, addr;
}
