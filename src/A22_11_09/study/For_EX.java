package A22_11_09.study;

public class For_EX {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
//			sum = sum + i;
			sum += i;
		}
		System.out.println(sum);
		
		for (int m=2; m<=9; m++) {
			System.out.println("***" + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m*n));
			}
		}
		
		
		
		
		//한번에 두개를 선언할수있다. 바깥에 빼서 쓸수도있음.
		//단 조건식은 하나여야함.
//		for (int i=1, j=1; i<=10 && j<=10; i++, j++) {
//			System.out.println(j);
//		}
		
		
	}

}
