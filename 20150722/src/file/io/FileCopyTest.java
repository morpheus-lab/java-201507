package file.io;

import java.io.*;

public class FileCopyTest {
	
	public static void main(String[] args) throws Exception {
		
		// 원본 파일 열기 (읽기용)	"poem.txt"
		FileReader reader = new FileReader("poem.txt");
		// 대상 파일 열기 (쓰기용)	"poem-copy.txt"
		FileWriter writer = new FileWriter("poem-copy.txt");
		
		// 반복 {
		while (true) {
			// 원본 파일로부터 1글자 읽고
			int data = reader.read();
			// 만약, 읽은 1글자 데이터가 -1이면, 반복 멈춤
			if (data == -1) break;
			// 읽은 글자를 대상 파일에 1글자 쓰고
			writer.write(data);
		}	// 반복 끝
		
		// 원본 파일 닫기 (읽기용)
		reader.close();
		// 대상 파일 닫기 (쓰기용)
		writer.close();
		
		System.out.println("파일 복사 완료~!!");
	}
	
}
