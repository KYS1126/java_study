package A22_11_17.study;
	//부모
public class Airplane {
	//클래스 앞에 final을 붙이면 그 클래스는 부모 클래스로 사용할 수 없다.
//public final class Airplane {
	
	//메소드
	//메소드에 final을 붙이면 그 메소드는 Override 할 수 없다.
	public void land() {
		System.out.println("착륙");
	}
	public void fly() {
		System.out.println("일반 비행");		
	}
	public void takeOff() {
		System.out.println("이륙");
		
	}
}
