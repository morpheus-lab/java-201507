package socket;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket sSock = new ServerSocket(9000);
		
		Socket sock = sSock.accept();
		
		System.out.println("클라이언트로부터 연결 요청을 받아 연결했음");
		
	}
	
}
