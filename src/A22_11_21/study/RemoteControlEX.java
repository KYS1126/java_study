package A22_11_21.study;

public class RemoteControlEX {

	public static void main(String[] args) {
//		RemoteControl rc = new Television();  //자동 형변환
//		rc.turnOn(); //자동 형변환이 실행되면 오버라이드 된것을 부릅니다~
		
//		RemoteControl rc1 = new Audio();
//		rc1.turnOn();
		
		//인터페이스 만의 특징
		RemoteControl rc;
		rc = new Television(); //rc에 텔레비전을 담았다가
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		
		rc = new Audio(); //rc에 오디오로 바꿔넣는다.
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println("======================");
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(4);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		RemoteControl.changeBattery();
		
		//static의 특성을 가졌기 때문에 객체를 생성하지 않고 호출한다.
//		System.out.println(RemoteControl.MAX_VOLUNE);
//		System.out.println(RemoteControl.MIN_VOLUNE);
		
		
		
		
		
	}

}
