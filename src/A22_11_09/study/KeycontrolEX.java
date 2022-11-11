package A22_11_09.study;

import java.util.Scanner;

public class KeycontrolEX {

	public static void main(String[] args) {
		//1.키보드에서 1.2를 입력했을 때 속도를 증가, 감속 시키고 3입력시 종료시키는 프로그램
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while (run) {
			System.out.println("-------------------");
			System.out.println("1.증속, 2.감소, 3.중지");
			System.out.println("-------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			//스트링값은 == 쓰면 안됨, 이퀄로 해야함
			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재속도: "+ speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재속도: "+ speed);
			} else if (strNum.equals("3")) {
				run = false;
//				break;
				System.out.println("중지");
//				continue; //다시 반복문으로 올라간다. 끝내진 않음
			}
			
			
			
			
			
		}
		
		
	}

}
