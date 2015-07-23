package datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
	
	public static void main(String[] args) {
		DataOutputStream dout = null;
		try {
			FileOutputStream fout = new FileOutputStream("output2.dat");
			dout = new DataOutputStream(fout);
			
			dout.writeByte(65);
			dout.writeInt(30);
			dout.writeLong(400L);
			dout.writeUTF("DataOutputStream에 의해 기록됨");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dout != null) {
				try {
					dout.close();	// 내부적으로 fout.close() 호출
				} catch (IOException e) {}
			}
		}
		
		DataInputStream din = null;
		try {
			FileInputStream fin = new FileInputStream("output2.dat");
			din = new DataInputStream(fin);
			
			byte b = din.readByte();
			int i = din.readInt();
			long l = din.readLong();
			String str = din.readUTF();
			
			System.out.println(b);
			System.out.println(i);
			System.out.println(l);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (din != null) {
				try {
					din.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}



















