package notifyall;

public class LuxuryPrintThread extends Thread {
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
		System.out.println("*** ¥ð = " + sharedArea.result + " ***");
	}
}
