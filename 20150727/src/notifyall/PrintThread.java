package notifyall;

public class PrintThread extends Thread {
	
	SharedArea sharedArea;
	
	@Override
	public void run() {
		if (!sharedArea.isReady) {
			try {
				synchronized (sharedArea) {
					sharedArea.wait();	// �����尡 ���⼭ ������ ä ���
				}
			} catch (InterruptedException e) {	// ������ ���� ��ȣ �߻� ��
				e.printStackTrace();
			}
		}
		System.out.println(sharedArea.result);
	}
	
}
