package A22_11_22_1.study;

public class Car {
	//필드로 다형성 구현하기
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();

	//메소드
	void run () {
		tire1.roll();
		tire2.roll();
	}


}
