package map;

import java.util.HashMap;

public class Ex01 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("num", "100");
		map.put("name", "ȫ�浿");
		map.put("��ǳ��", "1000����");
		
		System.out.println("map : " + map);
		System.out.println(map.get("num"));
		System.out.println(map.get("��ǳ��"));
		System.out.println(map.get("����Ű"));
	}

}
