package runnable;

public class NumbersRunnable extends Numbers
	implements Runnable {
	
	// protected void list(int start, int end) {} 를
	// Numbers로 부터 상속
	
	// Runnable 인터페이스로 부터 상속 받은 메소드
	@Override
	public void run() {
		list(1, 30);
	}
	
}
