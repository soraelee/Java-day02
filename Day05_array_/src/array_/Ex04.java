package array_;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = new int[] {100, 200, 300} ;
		double[] dos = {1.11, 2.22, 3.33};
		String[] str = {"�ȳ�", "�ϼ���"};
		
		int i = 0;
		for (int num : arr) {
			System.out.println("arr �迭 " + i + "��° : " + num);
			i++;
		}
		i = 0;
		for (double dou : dos) {
			System.out.println("dos �迭 " + i + "��° : " + dou);
			i++;
		}
		i = 0;
		for (String s : str) {
			
			System.out.println("str �迭 " + i + "��° : " + s);
			i++;
		}
	}

}
