package class_;

public class TestClass09 {
	public void test1() {
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(i);
			if (i == 3 )
//				break;
				return; // ��ȯ�Ǵ� ���� ����
		}
		System.out.println("test1 ����"); // ������� ����
	}
	public int test2() {
		int n = 10;
		if (n > 100)
			return 100;	
		
		return 10;
	}
	public String test3() {
		int num = 100;
		
		if(num > 10)
			return "���ڿ�";
		else
			return "100";
	}
//	public String test4() {
//		return "aaa", "bbb", "ccc";
//	}
}
