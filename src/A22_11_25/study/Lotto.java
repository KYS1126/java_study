package A22_11_25.study;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		//선택번호(내가 선택한 번호)
		int[] selectNumber = new int[6]; //로또번호 6개를 저장할 배열
		Random random = new Random(3);
		System.out.println("선택번호");
		
		//랜덤 숫자 6개를 생성해서 배열에 넣어줌
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) +1; // 1~45범위의 숫자로 만든다.
			System.out.println(selectNumber[i] + " ");
		}
		
		
		//당첨번호(컴퓨터에서 주는 번호)
		int[] winNumber = new int[6]; //당첨번호 6개를 저장할 배열
		Random random2 = new Random(5);
		System.out.println("당첨번호");
		
		//랜덤 숫자 6개를 생성해서 배열에 넣어줌
		for(int i=0; i<6; i++) {
			winNumber[i] = random2.nextInt(45) +1; // 1~45범위의 숫자로 만든다.
			System.out.println(winNumber[i] + " ");
		}
		
		
		//당첨여부
		Arrays.sort(winNumber); //배열 내부의 값들이 정렬된 상태로 바뀜
		Arrays.sort(selectNumber);
		
		boolean result = Arrays.equals(winNumber, selectNumber);
		System.out.println("당첨여부 : ");
		
		
		
		
	}

}
