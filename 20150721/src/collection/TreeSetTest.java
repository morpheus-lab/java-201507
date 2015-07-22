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
		// ����: ���� ��ü�� ������ ����
		// 0   : ������ ����
		// ���: ���� ��ü�� ������ ����
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
		
		Set<Fruit> set = new TreeSet<>();	// ����Ǵ� ��ü��
											// compareTo()�޼ҵ带
											// �̿��ؼ� ����
		
		set.add(new Fruit("����", "��/��"));
		set.add(new Fruit("�ٳ���", "���"));
		set.add(new Fruit("����", "����"));
		set.add(new Fruit("����", "���"));
		set.add(new Fruit("�ڸ�", "���"));
		set.add(new Fruit("����", "��/��"));
		set.add(new Fruit("�ź�", "����"));
		
		Iterator<Fruit> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
	
}
