package thread;

class DigitThread extends Thread {
	// 이 쓰레드가 할 일
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1);	// 현재 코드를 실행하는 쓰레드를 잠시 멈춤
			} catch (InterruptedException e) {}
		}
	}
}

public class MultiThreadExample1 {
	
	public static void main(String[] args) {
		
		// 0-9까지 출력하는 쓰레드 생성
		DigitThread dt = new DigitThread();
		// 그 쓰레드를 시작
		dt.start();
		
		// A-Z까지 출력
		for (char c = 'A'; c <= 'Z' ; c++) {
			System.out.println(c);
			try {
				Thread.sleep(1);	// 현재 코드를 실행하는 쓰레드 잠시 멈춤
			} catch (InterruptedException e) {}
		}
		
	}
	
}
