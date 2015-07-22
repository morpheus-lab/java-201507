package list;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("하나");	// index: 0
		list.add("둘");		// index: 1
		list.add("셋");		// index: 2
		list.add("넷");		// index: 3
		list.add("다섯");	// index: 4
		
		System.out.println(list.get(2));
//		System.out.println(list.get(5));	// 에러: 잘못된 인덱스 범위
		
	}
	
}
