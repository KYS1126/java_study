package A22_11_11.study;

//Car라는 객체를 만들었다.
//쉽게말해 설계도를 만든다. new는 설계도로 물건을 생성한다.
//생성자 오버로드 -> 한 객체로 여러개의 생성자를 만드는것
//생성자 오버로드 -> 매개변수의 타입 개수 순서중에 하나가 달라야함.

public class Car {
	//1.필드 선언 : 객체의 데이터를 저장
	String company = "현대 자동차";
	String model ;
	String color ;
	int maxSpeed ;
	int speed;
	static int numbering;
//	boolean start; //시동여부
	
	//선언하지 않으면 자동으로 생성됨
	//자동차의 넘버링을 차례대로 붙여야 할때
	Car () {
		numbering++;
	}
	
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
	//자바에서는 매개변수를 인식해서 자동을 실행해준다.
	//
	Car(String model, String color, int maxSpeed) {
		//this 현재 Car라는 객체 안에있는 model을 지정한다.
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
