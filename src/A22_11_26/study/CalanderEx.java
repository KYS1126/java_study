package A22_11_26.study;

import java.util.Calendar;
import java.util.TimeZone;

public class CalanderEx {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		
		Calendar now = Calendar.getInstance(timeZone); //현재 시간과 날짜를 가져온다.
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY : strWeek = "월요일"; break;
		case Calendar.TUESDAY : strWeek = "화요일"; break;
		case Calendar.WEDNESDAY : strWeek = "수요일"; break;
		case Calendar.THURSDAY : strWeek = "목요일"; break;
		case Calendar.FRIDAY : strWeek = "금요일"; break;
		case Calendar.SATURDAY : strWeek = "토요일"; break;
		case Calendar.SUNDAY : strWeek = "일요일"; break;
		
		}
		
		System.out.println(strWeek);
		
		int amPm = now.get(Calendar.AM_PM);
		System.out.println(amPm);
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);
		
		
		//오전 오후 구별하기
		if(amPm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		
		System.out.println(now.get(Calendar.HOUR) + "," + now.get(Calendar.MINUTE));
	
		
		
	}

}
