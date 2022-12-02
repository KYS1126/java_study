package test.ch06.exam01.pakage2;

import A22_11_22.study.Bus;

public class CastingExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new test.ch06.exam01.pakage2.Bus();
		
		vehicle.run();
				
		vehicle.run();
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.run();
			bus.checkFare();
		}		
		
	
		
	}

}
