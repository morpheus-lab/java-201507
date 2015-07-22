package file.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String[] args) {
		
		// 파일에 문자 데이터를 출력하는 프로그램
		
		char[] arr = {'H','e','l','l','o',' ','F','i','l','e',' ','I','O'};
		
		FileWriter writer = null;
		try {
			// 1. 파일 열기
			writer = new FileWriter("output.txt");
			// 2. 데이터 쓰기
			for (int i = 0; i < arr.length; i++) {
				writer.write(arr[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 파일 닫기
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {}
			}
		}
		
		System.out.println("파일에 문자 기록 완료");
	}
	
}
