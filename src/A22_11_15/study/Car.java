package A22_11_15.study;

public class Car {
	String company = "현대 자동차";
	String model ;
	String color ;
	int speed;
	int maxSpeed ;
	
	
	public Car (String model, String color, int speed, int maxSpeed) {
		System.out.println(this.company);
		this.model = model;
		System.out.println(this.model);
		this.color = color;
		System.out.println(this.color);
		this.speed = speed;
		System.out.println(this.speed);
		this.maxSpeed = maxSpeed;
		System.out.println(this.maxSpeed);
	}
	
	
}
