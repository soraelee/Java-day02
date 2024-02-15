package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("이름", "홍길동");
		map.put("나이", "20");
		
		System.out.println("map : " + map);
		
		System.out.println("key set : " + map.keySet()); // 해당하는 키들만 꺼냄
		System.out.println("values : " + map.values()); // 해당하는 값들만 꺼냄
		
		//keySet => key 값에 대해 set 값을 제공 => 변수로 저장 시 set으로 저장
		//Iterator를 활용해서 값을 꺼냄

		Set<String> set = map.keySet();
		//set = 이름, 나이(인덱스 사용 불가)
		System.out.println("set : " + set);
		//it = [bof, 이름, 나이, eof]
		Iterator<String> it = set.iterator();
		
		for(;it.hasNext();) {
//			System.out.println(it.next());
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("종료!!");
		
		
	}
}
