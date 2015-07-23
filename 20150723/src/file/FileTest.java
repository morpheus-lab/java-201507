package file;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) {
		
		File dDrive = new File("D:\\");
		
		// dDrive에 있는 파일 목록
		File[] files = dDrive.listFiles();
		
		for (File f : files) {
			if (!f.isHidden()) {
				if (f.isDirectory()) {
					System.out.print("[D] ");
				}
				System.out.printf(" %d ", f.length());
				System.out.println(f.getName());
			}
		}
		
		
	}
	
}
