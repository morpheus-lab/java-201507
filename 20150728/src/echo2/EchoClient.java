package echo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
	
	public static void main(String[] args) {
		
		Socket s = null;
		try {
			s = new Socket("127.0.0.1", 3000);
			
			// in/out 객체 생성
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			// writer/reader 객체 생성
			PrintWriter writer = new PrintWriter(out);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));
			
			// 데이터 보내기
			writer.println("Hello~~~~~");
			writer.flush();
			
			// 데이터 받기
			String returnData = reader.readLine();
			
			System.out.println("서버: " + returnData);
			
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
























