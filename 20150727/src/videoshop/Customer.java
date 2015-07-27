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
		
		// 비디오 대여
		String video = videoShop.rendVideo();
		while (video == null) {
			synchronized (videoShop) {
				try {
					System.out.println(threadName + ": 집으로 돌아가 대기합니다.");
					videoShop.wait();
					
					System.out.println(threadName + ": 비디오가 들어왔다는 연락을 받았습니다.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			video = videoShop.rendVideo();
		}
		
		// 비디오 시청
		System.out.println(threadName + ": " + video + "를 감상합니다.");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadName + ": " + video + " 감상을 끝냈습니다.");
		
		// 비디오 반납
		videoShop.returnVideo(video);
		System.out.println(threadName + ": " + video + "를 반납했습니다.");
	}
	
}
