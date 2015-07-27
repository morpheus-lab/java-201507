package videoshop;

public class Customer extends Thread {
	
	private VideoShop videoShop;
	
	public Customer(VideoShop videoShop) {
		this.videoShop = videoShop;
	}
	
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();
		
		// ���� �뿩
		String video = videoShop.rendVideo();
		while (video == null) {
			synchronized (videoShop) {
				try {
					System.out.println(threadName + ": ������ ���ư� ����մϴ�.");
					videoShop.wait();
					
					System.out.println(threadName + ": ������ ���Դٴ� ������ �޾ҽ��ϴ�.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			video = videoShop.rendVideo();
		}
		
		// ���� ��û
		System.out.println(threadName + ": " + video + "�� �����մϴ�.");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadName + ": " + video + " ������ ���½��ϴ�.");
		
		// ���� �ݳ�
		videoShop.returnVideo(video);
		System.out.println(threadName + ": " + video + "�� �ݳ��߽��ϴ�.");
	}
	
}
