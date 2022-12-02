package test.ch07.package2;

public class Q4_Ex2 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		int result = 0;
		for (i=0; i <= 100; ++i) {
			sum += i;
			if (i % 3 == 0) {
				result += i;
			}
		}
		System.out.println(sum);
		System.out.println(result);
		
		
		
	}

}
