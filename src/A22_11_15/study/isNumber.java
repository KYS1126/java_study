package A22_11_15.study;

public class isNumber {
	static String str;
	
	isNumber () {}

	//charAt = 예를들어 "안녕하세요" 하고 인덱스 번호를 써주면
	//		   해당하는 인덱스 번호에 있는 것을 char로 바꿔준다.
	
	static boolean isNumber (String str) {
		if (str == null || str.equals("")) { //null인지 빈문자열인지 판단
			return false; //null이나 빈문자면 false를 반환
		} else {
			for (int i = 0; i < str.length(); i++) {  //str의 문자열 숫자만큼
				int ascii = (int)str.charAt(i); //str에 들어가있는 문자열을 하나하나 char로 바꿔줌
				if (ascii < 48 || ascii > 57) { //아스키 코드를 이용해서 숫자인지 판별
					return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

}
