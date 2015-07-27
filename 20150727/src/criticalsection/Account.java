package criticalsection;

public class Account {
	
	String accountNo;	// ���¹�ȣ
	String ownerName;	// ������
	int balance;		// �ܾ�
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// �Ա�
	public void deposit(int amount) {
		balance += amount;
	}
	
	// ���
	public int withdraw(int amount) {
		if (balance < amount) {
			return 0;
		}
			
		balance -= amount;
		return amount;
	}
	
}
