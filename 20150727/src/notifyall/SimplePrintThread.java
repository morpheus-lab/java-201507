package notifyall;

public class SimplePrintThread extends Thread {
	
	SharedArea sharedArea;
	
	@Override
	public void run() {
		if (!sharedArea.isReady) {
			try {
				synchronized (sharedArea) {
					sharedArea.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("%.2f\n", sharedArea.result);
	}
	
}
