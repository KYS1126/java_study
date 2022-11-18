package A22_11_18.study;

public class AbstractEx {

	public static void main(String[] args) {
		Dog dg = new Dog();
//		dg.sound();
		
		Cat ca = new Cat();
//		ca.sound();
		
		//매개변수의 다형성
		
		animalSound(dg);
		animalSound(ca);
		
		
		
		
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
	
	
}
