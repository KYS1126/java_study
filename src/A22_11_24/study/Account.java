package A22_11_24.study;

public class Account {
	
	//필드
	private long balance;
	
	//생성자
	public Account() {}
	
	//메소드
	public long getBalance() {
		return balance;
	}
	
	//저축 메소드
	public void deposit(int money) {
		balance += money; //잔고에 돈을 누적합
	}
	
	//출금
	public void withdraw(int money) throws InsuffException {
		//잔고보다 내가 출금하려는 돈이 더 크면 예외를 발생시킴
		if (balance < money) {
			throw new InsuffException("잔고 부족: " + (money - balance) + "원이 모자람");
			//예외가 발생하면 메소드를 끝내고 예외를 던짐(뒤는 실행 안함)
		}
		
		balance -= money;
		
		
	}
	
	
	
	
}
