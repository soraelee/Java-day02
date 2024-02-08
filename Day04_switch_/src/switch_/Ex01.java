package switch_;

public class Ex01 {
	public static void main(String[] args) {
		int select = 1;
		
		switch(select) {
		case 1 : System.out.println("1 입력");//break;
		case 2 : System.out.println("2 입력");//break;
		default : System.out.println("1, 2 제외한 값");//break;
		
		}
		System.out.println("다음 문장 실행");
		
		
		
		if (select == 1) {
			System.out.println(1111);
		}
		else if (select == 2) {
			System.out.println(2222);
		}
		else
			System.out.println("그 외의 값");
	}
}
