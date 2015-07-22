package file.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {
	
	public static void main(String[] args) {
		
		// ���Ϸ� ���� ���� �����͸� �д� ���α׷�
		FileReader reader = null;
		try {
			// 1. ���� ����
			reader = new FileReader("poem.txt");
			
			// 2. ���Ϸ� ���� ������ �б�
			char[] arr = new char[3];
			while (true) {
				int count = reader.read(arr);
				if (count == -1) {
					break;
				}
				// count�� 2�̶��,
				// arr[0] ~ arr[1]�� ��� �ִ� ���ڵ���
				// ���Ӱ� �о���� ���ڵ��̴�.
				for (int i = 0; i < count; i++) {
					System.out.print(arr[i]);
				}
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
