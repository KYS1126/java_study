package test.ch07.package2;

public class Q5_Ex8 {

	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		int maxNum = 0;
		
		for (int i =0; i < array.length-1; i++) {
			if (array[i] > array[i+1]) {
				maxNum = array[i];
			}
		}
		System.out.println("답" + maxNum);
		
		
		
	}

}
