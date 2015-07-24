package runnable;

class SmallLetters /*extends ...*/ implements Runnable {
	public void run() {
		// a-z ���
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {}
		}
	}
}

public class MultiThreadExample3 {
	public static void main(String[] args) {
		
		SmallLetters sl = new SmallLetters();
		Thread small = new Thread(sl);
		small.start();
		
		// ��-�� ���
		for (char c = '��'; c <= '��'; c++) {
			System.out.print(c);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {}
		}
	}
}
