package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {
	
	public static void main(String[] args) {
		
		String fileName = "D:\\test.txt";
		FileInputStream infile = null;
		
		try {
			infile = new FileInputStream(fileName);
			
			int count = 0;
			int ch = -1;
			
			while ((ch = infile.read()) != -1) {	// FileInputStream.read() �޼ҵ�� �ѹ��� �� ����Ʈ�� �о� ��
				count++;
			}
			
			System.out.println(fileName + " ������ ũ��� " + count + "����Ʈ�Դϴ�.");
		} catch (FileNotFoundException e) {
			// infile ��ü ���� ���� ���� �߻�
			System.err.println(fileName + " ������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			// infile.read() ���� ���� �߻�
			System.err.println(fileName + " ���Ϸκ��� �����͸� �д� �߿� ���ܰ� �߻��߽��ϴ�.");
		} finally {
			System.out.println("���� �ݱ� �õ�");
			if (infile != null) {
				try {
					infile.close();
				} catch (IOException e) {}
			}
		}
		
	}
	
}
