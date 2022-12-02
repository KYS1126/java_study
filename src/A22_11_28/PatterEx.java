package A22_11_28;

import java.util.regex.Pattern;

public class PatterEx {

	public static void main(String[] args) {
		
		//ex-02-222-222
		//ex-010-2222-2222
		
		//010|02 -> 010또는 02
		String regExp = "(010|02)-\\d{3,4}-\\d{4}"; //패턴을 넣을 문자열 ,전화번호 체크
		String data = "010-123-1245";
		
		//Pattern.matches(정해놓은 패턴, 검증하고 싶은 데이터);
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result);
		
		//이메을 표현하는 정규 표현식
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "test@naver.com";
	    result = Pattern.matches(regExp, data);
		
		
		
		
		
		
	}

}
