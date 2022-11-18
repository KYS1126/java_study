package A22_11_15.study;




public class Account {
	//계좌라고 생각하고 만들자
	//필드
	private String ano; //계좌번호
	private String owner; //계좌주
	private int balance; //잔고
	
	//생성자
	public Account(String ano,String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		
	}
	
	public Account(String ano) {
		this.ano = ano;

		
	}
	
	//메소드
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	


}
