package A22_11_24.study;

public class ExceptionEx3 {

	public static void main(String[] args) {
		String[] array = {"100" , "1oo"};
		
		for (int i=0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]); //Integer.parseInt-> int형 으로 바꿔주눈 코드
				System.out.println("array[" + i + "]" + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		
	}

}
