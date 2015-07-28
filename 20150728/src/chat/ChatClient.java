package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	
	public static void main(String[] args) {
		
		Socket s = null;
		Scanner scanner = null;
		try {
			s = new Socket("127.0.0.1", 3000);
			
			// in/out ��ü ����
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			// writer/reader ��ü ����
			PrintWriter writer = new PrintWriter(out);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));
			
			scanner = new Scanner(System.in);
			
			while (true) {
				System.out.println("������ ������ (���Ḧ ���ϸ� quit �Է�):");
				String data = scanner.nextLine();
				if (data == null	// ctrl + z �����ų�
						|| data.equals("quit")) {	// "quit" �Է����� ��
					System.out.println("�����մϴ�.");
					break;
				}
				// ������ ������
				writer.println(data);
				writer.flush();
				
				// ������ �ޱ�
				data = reader.readLine();
				if (data == null) {
					System.out.println("������ ����Ǿ����ϴ�.");
					break;
				}
				System.out.println("����: " + data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (s != null) {
				try {
					s.close();
				} catch (IOException e) {}
			}
			if (scanner != null) {
				scanner.close();
			}
		}
		
	}
	
}
























