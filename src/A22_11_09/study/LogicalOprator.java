package A22_11_09.study;

public class LogicalOprator {

	public static void main(String[] args) {
		int charCode = 'A';

		// 앞에 연산이 거짓이여도 뒤에껄 연산한다.
		if ((65 <= charCode) & (charCode <= 90)) { // 60~90까지
			System.out.println("대문자 이군요.");
		}

		if ((97 <= charCode) && (charCode <= 122)) { // 97~122까지
			System.out.println("소문자 이군요.");
		}

		if ((48 <= charCode) && (charCode <= 57)) { // 48~57까지
			System.out.println("0~9 이군요.");
		}

		int value = 6;
		// 앞이 거짓이여도 뒤를 계산함
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2또는 3의 배수");
		}
		// 앞이 참이면 더이상 계산 안함.
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2또는 3의 배수");
		}

		
	}

}
