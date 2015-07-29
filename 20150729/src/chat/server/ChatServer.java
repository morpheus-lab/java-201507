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
					Socket s = ss.accept();	// 클라이언트 접속 요청 받기
					ClientHandler handler = new ClientHandler(s);
					handler.start();
				} catch (IOException e) {
					System.err.println("[서버] accept() 중 오류 발생. "
							+ "다음 클라이언트를 대기합니다.");
				}
			}
		} catch (IOException e) {
			System.err.println("[서버] 서버를 시작하지 못했습니다.");
		} finally {
			if (ss != null){
				try {
					ss.close();
				} catch (IOException e) {}
			}
		}
		
		System.out.println("[서버] 서버를 종료합니다.");
	}
	
}



































