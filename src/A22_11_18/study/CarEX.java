package A22_11_18.study;

public class CarEX {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.tire = new Tire(); //car에 있는 tire 필드를 호출한다.
		myCar.run();
		myCar.tire = new HankooTire(); //갈아 끼우려면 객체만 교체해준다.
		myCar.run();
		myCar.tire = new KumhoTire();
		myCar.run();
		//자식 클래스에서는 오버라이드만 사용 가능하고 오버라이드가 우선순위가 가장 높다.
		
		
		
		
	}

}
