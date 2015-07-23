package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	
	public static void main(String[] args) {
		try (FileInputStream in = new FileInputStream("output.dat")) {
			
//			System.out.println(in.read());	// 0
//			System.out.println(in.read());	// 1
//			System.out.println(in.read());	// 2
			
			int byteData = -1;
			while ((byteData = in.read()) != -1) {
//				System.out.print(byteData + ",");
//				System.out.print(Integer.toHexString(byteData) + ",");
				System.out.printf("%02x,", byteData);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
