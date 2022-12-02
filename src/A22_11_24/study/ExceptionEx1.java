package A22_11_24.study;

public class ExceptionEx1 {
	public static void printLength(String data) {
		try { //실행시킬 코드를 작성
			int result = data.length(); //문자 수 뽑아오기
			System.out.println("문자 수" + result);			
		} catch (NullPointerException e) { //에러가 났을 때 실행시킬 코드를 작성
			
			//예외 처리 정보를 얻는 세가지 방법
//			System.out.println(e.getMessage()); //getMessage -> 예외가 발생한 이유만 리턴
			System.out.println(e.toString()); // toString-> 예외발생이유 + 예외의종류리턴
//			e.printStackTrace(); //printStackTrace-> 예외발생이유 + 예외의종류리턴+ 예외가발생한곳
			
		} finally {  //finally 예외처리 구문에서 얘는 없어도 상관없음.옵션임
			System.out.println("마무리 실행\n");			
		} //에러 여부와 상관없이 마지막에 무조건 실행되는 코드
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("프로그램 종료\n");
		
	}

}
