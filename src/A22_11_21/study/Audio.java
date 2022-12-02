package A22_11_21.study;

public class Audio implements RemoteControl{
	public int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
		
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
		
		System.out.println("현재 오디오 볼륨 :" + volume);	
	}

	private int memoryVolume; //볼륨을 기억하는 필드
	
	//디폴트 메소드는 오버라이드시 반드시 public접근 제한자를 붙여야 한다.
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("음서고 처리 합니다.");
			setVolume(RemoteControl.MIN_VOLUNE);
		}else {
			System.out.println("음서고 해제");
			setVolume(this.memoryVolume);
			
		}
		
		
		
	}

	
	
	
	
	
}
