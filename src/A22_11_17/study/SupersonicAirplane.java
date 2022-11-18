package A22_11_17.study;
	//자식
public class SupersonicAirplane extends Airplane{
	//상수
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;

	//필드
	public int flyMode = NOMAL;

	@Override //오버라이드 한게 우선순위가 높아서 이게 샐행됨
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else { //NOMAL일때			
			super.fly(); //부모 클래스에 있는 메소드를 실행한다.
		}
		
	
	}
	
	

}
