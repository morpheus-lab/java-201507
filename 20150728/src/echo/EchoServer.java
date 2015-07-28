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
			// Ŭ���̾�Ʈ ���� ���
			ss = new ServerSocket(3000);
			
			s = ss.accept();
			
			// ���� �Ϸ�
			
			// in/out stream ����
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			
			byte[] data = new byte[1024];
			
			// Ŭ���̾�Ʈ�� ������ ������ �б�
			int size = in.read(data);
			
			System.out.println("Ŭ���̾�Ʈ: " + new String(data, 0, size));
			
			// Ŭ���̾�Ʈ�� ������ ������
			out.write(data, 0, size);
		} catch (IOException e) {
			e.printStackTrace();
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
		
	}
	
}























