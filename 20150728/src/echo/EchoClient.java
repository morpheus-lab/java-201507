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
			
			// ������ ������
			out.write("Hello!".getBytes());
			
			// ������ �ޱ�
			byte[] data = new byte[1024];
			int size = in.read(data);
			
			System.out.println("����: " + new String(data, 0, size));
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
























