package echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
			
			byte[] data = new byte[1024];
			
			// 클라이언트가 보내는 데이터 읽기
			int size = in.read(data);
			
			System.out.println("클라이언트: " + new String(data, 0, size));
			
			// 클라이언트로 데이터 보내기
			out.write(data, 0, size);
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























