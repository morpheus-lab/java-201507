package list;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("�ϳ�");	// index: 0
		list.add("��");		// index: 1
		list.add("��");		// index: 2
		list.add("��");		// index: 3
		list.add("�ټ�");	// index: 4
		
		System.out.println(list.get(2));
//		System.out.println(list.get(5));	// ����: �߸��� �ε��� ����
		
	}
	
}
