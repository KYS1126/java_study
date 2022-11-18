package A22_11_18.study;

public class Car {
	//타이어 객체를 필드로 만든다.
	public Tire tire;
	
	public void run () {
		//타이어를 굴린다.
		//필드로 객체를 만들고 바로 호출
		tire.roll();
		
	}
}
