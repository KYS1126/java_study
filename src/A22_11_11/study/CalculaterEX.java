package A22_11_11.study;

public class CalculaterEX {

	public static void main(String[] args) {
		//메소드와 실행자를 일단 가져온다.
		
		Calculater myCal = new Calculater();
		Calculaternext myCalc = new Calculaternext();
		
		double result3 = myCalc.areaRectangle(10);
		System.out.println(result3);
		
		double result4 = myCalc.areaRectangle(10, 20);
		System.out.println(result4);
		
		
		//객체를 가져와서 함수실행
		myCal.powerOn();
		
		//plus는 매개 변수가 있으니까 지정해줘야함.
		int result1 = myCal.plus(5, 6);
		System.out.println(result1);
		
		//매개 변수를 인트형으로 선언함, 이유는
		//divide에서 매개변수를 인트로 받는다고 설정했기떄문
		int x = 10 ,y = 4;
		double result2 = myCal.divide(x,y);
		System.out.println(result2);
		
		myCal.powerOff();
		
		
		
		
	}
	

}
