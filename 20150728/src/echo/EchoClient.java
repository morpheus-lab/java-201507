package echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
	
	public static void main(String[] args) {
		
		Socket s = null;
		try {
			s = new Socket("127.0.0.1", 3000);
			
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			
			// 데이터 보내기
			out.write("Hello!".getBytes());
			
			// 데이터 받기
			byte[] data = new byte[1024];
			int size = in.read(data);
			
			System.out.println("서버: " + new String(data, 0, size));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (s != null) {
				try {
					s.close();
				} catch (IOException e) {}
			}
		}
		
	}
	
}
























