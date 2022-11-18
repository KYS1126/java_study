package A22_11_15.study;

public class Max2 {

	 int[] data;
	 int[] arr;
	 static int data2 = -999999;
	
	static int max (int[] data) {
		int total = 0;
		if (data == null) {
			return data2;
		}
		
		for(int i=0; i < data.length-1; i++) {
			if (data[i] > data[i+1]) {
				data[i] = data[i];
			} else if (data[i] < data[i+1]) {
				data[i] = data[i+1];
			}
			total = data[i];
		}
		return total;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
//		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
	}
		


}
