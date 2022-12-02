package A22_11_26.study;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOpEx2 {

	public static void main(String[] args) {
		LocalDateTime now =	LocalDateTime.now(); //현재 날짜 시간
		
		//데이터 포맷 형태
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.mm.dd a HH:mm:ss");
		System.out.println(now.format(dtf));
		
		
		LocalDateTime result1 = now.plusYears(1); //1년을 더함
		System.out.println(result1.format(dtf)); //포맷함
		

		LocalDateTime result2 = now.minusMinutes(2); //1년을 더함
		System.out.println(result2); //포맷을 안함
	}

}
