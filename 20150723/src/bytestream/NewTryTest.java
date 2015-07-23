package bytestream;

import java.io.*;

public class NewTryTest {
	
	public static void main(String[] args) {
		
		try (FileOutputStream out = new FileOutputStream("output.dat")) {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// try 구문 빠져 나올 때 자동으로 out.close() (finally에서 하는 것 처럼)
		
	}
	
}
