package file;

import java.io.Serializable; //����ȭ ��� �ޱ� //�ڹٿ��� �ڵ����� ����ȭ ����

import lombok.Data;

@lombok.Data
public class Ex09DTO implements Serializable{
	private String name, addr;
}
