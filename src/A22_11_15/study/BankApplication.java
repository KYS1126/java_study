package A22_11_15.study;

import java.util.Scanner;

public class BankApplication {
	private static Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
	
	// 만든 계좌를 넣을 배열임. 즉 만든 Account 객체를 담을 배열임
	private static Account[] accountArray = new Account[100]; 
	
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료"  );
			System.out.println("-------------------------------------------");
			System.out.println("선택>");
			//입력 받을값을 넣어줄 변수가 필요하다(숫자형의 값을 넣어줄꺼임)
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) createAccount();
			else if (selectNo == 2) acountList();
			else if (selectNo == 3) depoist();
			else if (selectNo == 4) withdraw();
			else if (selectNo == 5) run = false;
		}		
		
		System.out.println("프로그램 종료");
	
	}
	
	//1.계좌생성
	public static void createAccount () {
		System.out.println("---------------");
		System.out.println("계좌생성");
		System.out.println("---------------");
		
		System.out.println("계좌번호:");
		String ano = scanner.next(); //String형으로 받는다.
	
		System.out.println("계좌주:");
		String owner = scanner.next();
		
		System.out.println("초기입금액:");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance); //계좌 만들기
		
		//계좌를 배열에 담는법
		for(int i=0; i<accountArray.length; i++) {
			if (accountArray[i] == null) { //싹다 널인 상태인데 널이면 넣는다는 뜻임 ㅇㅋ? 그럼 2번째 생성할떄는 널이 아니겠지?
				accountArray[i] = newAccount; //여기서 개좌가 배열에 들어간다.
				System.out.println("결과: 계좌가 생성되었습니다.");
				break; //계좌를 넣고 for 반복문을 끝낸다.
			} 
		}
	}
	//2.계좌목록
	public static void acountList () {
		System.out.println("-----------------");
		System.out.println("계좌목록");
		System.out.println("-----------------");
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.print(accountArray[i].getAno());
				System.out.print(" ");
				System.out.print(accountArray[i].getOwner());
				System.out.print(" ");
				System.out.println(accountArray[i].getBalance());
			} else if (accountArray == null) {
				break;
			}
		}
	}
	//3.예금
	//계좌번호가 일치한다면 예금액을 입력할수있게 만들기
	public static void depoist () {
		System.out.println("-----------------");
		System.out.println("예금");
		System.out.println("-----------------");
		System.out.println("계좌번호:");
		String userAno = scanner.next();
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				if (!userAno.equals(accountArray[i].getAno()) ) {
					System.out.println("계좌번호를 확인하시오");
				} else if (userAno.equals(accountArray[i].getAno()) ) {
					System.out.println("예금액");
					int userBalance = scanner.nextInt();
					accountArray[i].setBalance(accountArray[i].getBalance() + userBalance);
					System.out.println(accountArray[i].getBalance());
				}
			}
		}		
	}
	
	//4.출금
	public static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.println("계좌번호:");
		
		String userAno = scanner.next();
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				if (!userAno.equals(accountArray[i].getAno()) ) {
					System.out.println("계좌번호를 확인하시오");
				} else if (userAno.equals(accountArray[i].getAno()) ) {
					System.out.println("출금액");
					int userBalance = scanner.nextInt();
					accountArray[i].setBalance(accountArray[i].getBalance() - userBalance);
					System.out.println(accountArray[i].getBalance());
				}
			}
		}
		
	}
	
}
