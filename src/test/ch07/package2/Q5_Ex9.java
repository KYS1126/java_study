package test.ch07.package2;

public class Q5_Ex9 {
	
	public static void main(String[] args) {
		
	int[][] array = {
		      {95, 86},
		      {83, 92, 96},
		      {78, 83, 93, 87, 88}
		};

	int sum = 0;
	int sum1 = 0;
	
	for (int i = 0; i < array.length; i++) {
	 for (int k = 0; k < array[i].length; k++) {
		 sum += array[i][k];
		 sum1 += (array[i].length)-array[i].length+1;
	 }
	}
	System.out.println(sum);
	System.out.println(sum / sum1);
	

	
}
}
