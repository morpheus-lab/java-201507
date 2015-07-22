package file.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) {
		
		// ���Ϸ� ���� ���� �����͸� �д� ���α׷�
		FileReader reader = null;
		try {
			// 1. ���� ����
			reader = new FileReader("poem.txt");
			
			// 2. ���Ϸ� ���� ������ �б�
			while (true) {
				int c = reader.read();
				if (c == -1) {
					break;
				}
				System.out.print((char) c);
			}
			
		} catch (FileNotFoundException e) {
			// ������ �������� �ʴ� ���
			System.out.println("������ ������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			// read() �߿� ����
			e.printStackTrace();
		} finally {
			// 3. ���� �ݱ�
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {}
			}
		}
		
	}
	
}
