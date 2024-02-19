package etc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeClass01 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat si = 
				new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		String s = si.format(time);
		System.out.println(s);
		
		System.out.println("-----------------");
		
		Date date = new Date();
		System.out.println( date );
		System.out.println(si.format(date));
		
	}

}
