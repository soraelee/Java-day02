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
@NoArgsConstructor //����Ʈ �����ڸ� ����ڴ�
@AllArgsConstructor //��� ������ �޾��ִ� ������ ����
//�ش� �κ��� �����ϸ� �ݵ�� ����Ʈ�� ���� �ʿ�
*/ 
@Data //���� ��ɵ��� ��� �������ִ� ���
public class MainDTO {
	private String name;
	private int age;
}
