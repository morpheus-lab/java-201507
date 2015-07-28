package chat2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		Socket s = null;
		try {
			ss = new ServerSocket(3000);
			s = ss.accept();
			// ���� �Ϸ�
			// in/out stream ����
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			// ���� ��Ʈ�� ����
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));
			PrintWriter writer = new PrintWriter(out);
			
			ReadThread rt = new ReadThread(reader);
			WriteThread wt = new WriteThread(writer, rt);
			
			rt.start();
			wt.start();
			
			// rt�� wt�� ����� �� ���� ���
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
					// Ŭ���̾�Ʈ�� ����� ���� �ݱ�
					s.close();
				} catch (IOException e) {}
			}
			if (ss != null) {
				try {
					// ���� ���� �ݱ�
					ss.close();
				} catch (IOException e) {}
			}
		}
		
		System.out.println("ä�� ���� ���α׷��� �����մϴ�.");
	}
	
}























