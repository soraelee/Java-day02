package collection;

import java.util.ArrayList;

class Dto01 { //하나의 array가 생기며 값을 저장하면 해당 값이 변수 별로 순차적으로 들어감
			  //즉 한 공간에 모든 변수들의 값이 하나씩 들어갈 수 있음
			  // 이 때 호출하고자 하는 공간은 자료형 =>클래스가 되어 : 클래스명 변수 = 공간;
	private String name, id; 

	public String getName() { 
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<Dto01> arr = new ArrayList<>(); //<>안에 클래스명이 들어감 => 클래스가 사용자지정 자료형이됨
		
		Dto01 d01 = new Dto01();
		d01.setName("홍길동");
		d01.setId("aaa");
		arr.add(d01);
		
		Dto01 dd = arr.get(0); //클래스명(자료형) 변수 = array공간;
		
		System.out.println(dd.getId());
		System.out.println(dd.getName());
		
		Dto01 d02 = new Dto01();
		d02.setName("김개똥");
		d02.setId("bbb");
		
		arr.add(d02);
		System.out.println(arr.get(1).getId());
		System.out.println(arr.get(1).getName());
		
		
		//저장된 모든 값을 꺼내기
		for (int i = 0 ; i < arr.size() ; i++ ) {
			Dto01 ddd = arr.get(i);
			System.out.println("id : " + ddd.getId());
			System.out.println("id : " + ddd.getName());
			System.out.println("-----------------");
		}
		
		//for each문
		ArrayList<String> arr01 = new ArrayList<>();
		arr01.add("aaa") ;
		arr01.add("bbb") ;
		for (String s : arr01) {
			System.out.println(s);
			
		}
		System.out.println("======");
		for (Dto01 d : arr) {
			System.out.println(d.getId());
			System.out.println(d.getName());
			System.out.println("------------");
		}
	}

}








