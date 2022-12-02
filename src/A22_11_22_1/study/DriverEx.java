package A22_11_22_1.study;

public class DriverEx {
	
	public static void main(String[] args) {
	Driver driver = new Driver(); //Driver 객체 선언
	
	Bus bus = new Bus();
	Taxi taxi = new Taxi();
	
	driver.driver(bus); //Driver 객체 안에 있는 driver 메소드 실행.
	driver.driver(taxi);//driver 매개 변수가 taxi와 bus로 바뀜.
	
		//즉 void driver(Vechicle vechicle = new bus) { //자동 형변환
		//	vechicle.run(); //추상메소드를 호출함
		//}  이것과 같다.

	}
}
