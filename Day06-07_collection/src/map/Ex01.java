package map;

import java.util.HashMap;

public class Ex01 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("num", "100");
		map.put("name", "È«±æµ¿");
		map.put("¼±Ç³±â", "1000¸¸¿ø");
		
		System.out.println("map : " + map);
		System.out.println(map.get("num"));
		System.out.println(map.get("¼±Ç³±â"));
		System.out.println(map.get("¾ø´ÂÅ°"));
	}

}
