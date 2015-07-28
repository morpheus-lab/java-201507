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
			// 연결 완료
			// in/out stream 생성
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			// 문자 스트림 생성
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));
			PrintWriter writer = new PrintWriter(out);
			
			ReadThread rt = new ReadThread(reader);
			WriteThread wt = new WriteThread(writer, rt);
			
			rt.start();
			wt.start();
			
			// rt와 wt가 종료될 때 까지 대기
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
					// 클라이언트와 연결된 소켓 닫기
					s.close();
				} catch (IOException e) {}
			}
			if (ss != null) {
				try {
					// 서버 소켓 닫기
					ss.close();
				} catch (IOException e) {}
			}
		}
		
		System.out.println("채팅 서버 프로그램을 종료합니다.");
	}
	
}























