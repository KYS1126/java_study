package A22_12_02_1.study;

import java.awt.Toolkit;

public class BeepPrintEx4 extends Thread{ //스레드 상속받기

//	run() : 실제 쓰레드가 실행되는 코드
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

	public static void main(String[] args) {
		
		Thread th = new BeepPrintEx4(); //갹체 생성하기
		th.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 1000이 1초임
			} catch (Exception e) {

			}
		}
		
		
		
		
		
	}


}
