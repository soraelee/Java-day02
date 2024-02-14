package Quiz_array_;

public class Quiz_team1 {
	public static void main(String[] args) {
		String arr[] = new String[] {"a", "b", "c", "d", "e"};
		
		String[] brr = (String[])arr.clone();
		
		for (int i = (arr.length - 1) ; i >= 0 ; i--) {
			brr[brr.length - i - 1] = arr[i];
		}
		for (String b : brr)
			System.out.println(b);
	}

}
