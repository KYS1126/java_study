package A22_11_10;

public class ArrayEX {

	public static void main(String[] args) {
		//배열 선언법
//		String season[] = {"Spring", "Summer", "Fall", "Winter"};
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		//일단 선언만 할수있음
//		String[] season2;
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		//재지정 가능
		season[1] = "여름";
		System.out.println(season[1]);
		System.out.println();
		
		
		int[] scores = {83, 90, 87};
		//총합, 평균 구하기
		int sum= 0;
		for(int i = 0; i<3; i++) {
			sum += scores[i];
		}
		double avg = (double) sum/3;
		System.out.println("총합="+ sum + "평균" + avg);
		
		
//		===============================================
		int[] arr1 = new int [3];
		
		for (int j = 0; j<3; j++) {
//			System.out.println(arr1[j]);
			arr1[j] = 10;
		}
		
		for (int j = 0; j<3; j++) {
			System.out.println(arr1[j]);
		}

		double[] arr2 = new double[3];
		for (int j = 0; j<3; j++) {
			System.out.println(arr2[j]);
		}
		
		String[] arr3 = new String[3];
		for (int j = 0; j<3; j++) {
			System.out.println(arr3[j]);
		}
		
//		arr3.length = 10; lengt는 값을 읽을수만 있다. 지정은 안됨 
		
		
		
		
		
		
		
		/*
		 참고용
		 디폴트값
		 int,short,byte:0
		 long:0
		 char : '\u0000'
		 float: 0.0f
		 double : 0.0
		 boolean : false
		 String: null
		 */
		
		
		
		
		
		
	}

}
