package datasharethread;

public class PrintThread extends Thread {
	
	SharedArea sharedArea;
	
	@Override
	public void run() {
		if (!sharedArea.isReady) {
			try {
				synchronized (sharedArea) {
					System.out.println("wait...");
					sharedArea.wait();	// �����尡 ���⼭ ������ ä ���
					System.out.println("awake...");
				}
			} catch (InterruptedException e) {	// ������ ���� ��ȣ �߻� ��
				e.printStackTrace();
			}
		}
		System.out.println(sharedArea.result);
	}
	
}
