package criticalsection;

public class Account {
	
	String accountNo;	// 계좌번호
	String ownerName;	// 예금주
	int balance;		// 잔액
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// 입금
	public void deposit(int amount) {
		balance += amount;
	}
	
	// 출금
	public int withdraw(int amount) {
		if (balance < amount) {
			return 0;
		}
			
		balance -= amount;
		return amount;
	}
	
}
