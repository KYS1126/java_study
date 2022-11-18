package A22_11_17.study;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff(); //이륙이라고 찍는다.
		sa.fly();  // 일반비행이라고 찍는다
		sa.flyMode = SupersonicAirplane.SUPERSONIC;  //상수 불러오는법 클래스명.상수
		sa.fly();  // 일반비행이라고 찍는다
		
		
		
	}

}
