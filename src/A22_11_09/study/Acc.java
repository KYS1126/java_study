package A22_11_09.study;

public class Acc {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양 :" + result);
		//오차가 조금 발생한다..
		//정확한 계산을 하려면 항상 정수로 해야한다.
		
		
		int apple1 = 1;
		int pieceUnit1 = apple1 * 10;
		int number1 = 7;
		
		int result1 = pieceUnit1 - number1;
		System.out.println("사과 1개에서 남은 양 :" + result1/10.0);
		
		int x = 5;
		double y = 0.0;
		double z = x / y;
//		double z = x % y;
		System.out.println(z);
		
		//결과값이 무한대 인지 물어보는 객체 , 결괎이 NaN인지?
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println("z");
		}
		
		
	}

}
