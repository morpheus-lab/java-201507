package socket;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket sSock = new ServerSocket(9000);
		
		Socket sock = sSock.accept();
		
		System.out.println("Ŭ���̾�Ʈ�κ��� ���� ��û�� �޾� ��������");
		
	}
	
}
