package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		
		list.add("�ϳ�");	// index: 0
		list.add("��");		// index: 1
		list.add("��");		// index: 2
		list.add("��");		// index: 3
		list.add("�ټ�");	// index: 4
		
		System.out.println(list.get(4));
		
	}
	
}
