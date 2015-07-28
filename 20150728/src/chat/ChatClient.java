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
			
			// in/out 객체 생성
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			// writer/reader 객체 생성
			PrintWriter writer = new PrintWriter(out);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));
			
			scanner = new Scanner(System.in);
			
			while (true) {
				System.out.println("전송할 데이터 (종료를 원하면 quit 입력):");
				String data = scanner.nextLine();
				if (data == null	// ctrl + z 눌렀거나
						|| data.equals("quit")) {	// "quit" 입력했을 때
					System.out.println("종료합니다.");
					break;
				}
				// 데이터 보내기
				writer.println(data);
				writer.flush();
				
				// 데이터 받기
				data = reader.readLine();
				if (data == null) {
					System.out.println("접속이 종료되었습니다.");
					break;
				}
				System.out.println("서버: " + data);
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
























