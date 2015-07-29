package chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/*
 * 하나의 클라이언트와의 통신을 담당하는 쓰레드
 */
public class ClientHandler extends Thread {
	
	private static List<ClientHandler> ALL_CLIENTS = new ArrayList<>();
	
	private Socket sock;	// 클라이언트와 연결된 소켓
	private PrintWriter writer;
	private String nick;	// 대화명
	
	public ClientHandler(Socket sock) {
		this.sock = sock;
	}
	
	// 메시지 보내기
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
	public void run() {	// 클라이언트와의 통신 처리
		synchronized (ALL_CLIENTS) {
			ALL_CLIENTS.add(this);
		}
		
		System.out.println("[서버] " + sock.getRemoteSocketAddress()
						+ " 접속");
		
		BufferedReader reader = null;
		try {
			// 통신 준비
			reader = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			writer = new PrintWriter(sock.getOutputStream());
			
			// 대화명
			nick = reader.readLine();
			
			// xxx님이 입장하였습니다.
			sendToAll("[서버] " + nick + "님이 입장하였습니다.");
			
			while (true) {
				// 메시지 읽기
				String message = reader.readLine();
				if (message == null) {	// 접속이 끊긴 경우
					break;
				}
				// 메시지를 모든 클라이언트에게 전송하기
				sendToAll(nick + "> " + message);
			}
		} catch (IOException e) {
		} finally {
			// 접속 종료 시 클라이언트 목록으로 부터
			// this 객체 제거하기
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

























