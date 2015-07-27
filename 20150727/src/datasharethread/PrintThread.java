package datasharethread;

public class PrintThread extends Thread {
	
	SharedArea sharedArea;
	
	@Override
	public void run() {
		if (!sharedArea.isReady) {
			try {
				synchronized (sharedArea) {
					System.out.println("wait...");
					sharedArea.wait();	// 스레드가 여기서 정지된 채 대기
					System.out.println("awake...");
				}
			} catch (InterruptedException e) {	// 스레드 중지 신호 발생 시
				e.printStackTrace();
			}
		}
		System.out.println(sharedArea.result);
	}
	
}
