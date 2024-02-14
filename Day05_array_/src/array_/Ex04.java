package array_;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = new int[] {100, 200, 300} ;
		double[] dos = {1.11, 2.22, 3.33};
		String[] str = {"안녕", "하세요"};
		
		int i = 0;
		for (int num : arr) {
			System.out.println("arr 배열 " + i + "번째 : " + num);
			i++;
		}
		i = 0;
		for (double dou : dos) {
			System.out.println("dos 배열 " + i + "번째 : " + dou);
			i++;
		}
		i = 0;
		for (String s : str) {
			
			System.out.println("str 배열 " + i + "번째 : " + s);
			i++;
		}
	}

}
