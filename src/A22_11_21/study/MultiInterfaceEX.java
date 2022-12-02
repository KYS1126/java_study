package A22_11_21.study;

public class MultiInterfaceEX {

	public static void main(String[] args) {
		ReomoteControl2 rc = new SmartTelevision(); //자동 형변환
		rc.turnOn();
		rc.turnOff();
		
		Serchable searchable = new SmartTelevision();
		
		searchable.search("www.naver.com");
		
	}

}
