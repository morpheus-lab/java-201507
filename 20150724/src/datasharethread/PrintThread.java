package datasharethread;

public class PrintThread extends Thread {
	
	SharedArea sharedArea;
	
	@Override
	public void run() {
		while(true) {
			if (sharedArea.isReady) {
				break;
			}
		}
		System.out.println(sharedArea.result);
	}
	
}
