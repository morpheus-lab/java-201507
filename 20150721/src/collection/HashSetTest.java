package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();	// HashSet ��ü��
											// Set Ÿ���� ������ ���
											// (��ĳ����)
		
		System.out.println(set.size());
		set.add("����");
		System.out.println(set.size());
		set.add("Ļ�ŷ�");
		System.out.println(set.size());
		set.add("�䳢");
		set.add("��Ÿ");
		set.add("ȣ����");
		set.add("�䳢");
		
//		System.out.println(set);
		
//		Iterator<String> iter = set.iterator();
//		while (iter.hasNext()) {
//			String e = iter.next();
//			System.out.println(e);
//		}
		
		List<String> list = new ArrayList<>();
		list.add("���");
		list.add("��踻");
		
		set.addAll(list);
		
		System.out.println(set);
		
		System.out.println(set.contains("��Ÿ"));
		
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
		System.out.println("���� ������: " + removeItem);
		iter2.remove();
		System.out.println(set);
		
		System.out.println("-----------------------");
		
	}
	
}











