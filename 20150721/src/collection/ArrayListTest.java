package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
//		list.add(new Integer(1));
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		System.out.println(list);
		
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			Integer e = iter.next();
			System.out.println(e);
		}
		
		System.out.println("------------------------");
		ListIterator<Integer> listIter = list.listIterator();
		
		Integer i = listIter.next();
		System.out.println(i);
		
		i = listIter.next();
		System.out.println(i);
		
		i = listIter.next();
		System.out.println(i);
		
		i = listIter.previous();
		System.out.println(i);
		
		i = listIter.previous();
		System.out.println(i);
		
		i = listIter.previous();
		System.out.println(i);
		
	}
	
}







