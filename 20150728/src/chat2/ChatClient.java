package chat2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
	
	public static void main(String[] args) {
		
		Socket s = null;
		try {
			s = new Socket("192.168.1.2", 3000);
			
			// in/out ��ü ����
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			// writer/reader ��ü ����
			PrintWriter writer = new PrintWriter(out);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));
			
			ReadThread rt = new ReadThread(reader);
			WriteThread wt = new WriteThread(writer, rt);
			
			rt.start();
			wt.start();
			
			synchronized (rt) {
				rt.wait();
			}
			
		} catch (IOException e) {
//			e.printStackTrace();
		} catch (InterruptedException e) {
//			e.printStackTrace();
		} finally {
			if (s != null) {
				try {
					s.close();
				} catch (IOException e) {}
			}
		}
		
		System.out.println("ä�� Ŭ���̾�Ʈ ���α׷��� �����մϴ�.");
	}
	
}
























