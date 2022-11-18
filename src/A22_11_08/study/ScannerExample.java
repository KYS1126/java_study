package A22_11_08.study;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// 객체 생성하는법
		Scanner scanner = new Scanner(System.in);

		System.out.println("x값 입력: ");
		// nextLine - 엔터키를 누르면 문자열을 읽는다.
		String strX = scanner.
		// 정수형으로 강제 형변환
		int x = Integer.parseInt(strX);

		System.out.println("y값 입력: ");
		// nextLine - 엔터키를 누르면 문자열을 읽는다.
		String strY = scanner.nextLine();
		// 정수형으로 강제 형변환
		int y = Integer.parseInt(strY);

		int result = x + y;
		System.out.println("result: " + result);
		System.out.println();

		// 반복문, 무한반복
		while (true) {
			System.out.println("입력 문자열:");
			String data = scanner.nextLine();
			// equals = 비교할때 쓴다.
			if (data.equals("q")) { // 입력받은 데이터가 q인지 비교하기
				break; // q와 같으면 반복문을 종료한다.
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
	}
}
