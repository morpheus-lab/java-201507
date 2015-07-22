package file.io;

import java.io.*;

public class FileCopyTest {
	
	public static void main(String[] args) throws Exception {
		
		// ���� ���� ���� (�б��)	"poem.txt"
		FileReader reader = new FileReader("poem.txt");
		// ��� ���� ���� (�����)	"poem-copy.txt"
		FileWriter writer = new FileWriter("poem-copy.txt");
		
		// �ݺ� {
		while (true) {
			// ���� ���Ϸκ��� 1���� �а�
			int data = reader.read();
			// ����, ���� 1���� �����Ͱ� -1�̸�, �ݺ� ����
			if (data == -1) break;
			// ���� ���ڸ� ��� ���Ͽ� 1���� ����
			writer.write(data);
		}	// �ݺ� ��
		
		// ���� ���� �ݱ� (�б��)
		reader.close();
		// ��� ���� �ݱ� (�����)
		writer.close();
		
		System.out.println("���� ���� �Ϸ�~!!");
	}
	
}
