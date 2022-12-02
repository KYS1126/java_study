package A22_11_24.study;

public class ThrowsEx {

	public static void main(String[] args) {
		try {
			findClass(); //메소드를 호출한 곳에서 예외처리
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void findClass() throws ClassNotFoundException { //throws는 메소드 맨 뒤에 붙여준다
		Class.forName("java.lang.String2");
		
	}

}
