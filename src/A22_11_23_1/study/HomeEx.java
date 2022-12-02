package A22_11_23_1.study;

public class HomeEx {

	public static void main(String[] args) {
		Home home = new Home();
		
		home.use1();
		home.use2();
		
		home.use3(new RenoteControl () {
			@Override
			public void turnOn() {
				System.out.println("난방을 켭니다");
			}
			@Override
			public void turnOff() {
				System.out.println("난방을 끕니다");
			}
			
		});
		
	}

}
