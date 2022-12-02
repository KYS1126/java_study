package A22_11_22_1.study;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car(); //Car 의 대한 객체르 생성
		myCar.run(); // Car에 있는 run메소드에는 한국 타이어가 들어가있음
		
		//타이어 객체 교체
		myCar.tire1 = new kumhoTire();  //Car에서 지정한 필드에는 한국 타이어가 들어가있는데
		myCar.tire2 = new kumhoTire();	//여기서 금호 타이어로 필드를 바꿔준다.
		myCar.run();	//Car에 있는 run 메소드에는 금호 타이어가 들어가있음
				
		
	}

}
