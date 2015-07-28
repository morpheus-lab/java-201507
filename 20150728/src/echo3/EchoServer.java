package echo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		Socket s = null;
		try {
			// 클라이언트 연결 대기
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
			
			while (true) {
				// 클라이언트가 보내는 데이터 읽기
				String data = reader.readLine();
				
				if (data == null) {	// 클라이언트가 접속 끊은 상황
					System.out.println("서버를 종료합니다.");
					break;
				}
				
				System.out.println("클라이언트: " + data);
				
				// 클라이언트로 데이터 보내기
				writer.println(data);
				writer.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
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
		
	}
	
}























