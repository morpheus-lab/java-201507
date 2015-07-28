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
			// Ŭ���̾�Ʈ ���� ���
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
			
			while (true) {
				// Ŭ���̾�Ʈ�� ������ ������ �б�
				String data = reader.readLine();
				
				if (data == null) {	// Ŭ���̾�Ʈ�� ���� ���� ��Ȳ
					System.out.println("������ �����մϴ�.");
					break;
				}
				
				System.out.println("Ŭ���̾�Ʈ: " + data);
				
				// Ŭ���̾�Ʈ�� ������ ������
				writer.println(data);
				writer.flush();
			}
			
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























