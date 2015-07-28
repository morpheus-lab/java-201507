package chat2;

import java.io.BufferedReader;
import java.io.IOException;

public class ReadThread extends Thread {
	
	private BufferedReader reader;
	
	public ReadThread(BufferedReader reader) {
		this.reader = reader;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				// �������κ��� ������ �б�
				String data = reader.readLine();
				
				if (data == null) {	// ���� ������� ��
					break;
				}
				
				// ȭ�鿡 ���
				System.out.println("����> " + data);
			} catch (IOException e) {
//				e.printStackTrace();
			}
		}
		synchronized (this) {
			this.notifyAll();
		}
	}
	
}
