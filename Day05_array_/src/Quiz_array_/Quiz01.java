package Quiz_array_;

public class Quiz01 {
	public static void main(String[] args) {
		//�ݺ����� �̿��ؼ� arr�� ����Ǿ� �ִ� ��¦���� ���� Ȧ���� ���� ���� ����Ͻÿ�
		int arr[] = new int[] {10, 54, 13, 17, 25, 30};

		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("¦�� : " + arr[i] );

			}
			else 
				System.out.println("Ȧ�� : " + arr[i]);

		}
		System.out.println("-----for each-----");
		for (int a : arr) {
			if (a % 2 == 0) {
				System.out.println("¦�� : " + a );

			}
			else 
				System.out.println("Ȧ�� : " + a);

		}
	}
}

