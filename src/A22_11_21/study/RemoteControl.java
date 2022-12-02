package A22_11_21.study;

public interface RemoteControl {
	
	//인터페이스의 상수는 static final 안써도 상관없다.
	//인터페이스에 선언된 필드는 모두 public static final 특성을 갖는다.
	int MAX_VOLUNE = 10;
	int MIN_VOLUNE = 0;
	
	//public 추상메소드
	//public이없어도 컴파일 과정에서 자동으로 public abstract 가 자동으로 붙는다.
	//-> 추상 메소드 이므로
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드: 인터페이스에서 실행 메소드를 구현하고 싶을때 사용
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 처리 합니다.");
			setVolume(MIN_VOLUNE);
		} else {
			System.out.println("음소거 해제");
		}
	}
	
	//정적(static) 메소드
	//코드를 구현 할 수 있다.
	//public이 없어도 컴파일 과정에서 public이 붙는다.
	static void changeBattery() {
		System.out.println("건전지 교체.");
	}
	
	
	
	
	
	
}
