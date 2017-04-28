package prob05;

public class Account {
	private String AccountNo;
	private int balance;
	
	public Account() {}
	
	public Account(String accountNo) {
		this.AccountNo = accountNo;
		System.out.println(getAccountNo() + "계좌를 개설했습니다.");
	}

	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void save(int money) {
		this.balance += money;
		System.out.println(getAccountNo() + "계좌에 " + money + "만원이 입금되었습니다.");
	}
	
	public void deposit(int money) {
		this.balance -= money;
		System.out.println(getAccountNo() + "계좌에 " + money + "만원을 출금되었습니다.");
	}

}
