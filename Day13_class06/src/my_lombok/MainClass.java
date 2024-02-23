package my_lombok;

public class MainClass {
	public static void main(String[] args) {
		MainDTO d = new MainDTO();
		d.setName("È«±æµ¿");
		d.setAge(2);
		
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d); //°´Ã¼¿¡ ´ëÇÑ Á¤º¸
	}

}
