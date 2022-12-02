package test.ch06.exam01.pakage2;

public class sound {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int sum1 = 0; //합계
		int sum2 = 0; //평균
		
		for (int i=0; i <=arr.length-1; i++) {
			sum1 += arr[i];
		}
		sum2 = sum1 / arr.length;
		
		System.out.println(sum1); //합계
		System.out.println(sum2); //평균

		
	}

}
