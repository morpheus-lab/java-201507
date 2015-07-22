package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// ���� ���� Map���μ�, Ű/�� ��� null �ȵ�
//		Map<String, String> map = new Hashtable<>();
		// Ű�� �ؽð��� �������� ����
		Map<String, String> map = new HashMap<>();
		// Ű�� compareTo()�� �̿��� ���� ����
//		Map<String, String> map = new TreeMap<>();
		// ���� ����
//		Map<String, String> map = new LinkedHashMap<>();
		
		map.put("�ϳ�", "one");
		map.put("��",   "two");
		map.put("��",   "three");
		map.put("��",   "four");
		map.put("�ټ�", "five");
		map.put(null, null);
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String key = keyIter.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
	}
	
}
