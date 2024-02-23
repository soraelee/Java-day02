package collection.dao;

import java.util.ArrayList;

import collection.dto.MemberDTO;

public class MemberDAO { // Data Access Object : ����ҿ� ����(����)
	public static ArrayList<MemberDTO> arr; // DTO�� ArrayList�� �������
	static {
		arr = new ArrayList<>();
		// static -> �������� �ʰ� ��� ������ �� �־�� ��
		// static���� ������� ������ static���� �ʱ�ȭ
		// static{} ���� ����ϴ� ��� => �ڵ带 ������ �߰��� �� ����(�ʱ� �ڵ带 ���� �� ����)
	}

	public void register(MemberDTO dto) { // ���� ����
		arr.add(dto); // Ư�� ����ҿ� ���� �����ϵ��� ����
	}

	public ArrayList<MemberDTO> getData() { // ������ ����� ���� �� �ֵ��� ��
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
