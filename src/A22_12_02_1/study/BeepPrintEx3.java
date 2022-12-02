package A22_12_02_1.study;

import java.awt.Toolkit;

public class BeepPrintEx3 {

	public static void main(String[] args) {
		// Runnable : 스레드 실행을 위한 인터페이스
		Thread thread = new Thread() {
			// run():실제 스레드가 실행되는 코드
			@Override
			public void run() {
				// 비프음 만드는 애
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep(); // 빔 소리를 냄
					try {
						Thread.sleep(500); // 1000이 1초임
					} catch (Exception e) {

					}
				}
			}
		};

		thread.start(); // 스레드 시작

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 1000이 1초임
			} catch (Exception e) {

			}
		}

	}

}
