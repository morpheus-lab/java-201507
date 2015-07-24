package thread2;

class DigitThread extends Thread {
	// 이 쓰레드가 할 일
	public void run() {
		for (int i = 0; i < 10; i++) {
			// 현재 이 코드를 실행하는 쓰레드 조회
			Thread currThread = Thread.currentThread();
			
			System.out.println(i + ": " + currThread.getName());
			try {
				Thread.sleep(1000);	// 현재 코드를 실행하는 쓰레드를 잠시 멈춤
			} catch (InterruptedException e) {}
		}
	}
}

class AlphabetThread extends Thread {
	public void run() {
		// A-Z까지 출력
		for (char c = 'A'; c <= 'Z' ; c++) {
			// 현재 이 코드를 실행하는 쓰레드 조회
			Thread currThread = Thread.currentThread();
			
			System.out.println(c + ": " + currThread.getName());
			try {
				Thread.sleep(500);	// 현재 코드를 실행하는 쓰레드 잠시 멈춤
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
