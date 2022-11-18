package A22_11_14.study;

public class Account {
	private int balance; //잔고가 저장되는곳
	public static final int MIN_BALANCE = 0;//상수(불변의 숫자, 어디서든 공유가능)
	public static final int MAX_BALANCE = 1000000;//상수(불변의 숫자, 어디서든 공유가능)
	
	//Getter, Setter 사용, 생성법은 마우스 우킬릭 -> 소스 ->Getter, Setter
	//가공해서 외부에 제공하는것
	public int getBalance() {
		return balance;
	}


	//외부에서 받아들일때 가공해서 적용하는것.
	public void setBalance(int balance) {
		//1. 0 <= balance <= 1,000,000 범위 일때 this.balance = balance;
		//2. 정상범위가 아니면 현재 balance 값을 유지.		
		
		if (balance < MIN_BALANCE) {
			balance = this.balance;
			return;
		} else if (balance > MAX_BALANCE) {
			balance = this.balance;
			return;
		} else {
			this.balance = balance;					
		}
		
	}





}
