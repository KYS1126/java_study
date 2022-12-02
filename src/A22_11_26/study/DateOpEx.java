package A22_11_26.study;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOpEx {

	public static void main(String[] args) {
		LocalDateTime now =	LocalDateTime.now(); //현재 날짜 시간
		
		//데이터 포맷 형태
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.mm.dd a HH:mm:ss");
		
		System.out.println(now.format(dtf));
		
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
		System.out.println("시작일" + startDateTime);
		
	}

}
