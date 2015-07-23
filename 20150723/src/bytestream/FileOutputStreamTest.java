package bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	
	public static void main(String[] args) {
		FileOutputStream out = null;
		
		byte[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
						10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		
		try {
			// 1. 파일에 바이트 데이터를 쓸 수 있는 스트림 생성
			out = new FileOutputStream("output.dat");
			// 2. 바이트 단위의 데이트 쓰기
			for (int i = 0; i < arr.length; i++) {
				out.write(arr[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 스트림 닫기
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
