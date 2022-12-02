package A22_11_24.study;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account(); //계좌생성
		
		
		//저축
		
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		try {
			account.withdraw(30000); //3마넌 출금
		} catch (InsuffException e) {
			String message = e.getMessage(); //에러 메세지 받기
			System.out.println(message);
		} 
		
		
		
		
	}

}
