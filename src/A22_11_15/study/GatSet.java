package A22_11_15.study;

public class GatSet {
	private int speed;
	private boolean stop; //자동차가 멈췄을떄 true, 달릴때 false
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed < 0 ) {
			this.speed = 0;
			return; //리턴문을 만나면 함수를 끝냄, 보이드에서 끝내는 용도로 씀
		} else {			
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true) {
			this.speed = 0;
			}
	}
	
//	public int getspeed() {
//		return this.speed;
//	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//		
//	}
	
	
	


}
