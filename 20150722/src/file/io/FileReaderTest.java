package file.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) {
		
		// 파일로 부터 문자 데이터를 읽는 프로그램
		FileReader reader = null;
		try {
			// 1. 파일 열기
			reader = new FileReader("poem.txt");
			
			// 2. 파일로 부터 데이터 읽기
			while (true) {
				int c = reader.read();
				if (c == -1) {
					break;
				}
				System.out.print((char) c);
			}
			
		} catch (FileNotFoundException e) {
			// 파일이 존재하지 않는 경우
			System.out.println("지정한 파일이 존재하지 않습니다.");
		} catch (IOException e) {
			// read() 중에 예외
			e.printStackTrace();
		} finally {
			// 3. 파일 닫기
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {}
			}
		}
		
	}
	
}
