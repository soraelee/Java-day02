package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("�̸�", "ȫ�浿");
		map.put("����", "20");
		
		System.out.println("map : " + map);
		
		System.out.println("key set : " + map.keySet()); // �ش��ϴ� Ű�鸸 ����
		System.out.println("values : " + map.values()); // �ش��ϴ� ���鸸 ����
		
		//keySet => key ���� ���� set ���� ���� => ������ ���� �� set���� ����
		//Iterator�� Ȱ���ؼ� ���� ����

		Set<String> set = map.keySet();
		//set = �̸�, ����(�ε��� ��� �Ұ�)
		System.out.println("set : " + set);
		//it = [bof, �̸�, ����, eof]
		Iterator<String> it = set.iterator();
		
		for(;it.hasNext();) {
//			System.out.println(it.next());
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("����!!");
		
		
	}
}
