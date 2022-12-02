package A22_11_26.study;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date(); //현재 날짜와 시간 생성
		System.out.println(now); // Date 객체
		String strNow1 = now.toString();
		System.out.println(strNow1); //문자열 변경
		
		//생성자 매개변수에 open API를 보고 넣어준다. 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now); //Date 객체를 넣어준다.
		System.out.println(strNow2);
		
	}

}
