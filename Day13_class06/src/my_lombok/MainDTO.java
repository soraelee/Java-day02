package my_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/*
@Setter
@Getter
@ ToString
@NoArgsConstructor //디폴트 생성자를 만들겠다
@AllArgsConstructor //모든 변수를 받아주는 생성자 생성
//해당 부분을 생성하면 반드시 디폴트도 생성 필요
*/ 
@Data //위의 기능들을 모두 생성해주는 기능
public class MainDTO {
	private String name;
	private int age;
}
