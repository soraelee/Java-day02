package string;

public class Ex03 {
	public static void main(String[] args) {
		//���� ������ �� �� ���� �߻�
		String str = "test     ";
		
		System.out.println("str : "+ str);
		System.out.println(str.equals("test"));
		
		//��ó�� �� ��
		String result = str.trim(); //������ ������ ��� ����
		
		System.out.println("result : " + result);
		System.out.println(result.equals("test"));
		
		
		String addr = "05214 ����� ���Ϸ�4567"; //split : Ư�� ���ڸ� �������� �ڸ�
		System.out.println(addr);
		
		String[] split = addr.split(" "); //�ϳ��� �迭�� ��Ÿ�� //�ڸ� ���ڸ� �ȿ� ����
		for (int i = 0; i < split.length ; i++) {
			System.out.println(i + ". " + split[i]);
		}
		
		//replace
		String phone = "010-1234-5678";
		System.out.println("phone : " + phone);
		String rep = phone.replace("-", "a");
		System.out.println("rep : " + rep);
		
		
		phone = "1234";
		//web���� �ԷµǴ� ������ ��� ���ڿ� => ����?
		System.out.println(phone + 100);
		
		int num = Integer.parseInt(phone);
		System.out.println(num + 100);
		
		String s = num + "";
		System.out.println(s + 100);
	}
}
