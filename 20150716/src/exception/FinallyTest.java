package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {
	
	public static void main(String[] args) {
		
		String fileName = "D:\\test.txt";
		FileInputStream infile = null;
		
		try {
			infile = new FileInputStream(fileName);
			
			int count = 0;
			int ch = -1;
			
			while ((ch = infile.read()) != -1) {	// FileInputStream.read() 메소드는 한번에 한 바이트씩 읽어 줌
				count++;
			}
			
			System.out.println(fileName + " 파일의 크기는 " + count + "바이트입니다.");
		} catch (FileNotFoundException e) {
			// infile 객체 생성 도중 예외 발생
			System.err.println(fileName + " 파일이 존재하지 않습니다.");
		} catch (IOException e) {
			// infile.read() 도중 예외 발생
			System.err.println(fileName + " 파일로부터 데이터를 읽는 중에 예외가 발생했습니다.");
		} finally {
			System.out.println("파일 닫기 시도");
			if (infile != null) {
				try {
					infile.close();
				} catch (IOException e) {}
			}
		}
		
	}
	
}
