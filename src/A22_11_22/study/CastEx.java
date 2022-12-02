package A22_11_22.study;

public class CastEx {

	public static void main(String[] args) {
//		Vehicle vehicle = new Bus();  //자동 타입변환(형변환)
//		
//		vehicle.run();
		
		//오버로드 한것만 쓸수있기때문에 강제 형변환을 시켜줘야 한다.
//		자식 자식 은 자식 부모변수
//		Bus bus = (Bus) vehicle;
//		bus.run();
//		bus.checkFare(); // 강제 형변환을 통해서 사용가능
	
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		//스태틱이라서 객체를 따로 생성 안해도 괜찮음
		ride(taxi);
		ride(bus);
	}
	
	public static void ride(Vehicle vehicle) {
		//vehicle 가 Bus 객체를 가지고 있냐, Vehicle vehicle = new Bus();이 맞는지 확인
		if (vehicle instanceof Bus) { //해당 객체를 참조하고 있는지 물어보는 명령어
			Bus bus = (Bus) vehicle;
			bus.checkFare(); // 강제 형변환을 통해서 사용가능
		}
	}
	
	
	
}
