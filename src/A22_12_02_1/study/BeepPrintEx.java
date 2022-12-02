package A22_12_02_1.study;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		//비프음 만드는 애
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i=0; i<5; i++) {
			toolkit.beep(); //빔 소리를 냄
			try {
				Thread.sleep(500); //1000이 1초임
			} catch(Exception e) {
				
			}	
		}
		
		for (int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); //1000이 1초임
			} catch(Exception e) {
				
			}	
		}
		
		
		
		
	}

}
