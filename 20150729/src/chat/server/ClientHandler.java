package chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/*
 * �ϳ��� Ŭ���̾�Ʈ���� ����� ����ϴ� ������
 */
public class ClientHandler extends Thread {
	
	private static List<ClientHandler> ALL_CLIENTS = new ArrayList<>();
	
	private Socket sock;	// Ŭ���̾�Ʈ�� ����� ����
	private PrintWriter writer;
	private String nick;	// ��ȭ��
	
	public ClientHandler(Socket sock) {
		this.sock = sock;
	}
	
	// �޽��� ������
	public void send(String message) {
		if (writer != null) {
			writer.println(message);
			writer.flush();
		}
	}
	
	public static void sendToAll(String message) {
		synchronized (ALL_CLIENTS) {
			for (ClientHandler c : ALL_CLIENTS) {
				c.send(message);
			}
		}
	}
	
	@Override
	public void run() {	// Ŭ���̾�Ʈ���� ��� ó��
		synchronized (ALL_CLIENTS) {
			ALL_CLIENTS.add(this);
		}
		
		System.out.println("[����] " + sock.getRemoteSocketAddress()
						+ " ����");
		
		BufferedReader reader = null;
		try {
			// ��� �غ�
			reader = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			writer = new PrintWriter(sock.getOutputStream());
			
			// ��ȭ��
			nick = reader.readLine();
			
			// xxx���� �����Ͽ����ϴ�.
			sendToAll("[����] " + nick + "���� �����Ͽ����ϴ�.");
			
			while (true) {
				// �޽��� �б�
				String message = reader.readLine();
				if (message == null) {	// ������ ���� ���
					break;
				}
				// �޽����� ��� Ŭ���̾�Ʈ���� �����ϱ�
				sendToAll(nick + "> " + message);
			}
		} catch (IOException e) {
		} finally {
			// ���� ���� �� Ŭ���̾�Ʈ ������� ����
			// this ��ü �����ϱ�
			synchronized (ALL_CLIENTS) {
				ALL_CLIENTS.remove(this);
			}
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {}
			}
			if (writer != null) {
				writer.close();
			}
			if (sock != null) {
				try {
					sock.close();
				} catch (IOException e) {}
			}
		}
	}
	
}

























