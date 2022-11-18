package A22_11_15.study;

public class Max {

	public static int max(int[] arr) {  //매개변수로 배열 받는법
		if (arr == null || arr.length == 0) { //배열의 크기를 구하는법
			return -999999;
		}
		
		int total = 0;
		
		for (int i=0; i < arr.length-1; i++) { //인덱스 번호 하나씩 뽑기
				System.out.println(i);
			if (arr[i] > arr[i+1]) {
				total = arr[i];
//				System.out.println(total);
			} else if (arr[i] > arr[i+1]) {
				total = arr[i+1];
//				System.out.println(total);

			}
		}
		return total;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
	}
		


}
