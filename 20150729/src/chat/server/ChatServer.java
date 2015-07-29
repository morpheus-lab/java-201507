package chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(3000);
			while (true) {
				try {
					Socket s = ss.accept();	// Ŭ���̾�Ʈ ���� ��û �ޱ�
					ClientHandler handler = new ClientHandler(s);
					handler.start();
				} catch (IOException e) {
					System.err.println("[����] accept() �� ���� �߻�. "
							+ "���� Ŭ���̾�Ʈ�� ����մϴ�.");
				}
			}
		} catch (IOException e) {
			System.err.println("[����] ������ �������� ���߽��ϴ�.");
		} finally {
			if (ss != null){
				try {
					ss.close();
				} catch (IOException e) {}
			}
		}
		
		System.out.println("[����] ������ �����մϴ�.");
	}
	
}



































