package videoshop;

import java.util.ArrayList;

import com.sun.swing.internal.plaf.synth.resources.synth;

public class VideoShop {
	
	ArrayList<String> videos;
	
	public VideoShop() {
		videos = new ArrayList<>();
		
		videos.add("쥬라기월드-1");
		videos.add("쥬라기월드-2");
		videos.add("쥬라기월드-3");
		videos.add("쥬라기월드-4");
		videos.add("쥬라기월드-5");
	}
	
	// 비디오 빌려주는 메소드
	public synchronized String rendVideo() {
		String video = null;
		// 재고가 있는 경우에만
		if (videos.size() > 0) {
			// 비디오 재고 목록으로부터 비디오를 하나 꺼내서 빌려줌
			video = videos.remove(0);
		}
		return video;
	}
	
	// 비디오를 반납받는 메소드
	public synchronized void returnVideo(String video) {
		// 반납받은 비디오를 다시 비디오 재고 목록에 삽입
		videos.add(video);
		
		this.notifyAll();
	}
	
}























