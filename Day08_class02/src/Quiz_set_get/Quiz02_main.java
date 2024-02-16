package Quiz_set_get;

public class Quiz02_main {
	public static void main(String[] args) {
		int k = 100, e = 90, m = 80;
		//객체 생성 후 각각의 값(kor, eng, math, sum, avg)저장
		//출력하세요 >> 국영수합평
		
		Quiz02_method q = new Quiz02_method();
		
		q.setKor(k);
		q.setEng(e);
		q.setMath(m);
		q.setSum(k + e + m) ;
		q.setAvg(q.getSum() / 3.0);
		
		System.out.println("국어 : " + q.getKor());
		System.out.println("영어 : " + q.getEng());
		System.out.println("수학 : " + q.getMath());
		System.out.println("합계 : " + q.getSum());
		System.out.println("평균 : " + q.getAvg());
		
		
		
	}

}
