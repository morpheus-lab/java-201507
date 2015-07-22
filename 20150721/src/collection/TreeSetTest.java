package collection;

import java.util.*;

class Fruit implements Comparable<Fruit> {
	String name;
	String color;
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
	@Override
	public int compareTo(Fruit o) {
		// 음수: 현재 객체의 순위가 높음
		// 0   : 순위가 같음
		// 양수: 현재 객체의 순위가 낮음
//		return name.compareTo(o.name);
		return color.compareTo(o.color);
	}
	@Override
	public String toString() {
		return name + "(" + color + ")";
	}
}

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		Set<Fruit> set = new TreeSet<>();	// 저장되는 객체의
											// compareTo()메소드를
											// 이용해서 정렬
		
		set.add(new Fruit("수박", "녹/빨"));
		set.add(new Fruit("바나나", "노랑"));
		set.add(new Fruit("딸기", "빨강"));
		set.add(new Fruit("망고", "노랑"));
		set.add(new Fruit("자몽", "노랑"));
		set.add(new Fruit("수박", "녹/빨"));
		set.add(new Fruit("거봉", "보라"));
		
		Iterator<Fruit> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
	
}
