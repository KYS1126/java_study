package A22_11_21.study;

public class Television implements RemoteControl{
	
	private int volume;

	//인터페이스에 정의된 추상 메소드는 반드시 구현을 해줘야 한다.
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUNE) {
			this.volume = RemoteControl.MAX_VOLUNE;
		} else if (volume < RemoteControl.MIN_VOLUNE) {
			this.volume = RemoteControl.MIN_VOLUNE;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨 :" + volume);
	}
	
	
	
}
