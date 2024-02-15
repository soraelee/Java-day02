package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex04_Iterator {
	public static void main(String[] args) {
		//Iterator( �ݺ���)
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("��");
		arr.add("��");
		arr.add("��");
		System.out.println("arr : " +arr);
		
		
		/*
		 Iterator : �ݺ���(�迭 ������ �����ͷ� �����)
		 - HashNext :���� ��ġ�� ���� ������ true, ������ false
		 - next : ���� ��ġ�� �̵� �� ���� ����
		 bof : �������� ������ �ǹ�
		 eof : �������� �� �ǹ�
		 it  => [ bof , ��, �� ��, eof]
		 * */
		Iterator<String> it = arr.iterator();//it�� ó�� ���ۿ� ��ġ, it.next�� ����ϸ� ���� ���� ����
		System.out.println(it.hasNext()); //������ ���� �ִ°�?
		System.out.println(it.next()); //���� ��ġ�� �Ѿ
		System.out.println(it.next()); //���� ��ġ�� �Ѿ
		System.out.println(it.hasNext()); //������ ���� �ִ°�?
		System.out.println(it.next()); //���� ��ġ�� �Ѿ
		System.out.println(it.hasNext()); //������ ���� �ִ°�? 
		
		System.out.println("-----set-----");
		HashSet<String> set = new HashSet<>();
		set.add("111");
		set.add("222");
		set.add("333");
		
		
		System.out.println("set : " + set); // set������ get�� ����� �� ���� 
											// => ������ ���� ������ ���� Iterator ���
		it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("����!!");
		
		
		
	}

}
