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
		// try ���� ���� ���� �� �ڵ����� out.close() (finally���� �ϴ� �� ó��)
		
	}
	
}
