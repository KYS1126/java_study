package A22_11_17.study;

//자식 클래스
//extends Phone 쓰면 상속을 받을수있다.
public class SmartPhone extends Phone {
	//필드
	public boolean wifi;
	
	//생성자
	
	public SmartPhone(String model, String color){
		super(model, color); //부모 생성자 호출
		this.model = model; //부모에서 받은 필드에 초기값을 줄수도있다. 부모필드에 접근 가능
		this.color = color;
	}
	
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 생태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
	
}
