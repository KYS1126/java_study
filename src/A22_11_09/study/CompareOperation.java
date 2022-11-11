package A22_11_09.study;

public class CompareOperation {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		//서로 같나여?
		boolean result1 = (num1 == num2);
		System.out.println("result1: " + result1);
		
		
		char char1 = 'A';  //int로 바꾸면 65
		char char2 = 'b';  //int로 바꾸면 66
		boolean result2 = (char1 < char2); //큰가요?
		System.out.println("result2: " + result2);
	
		
		//int와 double을 비교,
		int num3 = 1;
		double num4 = 1.0;
		boolean result3 = (num3 == num4);
		System.out.println("result3: " + result3);
		
		
		//float는 좀 다르다.
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result4 = (num5 == num6); //정밀도가 달라서 false로 나온다.
		boolean result5 = (num5 == (float)num6); //둘다 타입을 맞춰주면 정확하게함
		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
		
		
		//String 비교법 equals를 사용
		String str1 = "자바";
		String str2 = "java";
		boolean result6 = (str1.equals(str2));
		boolean result7 = (!str1.equals(str2)); //!<=반대로 출력해라
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
		
	}

}
