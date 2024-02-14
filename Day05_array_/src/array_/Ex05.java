package array_;

public class Ex05 {
	public static void main(String[] args) {
		int arr[][] = new int[][] {
			{10, 20, 30, 3},
//			0,0  0,1 0,2
			{40, 50, 60, 4},
//			1,0  1,1 1,2
			{70, 80, 90, 5}
//			2,0  2,1 2,2
		};
		
		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][0]);
		
		//배열의 길이
		System.out.println("===배열의 길이===");
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		//반복문 활용
		System.out.println("===반복문===");
		for (int i = 0 ; i < arr.length ; i++) {
			for (int k = 0; k < arr[i].length ; k++) {
				System.out.print(arr[i][k] + "  ");
			}
			
//			System.out.println(arr[i][0]);
//			System.out.println(arr[i][1]);
//			System.out.println(arr[i][2]);
//			System.out.println(arr[i][3]);
			System.out.println();
		}
	}

}
