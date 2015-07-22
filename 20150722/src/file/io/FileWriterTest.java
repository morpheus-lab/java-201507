package file.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String[] args) {
		
		// ���Ͽ� ���� �����͸� ����ϴ� ���α׷�
		
		char[] arr = {'H','e','l','l','o',' ','F','i','l','e',' ','I','O'};
		
		FileWriter writer = null;
		try {
			// 1. ���� ����
			writer = new FileWriter("output.txt");
			// 2. ������ ����
			for (int i = 0; i < arr.length; i++) {
				writer.write(arr[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. ���� �ݱ�
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {}
			}
		}
		
		System.out.println("���Ͽ� ���� ��� �Ϸ�");
	}
	
}
