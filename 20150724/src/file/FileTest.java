package file;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) throws Exception {
		
		/*
		File f = new File("D:\\poem.txt");
//		f.createNewFile();
		f.delete();
		*/
		
		// 임시 파일
		File f = File.createTempFile("tmp", ".txt", new File("D:\\tmp"));
		// 프로그램 종료 시 자동 삭제 예약
		f.deleteOnExit();
		
		Thread.sleep(5000);
		
	}
	
}
