package criticalsection;

public class SharedArea {
	
	Account account1;	// ÀÌ¸ù·æ °èÁÂ
	Account account2;	// ¼ºÃáÇâ °èÁÂ
	
	// ÀÌ¸ù·æ °èÁÂ¿¡¼­ amount Ãâ±İÇÏ°í, ¼ºÃáÇâ °èÁÂ·Î amount ÀÔ±İ
	public synchronized void transfer(int amount) {
//		synchronized (this) {
			account1.withdraw(amount);
			System.out.print("ÀÌ¸ù·æ °èÁÂ: " + amount + "¿ø ÀÎÃâ, ");
			account2.deposit(amount);
			System.out.println("¼ºÃáÇâ °èÁÂ: " + amount + "¿ø ÀÔ±İ");
//		}
	}
	
	// µÎ °èÁÂÀÇ ÇÕ
	public synchronized int getTotal() {
//		synchronized (this) {
			int sum = account1.balance
					+ account2.balance;
			return sum;
//		}
	}
	
}
