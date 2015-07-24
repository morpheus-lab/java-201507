package thread;

class DigitThread extends Thread {
	// �� �����尡 �� ��
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1);	// ���� �ڵ带 �����ϴ� �����带 ��� ����
			} catch (InterruptedException e) {}
		}
	}
}

public class MultiThreadExample1 {
	
	public static void main(String[] args) {
		
		// 0-9���� ����ϴ� ������ ����
		DigitThread dt = new DigitThread();
		// �� �����带 ����
		dt.start();
		
		// A-Z���� ���
		for (char c = 'A'; c <= 'Z' ; c++) {
			System.out.println(c);
			try {
				Thread.sleep(1);	// ���� �ڵ带 �����ϴ� ������ ��� ����
			} catch (InterruptedException e) {}
		}
		
	}
	
}
