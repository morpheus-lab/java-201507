package file;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) throws Exception {
		
		/*
		File f = new File("D:\\poem.txt");
//		f.createNewFile();
		f.delete();
		*/
		
		// �ӽ� ����
		File f = File.createTempFile("tmp", ".txt", new File("D:\\tmp"));
		// ���α׷� ���� �� �ڵ� ���� ����
		f.deleteOnExit();
		
		Thread.sleep(5000);
		
	}
	
}
