package file.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class MemberDTO implements Serializable{ //����ȭ ���
	//ȸ������ ���� ����
	private String id, name;
}
