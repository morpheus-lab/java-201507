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
				// 소켓으로부터 데이터 읽기
				String data = reader.readLine();
				
				if (data == null) {	// 접속 종료됐을 때
					break;
				}
				
				// 화면에 출력
				System.out.println("수신> " + data);
			} catch (IOException e) {
//				e.printStackTrace();
			}
		}
		synchronized (this) {
			this.notifyAll();
		}
	}
	
}
