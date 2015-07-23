package printwriter;

import java.io.*;
import java.util.*;

class PrintWriterExample1 {
	public static void main(String args[]) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("output.txt");
			writer.println("     *** ����ǥ ***     ");
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "������", 92, 87, 95, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "������", 100, 90, 88, 92.7f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "�ֹ���", 75, 88, 85, 82.7f);
			writer.printf("�ۼ����� : %1$tY�� %1$tm�� %1$td��", new GregorianCalendar());
		} catch (IOException ioe) {
			System.out.print("���Ϸ� ����� �� �����ϴ�.");
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
			}
		}
	}
}
