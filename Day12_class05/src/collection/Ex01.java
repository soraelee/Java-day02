package collection;

import java.util.ArrayList;

class Dto01 { //�ϳ��� array�� ����� ���� �����ϸ� �ش� ���� ���� ���� ���������� ��
			  //�� �� ������ ��� �������� ���� �ϳ��� �� �� ����
			  // �� �� ȣ���ϰ��� �ϴ� ������ �ڷ��� =>Ŭ������ �Ǿ� : Ŭ������ ���� = ����;
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
		ArrayList<Dto01> arr = new ArrayList<>(); //<>�ȿ� Ŭ�������� �� => Ŭ������ ��������� �ڷ����̵�
		
		Dto01 d01 = new Dto01();
		d01.setName("ȫ�浿");
		d01.setId("aaa");
		arr.add(d01);
		
		Dto01 dd = arr.get(0); //Ŭ������(�ڷ���) ���� = array����;
		
		System.out.println(dd.getId());
		System.out.println(dd.getName());
		
		Dto01 d02 = new Dto01();
		d02.setName("�谳��");
		d02.setId("bbb");
		
		arr.add(d02);
		System.out.println(arr.get(1).getId());
		System.out.println(arr.get(1).getName());
		
		
		//����� ��� ���� ������
		for (int i = 0 ; i < arr.size() ; i++ ) {
			Dto01 ddd = arr.get(i);
			System.out.println("id : " + ddd.getId());
			System.out.println("id : " + ddd.getName());
			System.out.println("-----------------");
		}
		
		//for each��
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








