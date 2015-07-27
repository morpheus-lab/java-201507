package criticalsection;

public class TransferThread extends Thread {
	
	SharedArea sharedArea;
	
	public TransferThread(SharedArea area) {
		sharedArea = area;
	}
	
	@Override
	public void run() {
		for (int cnt = 0; cnt < 12; cnt++) {
			sharedArea.transfer(1000000);
		}
	}
	
}
