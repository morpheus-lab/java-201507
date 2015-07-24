package criticalsection;

public class PrintThread extends Thread {
	
	SharedArea sharedArea;
	
	public PrintThread(SharedArea area) {
		sharedArea = area;
	}
	
	@Override
	public void run() {
		for (int cnt = 0; cnt < 3; cnt++) {
			synchronized (sharedArea) {
				int sum = sharedArea.account1.balance
						+ sharedArea.account2.balance;
				System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è: " + sum);
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {}
		}
	}
	
}
