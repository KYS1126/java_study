package A22_11_17.study;

public class Computer extends Calculator {

	//오버라이드 : 부모클래스의 있는 메소드를 재정의(반환타입, 메소드 이름, 메개변수가 같아야함.)
	@Override //메소드를 재정의한다.
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r ;
	}

}
