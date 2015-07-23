package bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	
	public static void main(String[] args) {
		FileOutputStream out = null;
		
		byte[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
						10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		
		try {
			// 1. ���Ͽ� ����Ʈ �����͸� �� �� �ִ� ��Ʈ�� ����
			out = new FileOutputStream("output.dat");
			// 2. ����Ʈ ������ ����Ʈ ����
			for (int i = 0; i < arr.length; i++) {
				out.write(arr[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. ��Ʈ�� �ݱ�
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
