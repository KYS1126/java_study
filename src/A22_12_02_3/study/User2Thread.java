package A22_12_02_3.study;

public class User2Thread extends Thread{
	private Calculator calculator;
	
	
	public User2Thread() {
		setName("user2Thread"); //쓰레드의 이름 변경
	}


	public void setCalculator (Calculator calculator) {
		this.calculator = calculator;
	}

	//실제로 쓰레드가 실행되면 실행되는 코드
	//extends Thread해서 가능
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
}
