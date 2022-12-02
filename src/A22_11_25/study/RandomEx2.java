package A22_11_25.study;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int i=0; i<=5; i++) {
			//nextInt(n) : int타입의 난수를 출력 (n -> 0 부터 n까지의 숫자)
			System.out.println(rand.nextInt(10));
		}
		
		System.out.println("=================");
		
//		seed값 넣어주기
		Random rand2 = new Random(11);
		for (int i=0; i <= 5; i++) {
			System.out.println(rand2.nextInt(10));
		}
		
	}

}
