package systemapi;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemClassTest {
	
	public static void main(String[] args) {
		
//		System.out;	// ǥ�� ��� ��Ʈ��
//		System.in;	// ǥ�� �Է� ��Ʈ��
//		System.err;	// ǥ�� ���� (���) ��Ʈ��
		
		// currentTimeMillis()
		/*
		long start = System.currentTimeMillis();	// ���� �ð��� EPOCH �ð�
		// �ڵ� ����
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "�и��� �ɷ���");
		*/
		
		// JVM���� ������ �÷��� �����ϵ��� ��û
//		System.gc();
		
		// �ý��� ȯ�溯�� ��ȸ
		// System.getenv()
		/*
		Map envs = System.getenv();
		Set keys = envs.keySet();
		for (Object key : keys) {
			System.out.println(key + " = " + envs.get(key));
		}
		*/

		// System.getProperties()
		Properties props = System.getProperties();
		Set propKeys = props.keySet();
		for (Object key : propKeys) {
			if (key.toString().startsWith("os."))
				System.out.println(key + " = " + props.get(key));
		}
		
		// ���� �ý���(OS)�� ����ϰ� �ִ�
		// ���� �����ڸ� ����
		// Windows: \r\n
		// Linux/Unix: \n
		// Mac: \n (�ֽ� MacOS), \r (���� ��� MacOS)
//		System.lineSeparator();
		
	}
	
}


















