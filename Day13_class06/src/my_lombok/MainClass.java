package my_lombok;

public class MainClass {
	public static void main(String[] args) {
		MainDTO d = new MainDTO();
		d.setName("ȫ�浿");
		d.setAge(2);
		
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d); //��ü�� ���� ����
	}

}
