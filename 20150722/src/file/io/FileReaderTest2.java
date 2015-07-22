package file.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {
	
	public static void main(String[] args) {
		
		// 파일로 부터 문자 데이터를 읽는 프로그램
		FileReader reader = null;
		try {
			// 1. 파일 열기
			reader = new FileReader("poem.txt");
			
			// 2. 파일로 부터 데이터 읽기
			char[] arr = new char[3];
			while (true) {
				int count = reader.read(arr);
				if (count == -1) {
					break;
				}
				// count가 2이라면,
				// arr[0] ~ arr[1]에 담겨 있는 문자들이
				// 새롭게 읽어들인 문자들이다.
				for (int i = 0; i < count; i++) {
					System.out.print(arr[i]);
				}
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
