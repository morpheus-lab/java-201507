package runnable;

public class NumbersRunnable extends Numbers
	implements Runnable {
	
	// protected void list(int start, int end) {} ��
	// Numbers�� ���� ���
	
	// Runnable �������̽��� ���� ��� ���� �޼ҵ�
	@Override
	public void run() {
		list(1, 30);
	}
	
}
