package test;

public class Account {

	private String accountNo;
	private String name;
	private int balance;

	int[] Account = new int[100];

	Account(String accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		
	
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	void print() {
		System.out.printf("%s\t%s\t%d\n" , this.accountNo, this.name, this.balance);
	}
	
	public void deposit(String accountNo, int amount) {
		if(!this.accountNo.equals(accountNo)) {
			System.out.println("계좌번호가 일치하지 않습니다.");
			return;
		}
		if(amount < 0) {
			System.out.println("마이너스 금액은 출금할 수 없습니다.");
			return;
		}
		
		this.balance += amount;
	}
	
	public void withdraw(String accountNo, int amount) {
		if(!this.accountNo.equals(accountNo)) {
			System.out.println("계좌번호가 일치하지 않습니다.");
			return;
		}
		if(amount < 0) {
			System.out.println("마이너스 금액은 예금할 수 없습니다.");
			return;
		}
		this.balance -= amount;
	}
	
}
