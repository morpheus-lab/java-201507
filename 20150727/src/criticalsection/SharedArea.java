package criticalsection;

public class SharedArea {
	
	Account account1;	// �̸��� ����
	Account account2;	// ������ ����
	
	// �̸��� ���¿��� amount ����ϰ�, ������ ���·� amount �Ա�
	public synchronized void transfer(int amount) {
//		synchronized (this) {
			account1.withdraw(amount);
			System.out.print("�̸��� ����: " + amount + "�� ����, ");
			account2.deposit(amount);
			System.out.println("������ ����: " + amount + "�� �Ա�");
//		}
	}
	
	// �� ������ ��
	public synchronized int getTotal() {
//		synchronized (this) {
			int sum = account1.balance
					+ account2.balance;
			return sum;
//		}
	}
	
}
