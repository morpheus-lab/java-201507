package socket;

import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		Socket sock = new Socket("127.0.0.1", 9000);
		
		System.out.println("서버로 연결 완료");
		
	}
	
}
