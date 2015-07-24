package thread2;

class DigitThread extends Thread {
	// �� �����尡 �� ��
	public void run() {
		for (int i = 0; i < 10; i++) {
			// ���� �� �ڵ带 �����ϴ� ������ ��ȸ
			Thread currThread = Thread.currentThread();
			
			System.out.println(i + ": " + currThread.getName());
			try {
				Thread.sleep(1000);	// ���� �ڵ带 �����ϴ� �����带 ��� ����
			} catch (InterruptedException e) {}
		}
	}
}

class AlphabetThread extends Thread {
	public void run() {
		// A-Z���� ���
		for (char c = 'A'; c <= 'Z' ; c++) {
			// ���� �� �ڵ带 �����ϴ� ������ ��ȸ
			Thread currThread = Thread.currentThread();
			
			System.out.println(c + ": " + currThread.getName());
			try {
				Thread.sleep(500);	// ���� �ڵ带 �����ϴ� ������ ��� ����
			} catch (InterruptedException e) {}
		}
	}
}

public class MultiThreadExample2 {
	
	public static void main(String[] args) {
		
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread3 = new AlphabetThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
	
}
