package A22_11_24.study;

public class ExecptionEx2 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");  //참고: 주어진 클래스를 찾는 코드다
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
