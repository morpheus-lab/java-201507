package videoshop;

import java.util.ArrayList;

import com.sun.swing.internal.plaf.synth.resources.synth;

public class VideoShop {
	
	ArrayList<String> videos;
	
	public VideoShop() {
		videos = new ArrayList<>();
		
		videos.add("�������-1");
		videos.add("�������-2");
		videos.add("�������-3");
		videos.add("�������-4");
		videos.add("�������-5");
	}
	
	// ���� �����ִ� �޼ҵ�
	public synchronized String rendVideo() {
		String video = null;
		// ��� �ִ� ��쿡��
		if (videos.size() > 0) {
			// ���� ��� ������κ��� ������ �ϳ� ������ ������
			video = videos.remove(0);
		}
		return video;
	}
	
	// ������ �ݳ��޴� �޼ҵ�
	public synchronized void returnVideo(String video) {
		// �ݳ����� ������ �ٽ� ���� ��� ��Ͽ� ����
		videos.add(video);
		
		this.notifyAll();
	}
	
}























