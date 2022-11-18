package A22_11_18.study;

public class Cat extends Animal{
	//추상 메소드를 받으면 반드시 오버라이드를 해야한다.
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
