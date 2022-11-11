package A22_11_09.study;

public class OverflowUnderflow {

	public static void main(String[] args) {
		byte var1 = 125;
		//오버플로우: 타입이 허용하는 최대값을 벗어나는 것
		
		//for문이랑 똑같아 스크립트
		for(int i=0; i<5; i++) {
			var1++;
			System.out.println("var1: "+ var1);
		}
		
		
		byte var2 = -125;
		//언더 플로우: 타입이 허용하는 최소값을 벗어나는 것
		for(int i=0; i<5; i++) {
			var2--;
			System.out.println("var2: "+ var2);
		}
	
	}

}
