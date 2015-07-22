package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		
		list.add("하나");	// index: 0
		list.add("둘");		// index: 1
		list.add("셋");		// index: 2
		list.add("넷");		// index: 3
		list.add("다섯");	// index: 4
		
		System.out.println(list.get(4));
		
	}
	
}
