package A22_11_10;

public class StringMethod {

	public static void main(String[] args) {
		String ssn = "9506241230123"; //주민번호
		char sex = ssn.charAt(6); //인덱스 번호
		int length = ssn.length(); //문자열의 길이
		
		if (length == 13) {
			System.out.println("주민번호 자릿수가 맞습니다");
		} else {
			System.out.println("주민번호 자릿수가 맞지 안습니다.");
		}
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		 
		} 
		
//		============================================
		
		String oldStr = "자바 문자열";
		//replace 문자열 내에서 문자를 지정하여 수정하기
		String newStr = oldStr.replace("자바", "0");
		System.out.println(oldStr);
		System.out.println(newStr);
		
//		============================================
		String ssn1 = "950624-1230123";
		//substring 은 짤라주는 메소드
		String firstName = ssn.substring(0, 6);
		System.out.println(firstName);
		
	
		String secondName = ssn.substring(7);
		System.out.println(secondName);
	
//		============================================
		
		String subject = "자바 프로그래밍";
		//시작하는 인덱스 번호를 찾아준다.
		//문자열이 없으면 -1
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
//		String substring = subject.substring(location);
//		System.out.println(subject);
		
		if(location != -1) {
			System.out.println("해당 문자열이 없습니다.");
		};
		
		//contains 해당 문자열이 있으면 트루, 아니면 펄스로 답해줌
		boolean result = subject.contains("자바");
		
		if (result) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련없는 책입니다.");			
		}
		
//		==============================================
		String board = "1, 자바 학습, 참조 타입String 공부중";
		
		//split 분리하고 싶은 기준을 넣어준다. 그리고 배열화함
		String[] tokens = board.split(",");
		
		for (int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		
		
	}

}
