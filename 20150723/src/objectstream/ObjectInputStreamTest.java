package objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
	
	public static void main(String[] args) {
		
		try (ObjectInputStream oin = new ObjectInputStream(
				new FileInputStream("member.dat"))) {
			
			Member m = (Member) oin.readObject();
			
			System.out.println(m);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}




























