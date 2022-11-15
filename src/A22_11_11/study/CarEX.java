package A22_11_11.study;

public class CarEX {

	public static void main(String[] args) {
		//1.객체 생성하기
		//생성자를 만들었으면 괄호안에 지정해줘야한다.
		//new Car(객체가 생성되는 순간) 실행된다.
		//2.사실 객체라는 말보다는 인스턴스라는 말이 더 정확하다.
		//인스턴스 = 객체를 할당받은 상태
		
		Car myCar = new Car("그랜저","검정", 250);
		
//		System.out.println(myCar.model);
//		System.out.println(myCar.company);
//		System.out.println(myCar.model);
//		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.numbering);
		System.out.println("=================");
		
		
		myCar.speed = 60; //필드 변경
		System.out.println("수정된 값: " + myCar.speed);
		System.out.println(myCar.numbering);
		System.out.println("=================");

		Car car2 = new Car("자가용");
		System.out.println(car2.model);
		System.out.println(car2.numbering);
		
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.numbering);
	}

}
