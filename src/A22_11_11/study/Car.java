package A22_11_11.study;

public class Car {
	//1.필드 선언 : 객체의 데이터를 저장
	String company = "현대 자동차";
	String model ;
	String color ;
	int maxSpeed ;
	int speed;
//	boolean start; //시동여부
	
	//overloading 생성자를 여러개 만드는것
	Car(String model) {
//		this.model = model;
		this(model, "은색", 250); //중복되는 코드가 많을때 씀
	}
	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed, int speed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
	//생성자 선언, 이름은 항상 클래스 이름이랑 같게한다.
	//자바에서는 생성자를 명시하지 않으면 컴파일 과정에서 생성자를 생성해준다.
	Car(String model, String color, int maxSpeed) {
		//this 현재 Car라는 객체 안에있는 model을 지정한다.
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
