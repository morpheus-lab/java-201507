package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// 과거 버전 Map으로서, 키/값 모두 null 안됨
//		Map<String, String> map = new Hashtable<>();
		// 키의 해시값을 기준으로 저장
		Map<String, String> map = new HashMap<>();
		// 키의 compareTo()를 이용해 정렬 저장
//		Map<String, String> map = new TreeMap<>();
		// 순서 유지
//		Map<String, String> map = new LinkedHashMap<>();
		
		map.put("하나", "one");
		map.put("둘",   "two");
		map.put("셋",   "three");
		map.put("넷",   "four");
		map.put("다섯", "five");
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
