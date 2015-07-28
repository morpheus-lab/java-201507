package chat2;

import java.io.PrintWriter;
import java.util.Scanner;

public class WriteThread extends Thread {
	
	private PrintWriter writer;
	private ReadThread rt;
	
	public WriteThread(PrintWriter writer, ReadThread rt) {
		this.writer = writer;
		this.rt = rt;
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String data = sc.nextLine();
			
			if (data == null || data.equals("quit")) {
				break;
			}
			
			writer.println(data);
			writer.flush();
		}
		sc.close();
		synchronized (rt) {
			rt.notifyAll();
		}
	}
	
}
