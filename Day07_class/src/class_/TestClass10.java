package class_;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClass10 {
	public int[] test1() {
		int n1 = 100, n2 = 200;
//		return n1; //, n2
		//�迭
		int[] arr = {n1, n2};
		return arr;
	}
	//����Ʈ Ȱ�� - ����Ʈ �Ѱ��ֱ�, 
	//map Ȱ�� - map �ޱ�
	public HashMap<String, String> test2(ArrayList<String> a, int n, String s) {
		System.out.println(a.get(0)); ///"111"
		System.out.println(n); ///100
		System.out.println(s); ///"���ڿ�"
		System.out.println("���� ������ �̷�����ϴ�.");
		HashMap<String, String> map = new HashMap<>();
		map.put("Ű1", "����Ȱ�1");
		map.put("Ű2", "����Ȱ�2");
		map.put("Ű3", "����Ȱ�3");
		return map;
	}
	
}
