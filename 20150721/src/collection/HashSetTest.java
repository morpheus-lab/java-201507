package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();	// HashSet °´Ã¼¸¦
											// Set Å¸ÀÔÀÇ º¯¼ö¿¡ ´ã±â
											// (¾÷Ä³½ºÆÃ)
		
		System.out.println(set.size());
		set.add("»çÀÚ");
		System.out.println(set.size());
		set.add("Ä»°Å·ç");
		System.out.println(set.size());
		set.add("Åä³¢");
		set.add("³«Å¸");
		set.add("È£¶ûÀÌ");
		set.add("Åä³¢");
		
//		System.out.println(set);
		
//		Iterator<String> iter = set.iterator();
//		while (iter.hasNext()) {
//			String e = iter.next();
//			System.out.println(e);
//		}
		
		List<String> list = new ArrayList<>();
		list.add("Æë±Ï");
		list.add("¾ó·è¸»");
		
		set.addAll(list);
		
		System.out.println(set);
		
		System.out.println(set.contains("³«Å¸"));
		
		System.out.println("-----------------------");
		
		Object[] arr = set.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------------");
		
		System.out.println(set);
		
		Iterator<String> iter2 = set.iterator();
		iter2.next();
		String removeItem = iter2.next();
		System.out.println("»èÁ¦ ¾ÆÀÌÅÛ: " + removeItem);
		iter2.remove();
		System.out.println(set);
		
		System.out.println("-----------------------");
		
	}
	
}











